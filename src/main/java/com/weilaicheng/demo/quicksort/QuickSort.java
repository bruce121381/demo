package com.weilaicheng.demo.quicksort;

import java.util.Arrays;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/15
 *
 * @author xiangzhi.meng
 */
public class QuickSort {


    /**
     * 快排 ---> 分而治之 ---> 双边循环
     *
     * @param array
     * @param startIndex
     * @param endIndex
     */
    public static void quickSort(int array[], int startIndex, int endIndex) {

        //递归跳出条件
        if (startIndex >= endIndex) {
            return;
        }

        //获取基准元素
        int pivot = partition(array, startIndex, endIndex);

        //分而治之
        quickSort(array, startIndex, pivot - 1);
        quickSort(array, pivot + 1, endIndex);


    }

    /**
     * 选取基准元素
     *
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition(int[] array, int startIndex, int endIndex) {

        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;

        //控制指针移动
        while (left != right) {
            //右指针向左
            while (left < right && array[right] >= pivot) {
                right--;
            }
            //左指针向右
            while (left < right && array[left] <= pivot) {
                left++;
            }
            if (left < right) {
                int p = array[left];
                array[left] = array[right];
                array[right] = p;
            }
        }

        //左右指针重合 ---> 一轮结束标志:基准元素放到指定位置
        array[startIndex] = array[left];
        array[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int array[] = new int[]{9, 5, 2, 8, 3, 6, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}
