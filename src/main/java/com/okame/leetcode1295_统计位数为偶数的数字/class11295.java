package com.okame.leetcode1295_统计位数为偶数的数字;

/**
 * @author: OkaMe1o
 * @classBelongTo: LeetCodeTime.com.jie.leetcode1295_统计位数为偶数的数字
 * @description: TODO
 * @createTime: 2020/1/26 12:09
 * @version: 1.0
 */
public class class11295 {
    public static void main(String[] args) {
        int[] nums = {3, 44, 101, 1060, 12802};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += Integer.toString(nums[i]).length() % 2 != 1 ? 1 : 0;
        }
        return count;
    }
}
