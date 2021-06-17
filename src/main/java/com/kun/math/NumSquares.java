package com.kun.math;

import java.nio.file.Files;

/**
 * @Description
 * 279. 完全平方数
 * @Author zhaokun
 * @Date 2021/6/11
 * @Version 1.0
 **/
public class NumSquares {
    public static void main(String[] args) {
        NumSquares numSquares = new NumSquares();
        numSquares.numSquares(12);

    }
    static int num = 0;
    public int numSquares(int n) {
        if (n == 0) {
            return num;
        }
        int floor = (int)Math.floor(Math.sqrt(n));
        return numSquares(n - floor);
    }
}
