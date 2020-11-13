package com.kun.string;


/**
 * @Description
 * 67. Add Binary
 * @Author zhaokun
 * @Date 2020/11/2
 * @Version 1.0
 **/
public class AddBinary {
    public static void main(String[] args) {

    }
    public static String addBinary(String a, String b) {
        int alength = a.length() - 1;
        int blength = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(alength >= 0 && blength >= 0){
            int var1 = a.charAt(alength) - 48;
            int var2 = b.charAt(blength) - 48;
            int sum = var1 + var2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            alength--;
            blength--;
        }
        while(alength >= 0){
            int var1 = a.charAt(alength) - 48;
            int sum = var1 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            alength--;
        }
        while(blength >= 0){
            int var1 = b.charAt(blength) - 48;
            int sum = var1 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            blength--;
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
