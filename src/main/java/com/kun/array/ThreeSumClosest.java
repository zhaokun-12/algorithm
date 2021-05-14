package com.kun.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Description
 * 16. 3Sum Closest
 * 找出三个数字之和最接近 target，并返回和
 * @Author zhaokun
 * @Date 2021/5/14
 * @Version 1.0
 **/
public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest2(new int[]{1,3,6,7}, 13));
    }

    /**
     * 暴力解
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Set<Integer> set = new HashSet<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            for (int i1 = i + 1; i1 < length; i1++) {
                for (int i2 = i1 + 1; i2 < length; i2++) {
                    int sum = nums[i] + nums[i1] + nums[i2];
                    if (Math.abs(sum - target) < Math.abs(res - target)) {
                        res = sum;
                    }
                }
            }
        }
        return res;
    }

    /**
     * 前后指针
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest2(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; (i < length) && (diff != 0); i++) {
            int first = i + 1, last = length - 1;
            while (first < last) {
                int sum = nums[i] + nums[first] + nums[last];
                if (Math.abs(sum - target) < Math.abs(diff)) {
                    diff = sum - target;
                }
                if (sum < target) {
                    first++;
                } else {
                    last--;
                }
            }

        }
        return target + diff;
    }
}
