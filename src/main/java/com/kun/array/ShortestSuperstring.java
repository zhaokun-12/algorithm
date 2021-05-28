package com.kun.array;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/5/24
 * @Version 1.0
 **/
public class ShortestSuperstring {
    /**
     * 最短 父字符串（包含所有元素）
     * 第一步需要先获取一个最合适的数组排列顺序，以利用最大重复长度（不会）
     * 第二部就如下
     * @param args
     */
    public static void main(String[] args) {
        ShortestSuperstring shortestSuperstring = new ShortestSuperstring();
        String s = shortestSuperstring.shortestSuperstring(new String[]{"pso", "sop"});
        System.out.println(s);
    }
    public String shortestSuperstring(String[] words) {
        String shortestSuperstring = getShortestSuperstring(0, "", words);

        return shortestSuperstring;
    }

    public String getShortestSuperstring(int index, String superString, String[] words) {
        String word = words[index];

        superString = getShortestSuperstringForTwo(superString, word);
        if(index == words.length - 1) {
            return superString;
        } else {
            return getShortestSuperstring(index + 1, superString, words);
        }
    }

    public String getShortestSuperstringForTwo(String s1, String s2) {
        int s1BeforeLength = 0, s2BeforeLength = 0;
        if (s1.contains(s2)) {
            return s1;
        }
        if (s2.contains(s1)) {
            return s2;
        }
        for (int i = s2.length(); i >= 0; i--) {
            if (s1.endsWith(s2.substring(0, i))) {
                s1BeforeLength = i;
                break;
            }
        }

        for (int i = s1.length(); i >= 0; i--) {
            if (s2.endsWith(s1.substring(0, i))) {
                s2BeforeLength = i;
                break;
            }
        }

        if (s1BeforeLength >= s2BeforeLength) {
            return s1 + s2.substring(s1BeforeLength);
        } else {
            return s2 + s1.substring(s2BeforeLength);
        }
    }
}
