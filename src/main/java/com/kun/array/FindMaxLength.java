package com.kun.array;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * 前缀和
 * 525. 连续数组
 * @Author zhaokun
 * @Date 2021/6/3
 * @Version 1.0
 **/
public class FindMaxLength {
    private static Thread thread;
    private static int count = 5;

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                FindMaxLength.count = 4;
                while (true) {
                    System.out.println(Thread.currentThread() + "::" + FindMaxLength.count);
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                FindMaxLength.count = 3;
                while (true) {
                    System.out.println(Thread.currentThread() + "::" +  FindMaxLength.count);
                }
            }
        };
        thread.start();
        thread2.start();
        while (true) {
            System.out.println(count);
        }

    }
    public static void feel() {
        System.out.println("feel 1111");
    }
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int sum = 0, res = 0;
        // 转换为连续子数组和为0的题目
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                res = Math.max(i - map.get(sum), res);
            } else {
                map.put(sum, i);
            }
        }
        return res;
    }
}
