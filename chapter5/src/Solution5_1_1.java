/*
    https://atcoder.jp/contests/abc157/tasks/abc157_b
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution5_1_1 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        var a = sc.nextIntMatrix(3, 3);
        var n = sc.nextInt();
        var b = sc.nextIntArray(n);

        var bingo = new boolean[3][3];

        Arrays.stream(b).forEach(value -> {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (value == a[i][j]) {
                        bingo[i][j] = true;
                    }
                }
            }
        });


        for (int i = 0; i < 3; i++) {
           // 横
            if (bingo[i][0] && bingo[i][1] && bingo[i][2]) {
                System.out.println("Yes");
                return;
            }
            // 縦
            if (bingo[0][i] && bingo[1][i] && bingo[2][i]) {
                System.out.println("Yes");
                return;
            }
        }

        // 斜め
        if (bingo[0][0] && bingo[1][1] && bingo[2][2]
            || bingo[0][2] && bingo[1][1] && bingo[2][0]) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

    }

    static class MyScanner {
        static Scanner sc = new Scanner(System.in);

        String next() {
            return sc.next();
        }

        String nextLine() {
            return sc.nextLine();
        }

        int nextInt() {
            return Integer.parseInt(sc.next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLong();
            }
            return array;
        }

        String[] nextLineArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLine();
            }
            return array;
        }

        int[][] nextIntMatrix(int n, int m) {
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = nextInt();
                }
            }
            return matrix;
        }

        double[][] nextDoubleMatrix(int n, int m) {
            double[][] matrix = new double[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = nextDouble();
                }
            }
            return matrix;
        }

        long[][] nextLongMatrix(int n, int m) {
            long[][] matrix = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = nextLong();
                }
            }
            return matrix;
        }
    }
}