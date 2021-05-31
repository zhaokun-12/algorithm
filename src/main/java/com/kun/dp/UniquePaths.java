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

    }
    public int uniquePaths(int m, int n) {
        if (m == 1 || n ==1) {
            return 1;
        }

        Map<String, Integer> map = new HashMap<>();
        int i = 2, j = 2;
        while (i != m && j != n) {

        }
        return  uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
}
