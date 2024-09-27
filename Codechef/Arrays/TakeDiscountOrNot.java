package Codechef.Arrays;

import java.util.Scanner;

public class TakeDiscountOrNot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int actualCost=0;
            for(Integer i:a){
                actualCost+=i;
            }
            
            int discountedCost=0;
            for(Integer i:a){
                if(i>=y){
                    discountedCost+=(i-y);
                }
            }
            discountedCost+=x;
            if(discountedCost<actualCost){
                System.out.println("COUPON");
            }
            else{
                System.out.println("NO COUPON");
            }
        }
        scanner.close();
    }
}