package com.kun.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description
 * 318. Maximum Product of Word Lengths
 * @Author zhaokun
 * @Date 2021/5/28
 * @Version 1.0
 **/
public class MaxProduct {
    // 暴力求解
    public int maxProduct(String[] words) {
        int length = words.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (isContainSameLetter(words[i], words[j]) == false) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
    public boolean isContainSameLetter(String s1, String s2) {
        char[] chars = s1.toCharArray();
        Set<Character> set = new HashSet<>(chars.length);
        for (char aChar : chars) {
            set.add(aChar);
        }
        for (int i = 0; i < s2.length(); i++) {
            boolean contains = set.contains(s2.charAt(i));
            if (contains == true) {
                return true;
            }
        }
        return false;
    }
    // 位运算
    public int maxProduct2(String[] words) {
        int length = words.length;
        int [] bitset = new int[length];
        int max = 0;
        for (int i = 0; i < length; i++) {
            String word = words[i];
            int bit = 0;
            for (int j = 0; j < word.length(); j++) {
                bit |= 1 << (word.charAt(j) - 'a');
            }
            for (int j = 0; j < i; j++) {
                if ((bit & bitset[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
            bitset[i] = bit;
        }
        return max;
    }
}
