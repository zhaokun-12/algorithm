package com.kun.string;

/**
 * @Description
 * 58. Length of Last Word
 * @Author zhaokun
 * @Date 2020/11/2
 * @Version 1.0
 **/
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = " work";
        System.out.println(lengthOfLastWord2(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if(s1.length < 1){
            return 0;
        }
        return s1[s1.length - 1].length();
    }
    public static int lengthOfLastWord2(String s) {
        int length = 0;
        boolean nextWord = true;
        for (int i = 0; i < s.length(); i++) {
            if (' ' == (s.charAt(i))) {
                nextWord = true;
            } else if(nextWord) {
                length = 1;
                nextWord = false;
            } else {
                length++;
            }
        }
        return length;
    }
    public static int lengthOfLastWord3(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && length != 0){
                break;
            }
            if (' ' != (s.charAt(i))) {
                length++;
            }
        }
        return length;
    }
}
