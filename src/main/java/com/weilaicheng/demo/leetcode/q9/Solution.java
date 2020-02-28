package com.weilaicheng.demo.leetcode.q9;

/**
 * 判断一个数是否是回文数
 * <p>
 * author by beijita@weilaicheng.com
 * 2020/2/20
 *
 * @author xiangzhi.meng
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(isHui(121));
    }

    /**
     * 判断一个数是否是回文数
     * 123321 --> true
     * 123 --> false
     *
     * @param n
     * @return
     */
    public static boolean isHui(int n) {

        //如果为负数就不是回文数
        if (n < 0) {
            return false;
        }

        int reply = n;
        int ret = 0;
        while (n != 0) {
            int pop = n % 10;
            n /= 10;
            ret = ret * 10 + pop;
        }
        if (ret == reply) {
            return true;
        }


        return false;
    }


}
