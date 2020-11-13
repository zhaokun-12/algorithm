package com.kun.dp;

import java.util.Map;

/**
 * @Description
 * 70. Climbing Stairs
 * @Author zhaokun
 * @Date 2020/11/9
 * @Version 1.0
 **/
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n - 2);
    }
    //备忘录
    public int climbStairs1(int n, Map<Integer, Integer> map) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            map.put(n, climbStairs1(n - 1, map) + climbStairs1(n - 2, map));
            return map.get(n);
        }
    }
    //动态规划
    public int climbStairs2(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int value = 0;
        for (int i = 3; i <= n; i++) {
            value = a + b;
            a = b;
            b = value;
        }
        return value;
    }
}
