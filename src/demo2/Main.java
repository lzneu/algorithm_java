package demo2;

import java.util.Scanner;

public class Main {
    public static void func(int n, int m, int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int[] temp = new int[sum + 1];
        temp[0] = 0;
        int t = 1, k = 0;
        for (int i = 0; i < n; i++) {
            k += a[i];
            while (t <= k) {
                temp[t++] = i + 1;
            }
        }
        for (int i = 0; i < m; i++) {
            b[i] = temp[b[i]];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        func(n, m, a, b);
        for (int i = 0; i < m; i++) {
            System.out.println(b[i]);
        }
    }
}