package com.kun.array;

import java.util.*;

/**
 * @Description
 * 49. Group Anagrams
 * 相同字母分组
 * @Author zhaokun
 * @Date 2021/5/26
 * @Version 1.0
 **/
public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(new String[]{"eat","tea"});
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        int index = 0;
        for (String str : strs) {
            String rebuild = rebuild(str);
            if (!map.containsKey(rebuild)) {
                map.put(rebuild, index++);
            }
            Integer integer = map.get(rebuild);
            if (integer >= list.size()) {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(str);
                list.add(strings);
            } else {
                List<String> strings = list.get(integer);
                strings.add(str);
            }
        }
        return list;
    }
    public String rebuild(String str) {
        // 按照字母顺序重新排列
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}
