package com.kun;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/10/29
 * @Version 1.0
 **/
public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 1};

        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        int[] ints = Arrays.stream(nums).distinct().sorted().toArray();
        if(ints.length > 2){
            return ints[ints.length - 3];
        } else {
            return ints[ints.length - 1];
        }
    }
}
