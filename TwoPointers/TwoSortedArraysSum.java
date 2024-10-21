package TwoPointers;

import java.util.Scanner;

public class TwoSortedArraysSum {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
 
        int i = 1;
        while (i <= n) {
            a[i] = scanner.nextInt();
            i++;
        }
 
        i = 1;
        while (i <= n) {
            b[i] = scanner.nextInt();
            i++;
        }
 
        int y = scanner.nextInt();
        int v = 0;
        int j = n;
        i = 1;
        while (i <= n && j >= 1) {
            if (a[i] + b[j] <= y) {
                int sum = a[i] + b[j];
                if (sum > v) {
                    v = sum;
                }
                i = i + 1;
            } else {
                j = j - 1;
            }
        }
 
        System.out.println(v);
        scanner.close();
    }
}
