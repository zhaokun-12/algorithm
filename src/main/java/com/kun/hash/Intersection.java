package com.kun.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author zhaokun
 * 349. Intersection of Two Arrays
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
}
