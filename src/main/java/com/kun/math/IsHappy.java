package com.kun.math;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * 202. Happy Number   数字平方和为1
 * @Author zhaokun
 * @Date 2021/1/11
 * @Version 1.0
 **/
public class IsHappy {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        while (true) {
            if (n == 1){
                return true;
            } else {
                if(set.add(n) == false){
                    return false;
                }
                n = squareSum(n);
            }
        }
    }
    public static int squareSum(int n) {
        int sum = 0;
        int m = n;
        int temp;
        while (m > 0){
            temp = m % 10;
            sum += Math.pow(temp, 2);
            m /= 10;
        }
        return sum;
    }
}
