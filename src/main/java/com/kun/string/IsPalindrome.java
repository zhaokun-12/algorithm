package com.kun.string;

/**
 * @Description
 * 125. Valid Palindrome
 * @Author zhaokun
 * @Date 2020/11/2
 * @Version 1.0
 **/
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        return buildString(s, true).equals(buildString(s, false));
    }
    public static String buildString(String s, boolean forward) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        if (forward){
            // 正向
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if((c >= 48 && c <= 57) || (c >= 97 && c <= 122)){
                    //数字或者字母
                    sb.append(c);
                }
            }
        } else {
            // 反向
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if((c >= 48 && c <= 57) || (c >= 97 && c <= 122)){
                    //数字或者字母
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
    public static boolean isPalindrome2(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            Character leftChar = null;
            for (; left <= right; left++) {
                char c = s.charAt(left);
                if(c >= 65 && c <= 90){
                    //转小写
                    c += 32;
                }

                if((c >= 48 && c <= 57) || (c >= 97 && c <= 122)){
                    leftChar = c;
                    break;
                }
            }

            Character rightChar = null;
            for (; right >= left; right--) {
                char c = s.charAt(right);
                if(c >= 65 && c <= 90){
                    //转小写
                    c += 32;
                }

                if((c >= 48 && c <= 57) || (c >= 97 && c <= 122)){
                    rightChar = c;
                    break;
                }
            }
            if(leftChar == null || rightChar == null){
                //没有有效字符
                return true;
            }
            if(leftChar.equals(rightChar)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
