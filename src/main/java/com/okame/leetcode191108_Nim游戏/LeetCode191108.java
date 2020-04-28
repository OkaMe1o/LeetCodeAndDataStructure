package com.okame.leetcode191108_Nim游戏;

import org.junit.Test;

/**
 * @ClassName LeetCode191108
 * @Description TODO
 * @Author OkaMe1o
 * @Date 2019/11/2,16:16
 * @Version 1.0
 */
public class LeetCode191108 {
    /**
     * 292.Nim游戏
     * 你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
     * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/nim-game
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 思路：我总是奇数，朋友是偶数，拿走石头数是1-3，我赢的情况是奇数次拿完，
     *
     * @param n 石头数
     * @return 能否赢
     */
    public boolean canWinNim(int n) {
        return n%4!=0;
    }

    @Test
    public void test() {
        System.out.println(canWinNim(4));
    }
}
