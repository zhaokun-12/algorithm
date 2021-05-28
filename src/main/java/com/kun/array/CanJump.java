package com.kun.array;

/**
 * @Description
 * 55. Jump Game
 * @Author zhaokun
 * @Date 2021/5/26
 * @Version 1.0
 **/
public class CanJump {
    public static void main(String[] args) {
        int x=1,y=4;
        int r = x ^ y;
        int res = 0;
        while (r != 0) {
            res += r & 1;
            r = r >> 1;
        }
        System.out.println(res);
    }
}
