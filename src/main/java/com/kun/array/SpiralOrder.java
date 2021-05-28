package com.kun.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * 54. Spiral Matrix
 * @Author zhaokun
 * @Date 2021/5/27
 * @Version 1.0
 **/
public class SpiralOrder {
    public static void main(String[] args) {
        SpiralOrder SpiralOrder = new SpiralOrder();
        List<Integer> list = SpiralOrder.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(list);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int stepH = matrix[0].length, stepV = matrix.length;
        int i = 0, j = 0;
        while (stepH == 0 && stepV == 0) {
            for (int i1 = 0; i1 < stepH; i1++) {

            }
        }
        return list;
    }
}
