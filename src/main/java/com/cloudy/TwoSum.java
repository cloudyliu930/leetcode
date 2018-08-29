package com.cloudy;

import java.util.Arrays;

/**
 * 求数组中两数之和为给定值的元素下标
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,7};
        int target = 9;
        int[] result = twoSum(nums, target);
        Arrays.stream(result).forEach((s) -> System.out.println(s));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left ++;
            } else {
                right --;
            }
        }

        return new int[]{};
    }

}
