package Codechef.Arrays;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int firstMax=Integer.MIN_VALUE;
            int secondMax=Integer.MIN_VALUE;
            
            //find the firstMax
            
            for(Integer i:a){
                firstMax=Math.max(firstMax,i);
            }
            
            //find the second max
            
            for(Integer i:a){
                if(i!=firstMax){
                    secondMax=Math.max(i,secondMax);
                }
            }
            System.out.println(firstMax+secondMax);
        }
        // Your code goes here
        scanner.close();
    }
}
