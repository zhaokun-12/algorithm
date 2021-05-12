package com.kun.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author zhaokun
 * 242. Valid Anagram
 * @Date 2021/5/11
 * @Version 1.0
 **/
public class IsAnagram {
    public static void main(String[] args) {
    }
    public static boolean isAnagram(String s, String t) {
        if (s == t) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hashMap.containsKey(c)) {
                Integer integer = hashMap.get(c);
                if (integer - 1 == 0) {
                    hashMap.remove(c);
                } else {
                    hashMap.put(c, integer - 1);
                }
            }  else {
                return false;
            }
        }

        if (hashMap.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

class Person {
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
