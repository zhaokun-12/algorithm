package com.kun;

/**
 * @Description
 * @Author zhaokun
 * @Date 2020/11/2
 * @Version 1.0
 **/
public class MyPow {
    public static void main(String[] args) {

    }
    public static double myPow(double x, int n) {
        double res = 1.0;
        while(n != 0){
            if(n % 2 == 0){
                x *= x;
                n /= 2;
            }
            if(n > 0){
                res *= x;
                n--;
            } else {
                res *= 1 / x;
                n++;
            }
        }
        return res;
    }
}
