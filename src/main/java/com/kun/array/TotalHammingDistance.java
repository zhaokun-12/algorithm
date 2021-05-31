package com.kun.array;

/**
 * @Description
 * 477. 汉明距离总和
 * @Author zhaokun
 * @Date 2021/5/28
 * @Version 1.0
 **/
public class TotalHammingDistance {
    /**
     * 不能使用双重for 循环暴力解法
     * 获取每个元素最后一位二进制数字， 距离为 0的数量 * 1 的数量
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int length = nums.length;
        int res = 0;
        int k = 32;
        while (k > 0) {
            int oneNum = 0;
            int temp = 0;
            for (int i = 0; i < length; i++) {
                oneNum += nums[i] & 1;
                temp += (nums[i] == 0) ? 1 : 0;
                nums[i] >>= 1;
            }
            res += oneNum * (length - oneNum);
            if (temp == length) return res;
            k--;
        }
        return res;
    }
}
