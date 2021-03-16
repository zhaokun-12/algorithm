package com.kun.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * 228. Summary Ranges
 * @Author zhaokun
 * @Date 2021/3/4
 * @Version 1.0
 **/
public class SummaryRanges {
    public static void main(String[] args) {
        //参数排序数组
        int[] nums = new int[]{-2147483648,-2147483647,2147483647};
        summaryRanges(nums);
    }
    public static List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList();
        }
        List<String> res = new ArrayList();
        StringBuilder sb = new StringBuilder("");

        int temp = nums[0];
        sb.append(temp);
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                //连续数字
                if (sameSymbol(nums[i], temp) && nums[i] - temp == 1) {
                    if(i == nums.length - 1) {
                        //连续数字 循环到最后一个元素不会再触发下一次else，提前拼接
                        sb.append("->").append(nums[i]);
                    }
                } else {
                    //非连续
                    if(Integer.parseInt(sb.toString()) != temp) {
                        //防止i=1 的时候不连续 [0,2 ,3]  导致 sb = "0->0"
                        sb.append("->").append(temp);
                    }
                    res.add(sb.toString());
                    sb = new StringBuilder("" + nums[i]);
                }
                temp = nums[i];

            }
        }
        res.add(sb.toString());
        return res;
    }

    private static boolean sameSymbol(int a, int b) {
        if((a < 0 && b < 0) || (a > 0 || b > 0)) return true;
        return false;
    }
}
