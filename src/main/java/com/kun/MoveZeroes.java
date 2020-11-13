package com.kun;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/10/29
 * @Version 1.0
 **/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        moveZeroes(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int numZeroes = 0;
        int index = 0;
        for (int num : nums) {
            if (num == 0) {
                numZeroes++;
            } else {
                result[index++] = num;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }

    }
}
