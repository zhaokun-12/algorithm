package com.kun;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  268. Missing Number
 * @Author zhaokun
 * @Date 2020/10/29
 * @Version 1.0
 **/
public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {3,0,1};
        int i = missingNumber2(array);
        System.out.println(i);
    }
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= size; i++) {
            list.add(i);
        }
        for (int num : nums) {
            list.remove(new Integer(num));
        }
        return list.get(0);
    }
    public static int missingNumber2(int[] nums) {
        int size = nums.length;
        int sum = (size + 1) * size / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;

    }
}
