package com.okame.leetcode191101_分割平衡字符串;

/**
 * @ClassName LeetCode191101
 * @Description 1221.分割平衡字符串
 * @Author OkaMe1o
 * @Date 2019/11/1,11:56
 * @Version 1.0
 */
public class LeetCode191101 {
    public static void main(String[] args) {
        String str = "LRRRLLRLLLRRLLLRRRLRRL";
        System.out.println(balancedStringSplit(str));
    }

    //思路：设置一个计数器，作为切割的平衡点，即因为LR左右平衡，故计数器在分割点此时为0，再设置res作为结果输出
    public static int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            //更为简洁的写法
            if (("L".equals(String.valueOf(s.charAt(i)))?count++:count--)==0){
                res++;
            }

            //比较详细的写法
            /*
            //设置字符串接收传入字符串分割出来的char字符
            String str = String.valueOf(s.charAt(i));
            //把分割出来的字符与"L"和"R"比较
            if ("L".equals(str)) {
                count++;
            }
            if ("R".equals(str)) {
                count--;
            }
            //当到平衡点时res++
            if (count==0){
                res++;
            }
            */
        }
        return res;
    }
}
