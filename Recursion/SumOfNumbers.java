package Recursion;

import java.util.*;

public class SumOfNumbers {

    public static int calculateSum(int n,int sum){
        //base case
        if(n==0){
            return sum;
        }
        sum+=n;
        return calculateSum(n-1, sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateSum(n, 0));
        sc.close();
    }
}