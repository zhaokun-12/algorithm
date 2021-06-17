package com.kun.array;

/**
 * @Description
 * 494. 目标和
 *
 * 原问题等同于： 找到nums一个正子集和一个负子集，使得总和等于target
 *
 * 我们假设P是正子集，N是负子集 例如： 假设nums = [1, 2, 3, 4, 5]，target = 3，一个可能的解决方案是+1-2+3-4+5 = 3 这里正子集P = [1, 3, 5]和负子集N = [2, 4]
 *
 * 那么让我们看看如何将其转换为子集求和问题：
 *
 *                   sum(P) - sum(N) = target
 * sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
 *                        2 * sum(P) = target + sum(nums)
 * @Author zhaokun
 * @Date 2021/6/9
 * @Version 1.0
 **/
public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int target) {
        int res = 0, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int p = sum + target;
        if ((p & 1) == 1) {
            return 0;
        }
        p /= 2; // sum(P) = p
        return subsetSum(nums, p);
    }
    public int subsetSum(int[] nums, int s) {
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int n : nums)
            for (int i = s; i >= n; i--)
                dp[i] += dp[i - n];
        return dp[s];
    }
}
