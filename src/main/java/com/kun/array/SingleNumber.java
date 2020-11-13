package com.kun.array;

/**
 * @Description
 * 136. Single Number
 * 137. Single Number II
 * @Author zhaokun
 * @Date 2020/11/5
 * @Version 1.0
 **/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4,5,4,5};
        singleNumber2(nums);
    }
    //只有一个数出现奇数次
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
    //只有两个数  出现奇数次， 其它都出现偶数次
    public static int singleNumber2(int[] nums) {
        int eor = 0;
        for (int num : nums) {
            eor ^= num;
        }
        //eor = a ^ b;
        int rightOne = eor & ((~eor) + 1); //找出与右边的1  假设在第n位 ,
        int onlyOne = eor;
        for (int num : nums) {
            if((num & rightOne) != 0){  // 异或所有n位是1 的数， a,b两个数必然是一个在这个区间内
                onlyOne ^= num;
            }
        }
        System.out.println(onlyOne + " " + (onlyOne ^ eor));
        return 0;
    }
}
