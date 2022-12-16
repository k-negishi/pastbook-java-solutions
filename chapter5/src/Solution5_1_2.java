/*
    https://atcoder.jp/contests/abc088/tasks/abc088_c
 */
import java.util.*;

public class Solution5_1_2 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        var c = sc.nextIntMatrix(3, 3);

        // 0列目と1列目の差分を調べる
        if (c[0][0] - c[0][1] != c[1][0] - c[1][1]
                || c[1][0] - c[1][1] != c[2][0] - c[2][1]) {
            System.out.println("No");
            return;
        }

        // 1列目と2列目の差分を調べる
        if (c[0][1] - c[0][2] != c[1][1] - c[1][2]
                || c[1][1] - c[1][2] != c[2][1] - c[2][2]) {
            System.out.println("No");
            return;
        }

        // 0行目と1行目の差分を調べる
        if (c[0][0] - c[1][0] != c[0][1] - c[1][1]
                || c[0][1] - c[1][1] != c[0][2] - c[1][2]) {
            System.out.println("No");
            return;
        }

        // 1行目と2行目の差分を調べる
        if (c[0][1] - c[1][1] != c[0][2] - c[1][2]
                || c[1][1] - c[2][1] != c[1][2] - c[2][2]) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");


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