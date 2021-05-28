package com.kun.array;

/**
 * @Description
 * 45. Jump Game II
 * @Author zhaokun
 * @Date 2021/5/26
 * @Version 1.0
 **/
public class Jump {
    public static void main(String[] args) {
        Jump jump = new Jump();
        jump.jump(new int[] {1});
    }
    public int jump(int[] nums) {
        int step = 1;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length;) {
            int num = nums[i];
            if (num >= nums.length -1 - i) {
                // 可以跨到最后
                return step;
            }
            int stepLength = 1; //这一步加下一步最远跨的距离
            int stepLengthIndex = 1; //应该跨到哪里
            // 选择跨几步
            for (int i1 = 1; i1 <= num; i1++) {
                int max = nums[i + i1] + i1;
                if (max >= stepLength) {
                    // 至少走进一次
                    stepLength = max;
                    stepLengthIndex = i1;
                }
            }
            // 跨过去
            i += stepLengthIndex;
            step++;
        }

        return step;
    }
}
