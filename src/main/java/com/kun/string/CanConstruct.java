package com.kun.string;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/11/11
 * @Version 1.0
 **/
public class CanConstruct {
    public static void main(String[] args) {

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }
//        boolean flag = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            Character c = ransomNote.charAt(i);
            if(list.remove(c) == false){
                return false;
            }
        }
        return true;
    }
}
