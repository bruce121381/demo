package com.weilaicheng.demo.fork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * author by beijita@weilaicheng.com
 * 2020/1/12
 *
 * @author xiangzhi.meng
 */
public class Main {


    public static void main(String[] args) {
        int ss = 1;
        int nn = 1001;
        ForkJoinPool fjp = new ForkJoinPool();
        Future<Integer> result = fjp.submit(new MyForkJoinTask(ss,nn));

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }


}
