package com.kun.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * 198. House Robber
 * @Author zhaokun
 * @Date 2020/11/9
 * @Version 1.0
 **/
public class Rob {
    public static void main(String[] args) {
        int[] nums = {1,1,3,6,7,10,7,1,8,5,9,1,4,4,3};

        System.out.println(doRob(nums));
    }
    public static int rob(int[] nums) {
        return doRob2(nums);
    }
    //暴力递归
    public static int doRob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int val = nums[0];
        int[] array1 = new int[nums.length - 1];
        int[] array2 = new int[nums.length - 2];
        System.arraycopy(nums, 1, array1, 0, array1.length);
        System.arraycopy(nums, 2, array2, 0, array2.length);
        return Math.max(doRob(array1), val + doRob(array2));
    }
    //备忘录
    public static int doRob(int[] nums, Map<Integer, Integer> map) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        if (map.containsKey(nums.length)) {
            return map.get(nums.length);
        } else {
            int val = nums[0];
            int[] array1 = new int[nums.length - 1];
            int[] array2 = new int[nums.length - 2];
            System.arraycopy(nums, 1, array1, 0, array1.length);
            System.arraycopy(nums, 2, array2, 0, array2.length);
            int value = Math.max(doRob(array1, map), val + doRob(array2, map));
            map.put(nums.length, value);
            return value;
        }
    }
    public static int doRob2(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] runningTotal = new int[nums.length];
        runningTotal[0] = nums[0];
        runningTotal[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            runningTotal[i] = Math.max(nums[i] + runningTotal[i - 2], runningTotal[i - 1]);
        }
        return runningTotal[runningTotal.length - 1];
    }
}
