package com.weilaicheng.demo.leetcode.q69;

/**
 * 求一个数的平方根
 * author by beijita@weilaicheng.com
 * 2020/2/20
 *
 * @author xiangzhi.meng
 */
public class Solution {


    public static void main(String[] args) {
        System.out.println(squre(2));
    }

    public static int squre(int n) {
        int s = 0;
        int e = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int square = mid * mid;
            if (square > n) {
                e = mid - 1;
            } else if (square < n){
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return e;
    }


}
