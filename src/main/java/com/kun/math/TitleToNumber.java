package com.kun.math;

/**
 * @Description
 * 171. Excel Sheet Column Number
 * @Author zhaokun
 * @Date 2021/3/24
 * @Version 1.0
 **/
public class TitleToNumber {
    public static void main(String[] args) {
        int z = titleToNumber("ab");
        System.out.println(z);
    }
    public static int titleToNumber(String columnTitle) {
        if(columnTitle == null || columnTitle.length() == 0) return 0;
        int result = 0;
        columnTitle = columnTitle.toUpperCase();
        for (int i = 0; i < columnTitle.trim().length(); i++) {
            //从最后一位开始取值
            char c = columnTitle.charAt(columnTitle.trim().length() - 1 - i);
            result += (c - 'A' + 1) * Math.pow(26, i);
        }
        return result;
    }
}
