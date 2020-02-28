package com.weilaicheng.demo.leetcode.q15;

import java.util.ArrayList;
import java.util.List;

/**
 * 求三数之和为0
 * <p>
 * author by beijita@weilaicheng.com
 * 2020/2/17
 *
 * @author xiangzhi.meng
 */
public class San {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> retList = new ArrayList<>();
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> midList = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        midList.add(nums[i]);
                        midList.add(nums[j]);
                        midList.add(nums[k]);
                        retList.add(midList);
                    }

                }
            }
        }
        return retList;
    }

}
