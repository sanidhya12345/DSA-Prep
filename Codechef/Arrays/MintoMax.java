package Codechef.Arrays;

import java.util.Scanner;

public class MintoMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Your code goes here
            if(n==1){
                System.out.println(0);
            }
            else{
                int min=Integer.MAX_VALUE;
                for(Integer i:a){
                    min=Math.min(i,min);
                }
                int count=0;
                for(Integer i:a){
                    if(i>min){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        scanner.close();
    }
}
