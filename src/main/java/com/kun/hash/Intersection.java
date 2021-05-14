package com.kun.hash;

import java.util.*;

/**
 * @Description
 * @Author zhaokun
 * 349. Intersection of Two Arrays
 * 350. Intersection of Two Arrays II
 * 交集去重
 * @Date 2021/5/12
 * @Version 1.0
 **/
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }
        boolean b = set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int i = 0;
        for (Integer integer : set1) {
            res[i++] = integer;
        }
        return res;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            arr[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (arr[nums2[i]]-- > 0) {
                list.add(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (Integer integer : list) {
            res[index++] = integer;
        }
        return res;
    }

    public static void main(String[] args) {
        findTheDifference("abcd"
                ,"abcde");

    }
    public static char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (arr[t.charAt(i) - 'a']-- == 0) {
                return t.charAt(i);
            }
        }
        return 'c';
    }
}
