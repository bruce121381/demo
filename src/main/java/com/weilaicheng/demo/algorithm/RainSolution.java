package com.weilaicheng.demo.algorithm;

/**
 * 有一堆高地不同的柱子,下雨了，能装多少单位的水？
 * <p>
 * author by beijita@weilaicheng.com
 * 2020/2/12
 *
 * @author xiangzhi.meng
 */
public class RainSolution {


    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Integer rain = rain(arr);
        System.out.println(rain);
    }

    public static Integer rain(int[] arr) {

        int start = 0;
        int end = 1;
        int num = 0;
        while (end < arr.length) {

            while (arr[end] < arr[start]) {
                end++;
                if (end == arr.length -1){
                    end = start++;
                }
            }

            int m = end - start;
            //计算面积
            if (m != 0) {
                if (m <= 2) {
                    num += arr[start] * (m - 1);
                }
                if (m > 2) {
                    for (int i = start+1; i < end; i++) {
                        num -= arr[i];
                    }
                    num += arr[start] * (m - 1);
                }
            }
            start = ++end;

        }


        return num;
    }


}
