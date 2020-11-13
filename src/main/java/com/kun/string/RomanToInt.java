package com.kun.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * 13. Roman to Integer
 * @Author zhaokun
 * @Date 2020/11/2
 * @Version 1.0
 **/
public class RomanToInt {
    public static void main(String[] args) {

    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(8);
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int sum = 0;
        char prev = 'I';
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(map.get(c) < map.get(prev)){
                sum -= map.get(c);
            } else {
                sum += map.get(c);
            }
            prev = c;
        }
        return sum;
    }
}
