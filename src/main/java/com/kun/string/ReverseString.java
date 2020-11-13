package com.kun.string;

/**
 * @Description
 * 344. Reverse String
 * @Author zhaokun
 * @Date 2020/11/2
 * @Version 1.0
 **/
public class ReverseString {
    public static void main(String[] args) {

    }
    //字符串翻转
    public static void reverseString1(char[] s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }
        StringBuilder reverse = sb.reverse();
        for (int i = 0; i < reverse.length(); i++) {
            s[i] = reverse.charAt(i);
        }
    }
    //数组元素交换
    public static void reverseString3(char[] s){
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
