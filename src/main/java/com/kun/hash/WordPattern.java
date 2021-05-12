package com.kun.hash;

import java.util.*;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/5/11
 * @Version 1.0
 **/
public class WordPattern {
    public static void main(String[] args) {
        boolean b = wordPattern("abba",
                "dog cat cat dog");
        System.out.println(b);

        int sqrt =(int) Math.ceil(Math.sqrt(10));
        int count = 0;
        for (int i = 2; i < sqrt; i++) {
            for (int i1 = 2; i1 < i - 1; i1++) {
                if (i % i1 == 0) {
                    continue;
                }
            }
            count++;
        }
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length) {
            return false;
        }
        //建立映射关系
        Map<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (hashMap.containsKey(pattern.charAt(i))) {
                if (!hashMap.get(pattern.charAt(i)).equals(s1[i])) {
                    return false;
                }
            } else {
                hashMap.put(pattern.charAt(i), s1[i]);
            }
        }
        Collection<String> values = hashMap.values();
        Set<String> set = new HashSet<>();
        for (String value : values) {
            if (set.add(value) == false) {
                //存在重复对应关系
                return false;
            }
        }
        return true;
    }
}
