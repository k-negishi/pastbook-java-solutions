/*
    https://atcoder.jp/contests/past202004-open/tasks/past202004_c
 */
import java.util.*;

public class Solution5_1_3 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        var n = sc.nextInt();
        var s = new String[n][2*n -1];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            s[i] = line.split("");
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j < (2 * n -2); j++) {
                if (!s[i][j].equals("#")) {
                    continue;
                }
                if (s[i+1][j-1].equals("X")
                        || s[i+1][j].equals("X")
                        || s[i+1][j+1].equals("X")) {

                    s[i][j] = "X";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            StringBuilder answer = new StringBuilder();
            for (int j = 0; j < s[i].length; j++) {
                answer.append(s[i][j]);
            }
            System.out.println(answer.toString());
        }
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
                array[i] = next();
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

        String[][] nextLineMatrix(int n, int m) {
            String[][] matrix = new String[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = next();
                }
            }
            return matrix;
        }

    }
}