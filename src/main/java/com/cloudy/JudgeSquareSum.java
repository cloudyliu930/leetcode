package com.cloudy;

/**
 * 题目描述：判断一个数是否为两个数的平方和，例如 5 = 1(2) + 2(2)。
 */
public class JudgeSquareSum {

    public static void main(String[] args) {
        int target = 4;
        boolean flag = judgeSquareSum(target);
        System.out.println(flag);
    }

    private static boolean judgeSquareSum(int sum) {
        int left = 0;
        int right = (int)Math.sqrt(sum);
        while (left <= right) {
            int n = left * left + right * right;
            if (n == sum) {
                return true;
            } else if (n > sum) {
                right --;
            } else {
                left ++;
            }
        }

        return false;
    }

}
