package com.weilaicheng.demo.leetcode.q7;

/**
 * 将整数反转
 * author by beijita@weilaicheng.com
 * 2020/2/13
 *
 * @author xiangzhi.meng
 */
public class Solution {


    /**
     * 整数反转 123 -> 321
     * -123 -> -321
     * 120 -> 21
     *
     * @param x
     * @return
     */
    public static Integer reterse(int x) {
        int ret = 0;
        while (x !=0){
            int w = x % 10;
            x /= 10;
            //判断溢出
            if (ret > Integer.MAX_VALUE/10 || (ret == Integer.MAX_VALUE / 10 && w > 7)) return 0;
            if (ret < Integer.MIN_VALUE/10 || (ret == Integer.MIN_VALUE / 10 && w < -8)) return 0;
            ret = ret * 10 + w;
        }


        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reterse(2147483647));
    }

}
