package com.okame.leetcode191028_数组互猜;

import java.util.Random;

/**
 * @ClassName LeetCode191028
 * @Description 数组互猜
 * @Author OkaMe1o
 * @Date 2019/10/28,15:04
 * @Version 1.0
 */
class LeetCode191028 {
    public static void main(String[] args) {
        int[] guess = new int[3];
        int[] answer = new int[3];
        System.out.println("猜对了" + new LeetCode191028().game(guess, answer) + "次");
        System.out.println(20 >> 2);
        System.out.println(new LeetCode191028().getSum(6, 1, 3));
    }

    /**
     * 可变参数
     *
     * @param nums
     * @return 总和
     */
    public int getSum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * 猜数字
     *
     * @param guess  猜数
     * @param answer 答案
     * @return 猜对的总数
     */
    public int game(int[] guess, int[] answer) {
        Random rd = new Random();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            guess[i] = rd.nextInt(3) + 1;
            answer[i] = rd.nextInt(3) + 1;
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }
}
