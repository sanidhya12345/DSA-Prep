package Codechef.Diifficulty5001000;

import java.util.*;
public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int divide=Math.ceilDiv(n, 6);
            System.out.println(divide*x);
        }
        sc.close();
    }
}
