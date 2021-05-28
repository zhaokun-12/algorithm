package com.kun.dp;

/**
 * @Description
 * 5. Longest Palindromic Substring
 * 最长回文字符串
 * @Author zhaokun
 * @Date 2021/5/24
 * @Version 1.0
 **/
public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String babad = longestPalindrome.longestPalindrome2("babad");
        System.out.println(babad);
    }
    // 暴力解法
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > -1; i--) {
            for (int i1 = 0; i1 < s.length() - i + 1; i1++) {
                String substring = s.substring(i1, i1 + i);
                if (isPalindromic(substring)) {
                    return substring;
                }
            }
        }
        return "";
    }
    // 从中心向外扩散
    public String longestPalindrome2(String s) {
        int length = s.length();
        String res = "";
        for (int i = 0; i < length - 1; i++) {
            // 单核子串，长度为奇数
            String longestPalindrome = findLongestPalindrome(s, i, i);
            if (longestPalindrome.length() > res.length()) {
                res = longestPalindrome;
            }
            // 双核子串，长度为偶数
            String longestPalindrome1 = findLongestPalindrome(s, i, i + 1);
            if (longestPalindrome1.length() > res.length()) {
                res = longestPalindrome1;
            }
        }
        return res;
    }
    public String findLongestPalindrome (String s, int i, int j) {
        while (i >= 0 && j <= s.length() - 1) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        String substring = s.substring(i, j + 1);
        return substring;
    }
    public boolean isPalindromic(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String string = stringBuilder.reverse().toString();
        return string.equals(s);
    }
}
