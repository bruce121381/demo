package com.weilaicheng.demo.algorithm;

/**
 * 求解斐波那契数列的动态规划
 * 利用递归的方式求解 ---> 时间复杂度为O(2^n)
 * 利用动态规划求解 ---> 时间复杂度为O(n)
 * <p>
 * author by beijita@weilaicheng.com
 * 2020/2/14
 *
 * @author xiangzhi.meng
 */
public class FibSolution {


    public static int fib(int n) {

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int fib = fib(6);
        System.out.println(fib);
    }

}
