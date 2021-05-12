package com.kun.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * @Author zhaokun
 * 387. First Unique Character in a String
 * @Date 2021/5/12
 * @Version 1.0
 **/
public class FirstUniqChar {
    public static void main(String[] args) {
        firstUniqChar("loveleetcode");
    }
    public static int firstUniqChar(String s) {
        if (s == null) {
            return -1;
        }
        //value 为出现次数
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // find the index
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        if (s == null) {
            return -1;
        }
        //value 为出现次数
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        // find the index
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
