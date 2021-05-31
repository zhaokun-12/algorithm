package com.kun.array;

import java.util.Arrays;

/**
 * @Description
 * 164. Maximum Gap
 * @Author zhaokun
 * @Date 2021/5/31
 * @Version 1.0
 **/
public class MaximumGap {
    public static void main(String[] args) {
        new MaximumGap().maximumGap(null);
    }
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i] - nums[i - 1]);
        }
        return max;
    }
}
