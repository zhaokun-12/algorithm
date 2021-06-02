package com.kun.dp;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * 62. Unique Paths
 * @Author zhaokun
 * @Date 2021/5/28
 * @Version 1.0
 **/
public class UniquePaths {
    public static void main(String[] args) {
       System.out.println(new UniquePaths().uniquePaths2(10, 10));
    }
    public int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
            }
        }
        return res[m-1][n-1];
    }

    /**
     * 排列組合  一共需要m+n-2 步， 其中m-1步向下
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths2(int m, int n) {
        int c = m + n -2;
        int p = m - 1;
        long r1 = 1;
        long r2 = 1;
        for (int i = 1; i <= m - 1; i++) {
            r1 *= i;
            r2 *= c - (i - 1);
        }
        return (int)(r2 / r1);
    }

}
