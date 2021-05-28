package com.kun.string;

/**
 * @Description
 * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 * @Author zhaokun
 * @Date 2021/5/27
 * @Version 1.0
 **/
public class MinPartitions {
    public static void main(String[] args) {
        MinPartitions minPartitions = new MinPartitions();
        int i = minPartitions.minPartitions("27346209830709182346");
        System.out.println(i);
    }
    public int minPartitions(String n) {
        int res = 0;
        while (n.length() != 0) {
            char[] chars = n.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (aChar > 48) {
                    chars[i] = (char)(aChar - 1);
                }
            }
            n = rebuild(chars);
            res++;
        }
        return res;
    }
    public String rebuild (char[] chars) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            if (stringBuilder.length() == 0 && chars[i] == 48) {
                continue;
            }
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public int minPartitions2(String n) {
        int max = 0;
        for (char c : n.toCharArray()) {
            max = Math.max(c, max);
        }
        return max - '0';
    }
}
