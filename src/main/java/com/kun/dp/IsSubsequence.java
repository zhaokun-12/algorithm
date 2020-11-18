package com.kun.dp;

/**
 * @Description
 * 392. Is Subsequence
 * @Author zhaokun
 * @Date 2020/11/18
 * @Version 1.0
 **/
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence2(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int indexTemp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            t = t.substring(indexTemp, t.length());
            int i1 = t.indexOf(c);
            if(i1 < 0){
                return false;
            }
            indexTemp = i1 + 1;
        }
        return true;
    }

    public static boolean isSubsequence2(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while (tIndex < t.length()) {
            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                if(++sIndex >= s.length()) {
                    return true;
                }
            }
            tIndex++;
        }
        return false;
    }
}
