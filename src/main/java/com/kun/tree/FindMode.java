package com.kun.tree;

import java.util.*;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/11/6
 * @Version 1.0
 **/
public class FindMode {
    public static void main(String[] args) {

    }
    public static int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        getNumberFrequency(root, map);
        List<Integer> list = new ArrayList<>();
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int frequency = 0;
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value = next.getValue();
            Integer key = next.getKey();
            if (value > frequency){
                frequency = value;
                list.clear();
                list.add(key);
            } else if(value == frequency){
                list.add(key);
            }
        }
        int[] array = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            array[i++] = integer;
        }
        return array;
    }
    public static void getNumberFrequency(TreeNode root, Map<Integer, Integer> map){
        if(root != null){
            if (map.containsKey(root.val)) {
                map.put(root.val, map.get(root.val) + 1);
            } else {
                map.put(root.val, 1);
            }
            if(root.left != null){
                getNumberFrequency(root.left, map);
            }
            if(root.right != null){
                getNumberFrequency(root.right, map);
            }
        }
    }
}
