package com.kun.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author zhaokun
 * 36. Valid Sudoku 数独
 * 9*9的矩阵
 * @Date 2021/3/25
 * @Version 1.0
 **/
public class IsValidSudoku {

    public static void main(String[] args) {
        char[][] ints =
                {{'.','8','7','6','5','4','3','2','1'}
                        ,{'2','.','.','.','.','.','.','.','.'}
                        ,{'3','.','.','.','.','.','.','.','.'}
                        ,{'4','.','.','.','.','.','.','.','.'}
                        ,{'5','.','.','.','.','.','.','.','.'}
                        ,{'6','.','.','.','.','.','.','.','.'}
                        ,{'7','.','.','.','.','.','.','.','.'}
                        ,{'8','.','.','.','.','.','.','.','.'}
                        ,{'9','.','.','.','.','.','.','.','.'}}
;
        System.out.println(isValidSudoku2(ints));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet();
        for (int i = 0; i < board.length; i++) {
            set.clear();
            char c = board[i][i];
            //横向扫描
            for (int i1 = 0; i1 < board.length; i1++) {
                c = board[i][i1];
                if(Character.isDigit(c)){
                    if (set.add(c) == false) {
                        return false;
                    }
                }
            }
            set.clear();
            //纵向扫描
            for (int i1 = 0; i1 < board.length; i1++) {
                c = board[i1][i];
                if(Character.isDigit(c)){
                    if (set.add(c) == false) {
                        return false;
                    }
                }
            }
        }
        //3*3 扫描
        for (int i = 0; i < board.length; i=i+3) {
            for (int j = 0; j < board.length; j=j+3) {
                //定点每个3*3矩阵左上角
                char c = board[i][j];
                set.clear();
                for (int i1 = 0; i1 < 3; i1++) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        char c1 = board[i + i1][j + i2];
                        if (Character.isDigit(c1)) {
                            if (set.add(c1) == false) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
    static int row[] = new int[9];
    static int col[] = new int[9];
    static int mat[][] = new int[3][3];
    public static boolean isValidSudoku2(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    int mask = 1<<(board[i][j] - '0');
                    if((mask & row[i]) == 0 && (mask & col[j]) == 0 && (mask & mat[i/3][j/3]) == 0) {
                        //在行列中都没有重复数字
                        row[i] |= mask;
                        col[j] |= mask;
                        mat[i/3][j/3] |= mask;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }




}
