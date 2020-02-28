package com.weilaicheng.demo.fork;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/13
 *
 * @author xiangzhi.meng
 */
public class QuickSortForForkJoinPool extends RecursiveAction {

    private int a[];
    private int start;
    private int end;

    public QuickSortForForkJoinPool(int[] a, int start, int end) {
        this.a = a;
        this.start = start;
        this.end = end;
    }

    // TODO: 2020/1/13 有bug fffff 回去优化快排
    @Override
    protected void compute() {

        int pivot = partition(a, start, end);
        QuickSortForForkJoinPool task1 = null;
        QuickSortForForkJoinPool task2 = null;
        if (pivot - start > 1) {
            task1 = new QuickSortForForkJoinPool(a, start, pivot - 1);
            task1.fork();
        }
        if (start - pivot > 1) {
            task2 = new QuickSortForForkJoinPool(a, pivot + 1, end);
            task2.fork();
        }
        if (task1 != null && !task1.isDone()) {
            task1.join();
        }
        if (task2 != null && !task2.isDone()) {
            task2.join();
        }

    }

    private int partition(int[] a, int start, int end) {
        int pivot = a[start];
        while (start < end) {
            while (start < end && a[end] >= pivot) {
                end--;
            }
            while (start < end && a[start] <= pivot) {
                start++;
            }
            swap(a,start,end);

        }
        return start;
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args) {
        int a[] = {4,2,1,4,7,5,3,8,2,7,1,78,69,6,5,4,8,5};
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        QuickSortForForkJoinPool task = new QuickSortForForkJoinPool(a,0,a.length-1);
        ForkJoinTask<Void> submit = forkJoinPool.submit(task);
        try {
            submit.get();
            System.out.println(Arrays.toString(a));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
