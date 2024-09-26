package Codechef.Arrays;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(Integer i:arr){
                max=Math.max(max,i);
            }
            System.out.println(max);
        }
        sc.close();
    }
}
