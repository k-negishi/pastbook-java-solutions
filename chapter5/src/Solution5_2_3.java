/*
    https://atcoder.jp/contests/past202004-open/tasks/past202004_d
 */
import java.util.*;

public class Solution5_2_3 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        var s = sc.nextLine();

        var c = "abcdefghijklmnopqrstuvwxyz.";
        var count = 0;

        // 長さ1の文字列
        for (int i = 0; i < c.length(); i++) {
            if (isMatch(String.valueOf(c.charAt(i)), s)) count++;
        }

        // 長さ2の文字列
        for (int i = 0; i < c.length(); i++) {
            for (int j = 0; j < c.length(); j++) {
                String t = String.valueOf(c.charAt(i)) + String.valueOf(c.charAt(j));
                if (isMatch(t, s)) count++;
            }
        }

        // 長さ3の文字列
        for (int i = 0; i < c.length(); i++) {
            for (int j = 0; j < c.length(); j++) {
                for (int k = 0; k < c.length(); k++) {
                    String t = String.valueOf(c.charAt(i)) + String.valueOf(c.charAt(j)) + String.valueOf(c.charAt(k));
                    if (isMatch(t, s)) count++;
                }
            }
        }
        System.out.println(count);
    }

    /**
     * 文字列tが文字列sにマッチするか
     */
    public static boolean isMatch(String t, String s) {
        // sのi文字目から始まる部分文字列がtとマッチするか
        for (int i = 0; i < s.length() - t.length() + 1; i++) {

            var flg = true;

            // tのj文字目と、sのi+j文字目を比較
            for (int j = 0; j < t.length(); j++) {
                // tのj文字目がsのi+j文字目と異なっていて、かつtのj文字目が"."でもない場合、マッチしない
                if (t.charAt(j) != s.charAt(i + j) && t.charAt(j) != '.') {
                    flg = false;
                    break;
                }

            }
            // sのi文字目から始まる部分がtにマッチしている場合、true
            if (flg) return true;
        }
        // sのすべての部分がtにマッチしなかった場合、false
        return false;
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