package com.kun.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author zhaokun
 * 205. Isomorphic Strings
 * 同构字符串
 * @Date 2021/5/10
 * @Version 1.0
 **/
public class IsIsomorphic {
    public static void main(String[] args) {
        isIsomorphic("foo",
                "bar");
    }

    public static boolean isIsomorphic(String s, String t) {
        StringBuffer sb = new StringBuffer();
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char s_c = s.charAt(i);
            char t_c = t.charAt(i);
            if(!hm.containsKey(s_c) && !hm.containsValue(t_c)){
                hm.put(s_c, t_c);
            }
            sb.append(hm.get(s_c));
        }
        if(t.equals(sb.toString())){
            return true;
        } else{
            return false;
        }
    }
}
