package com.kun.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * 523. 连续的子数组和
 * @Author zhaokun
 * @Date 2021/6/2
 * @Version 1.0
 **/
public class CheckSubarraySum {
    public static void main(String[] args) {
        new CheckSubarraySum().checkSubarraySum(new int[]{23,2,4,6,7}, 6);
        new CheckSubarraySum().checkSubarraySum(new int[]{1,0,1,0,1}, 4);
    }

    /**
     * a % k = mod
     * b % k = mod
     * 则 (a - b) % k = 0
     * 题目且要求 |ai - bi| > 1
     * @param nums
     * @param k
     * @return
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2) return false;
        for(int i = 0; i < nums.length-1; ++i)
            if(nums[i] == 0 && nums[i+1] == 0) return true;
        if(k == 0) return false;
        if(k < 0) k = -k;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int i = 0;
        int sum = 0;
        while (i < nums.length) {
            sum += nums[i];
            int mod = sum % k;
            if (map.containsKey(mod)) {
                if (i - map.get(mod) > 1) {
                    return true;
                }
            } else {
                map.put(mod, i);
            }
            i++;
        }
        return false;
    }
}
