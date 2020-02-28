package com.weilaicheng.demo.leetcode.q51;

/**
 * author by beijita@weilaicheng.com
 * 2020/2/19
 *
 * @author xiangzhi.meng
 */
//递归八皇后
public class Test {
    static int[][] qipan = new int[8][8];
    static int num = 0;

    public static void main(String[] args) {
        put(0);
        System.out.println(num);
    }

    public static void put(int n) {
        for (int i = 0; i < 8; i++) {
            if (isOK(n, i)) {
                //表示在第 n 行找到了位置
                qipan[n][i] = 1;
                if (n == 7) {
                    num++;
                    printQiPan();
                    qipan[n][i] = 0;
                } else {
                    put(n + 1);
                    qipan[n][i] = 0;
                }
            }
        }
    }

    private static void printQiPan() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(qipan[i][j] + " ");
                if (j == 7) {
                    System.out.println();
                }
            }
        }
        System.out.println("---------------------------------");
    }

    public static boolean isOK(int row, int col) {
        //判断行
        for (int i = 0; i < row; i++) {
            if (qipan[i][col] == 1) {
                return false;
            }
        }

        //判断左上右下对角线
        int i = row;
        int b = col;
        do {
            if (qipan[i][b] == 1) {
                return false;
            }
            i--;
            b--;
        }
        while (i >= 0 && b >= 0);

        //判断右上左下对角线
        int i1 = row;
        int b1 = col;
        do {
            if (qipan[i1][b1] == 1) {
                return false;
            }
            i1--;
            b1++;
        }
        while (i1 >= 0 && b1 <= 7);
        return true;
    }
}
