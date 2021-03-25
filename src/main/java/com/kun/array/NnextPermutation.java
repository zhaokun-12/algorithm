package com.kun.array;

import java.util.Arrays;

/**
 * @Description
 * 31. Next Permutation
 * 下一个更大的排列组合 如果没有就最小的组合
 * @Author zhaokun
 * @Date 2021/3/24
 * @Version 1.0
 **/
public class NnextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[]{1,5,1});
    }
    public static void nextPermutation(int[] nums) {
        int minRight = nums[nums.length - 1];
        int start = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= minRight) {
                minRight = nums[i];
            } else {
                //一旦出现小于右边的数字，证明有比当前排列更小的数，需要寻找右边比自己大且在其中最小的数字进行交换
                int current = nums[i];
                for (int j = i + 1; j < nums.length; j++){
                    if (nums[j] > current ) {
                        if (j == nums.length - 1) {
                            int temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                            break;
                        } else {
                            //nothing
                        }
                    } else {
                        //记录当前需要交换的坐标
                        int temp = nums[j - 1];
                        nums[j -1] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
                start = i + 1;
                break;
            }
        }
        //这里陷入了一个误区，交换过数字之后，右边的数字可能不是最小的，想的是使用递归实现，这里直接进行排序就可以
        Arrays.sort(nums, start, nums.length);
    }

}
