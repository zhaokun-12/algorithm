package com.kun.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author zhaokun
 * 575. Distribute Candies
 * @Date 2021/5/12
 * @Version 1.0
 **/
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size(), candyType.length / 2);

    }
}
