package com.weilaicheng.demo.fork;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/12
 *
 * @author xiangzhi.meng
 */
@Slf4j
public class MyForkJoinTask extends RecursiveTask<Integer> {

    protected int start;
    protected int end;

    public MyForkJoinTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //fork/join任务
    @Override
    protected Integer compute() {

        int m = 2000, s = start, n = end, r = 0;
        List<ForkJoinTask<Integer>> lt = new ArrayList<>();

        do {

            if (n - s < m * 1.5f) {
                for (int i = s; i <= n; i++) {
                    r += i;
                }
            } else {
                n = Math.min(s + m - 1, n);
                lt.add(new MyForkJoinTask(s, n).fork());
            }

            s = n + 1;
            n = end;
            System.out.println(Thread.currentThread().getName());
        } while (s <= end);

        for (ForkJoinTask<Integer> t : lt) {
            r += t.join();
        }

        return r;
    }
}
