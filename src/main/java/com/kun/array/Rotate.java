package com.kun.array;

/**
 * @Description
 * 48. Rotate Image
 * 矩阵顺时针旋转90度
 * @Author zhaokun
 * @Date 2021/3/25
 * @Version 1.0
 **/
public class Rotate {
    public static void main(String[] args) {

    }

    public static void rotate(int[][] matrix) {
        //坐标转换，新建一个大小一样的数据，将转换后的数据放入
        //（x,u）->(y,n-1-x)
        if (matrix == null || matrix.length == 1) return;

        int[][] ints = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int[] matrix1 = matrix[i];
            for (int j = 0; j < matrix1.length; j++) {
                ints[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int[] matrix1 = matrix[i];
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = ints[i][j];
            }
        }
    }
}
