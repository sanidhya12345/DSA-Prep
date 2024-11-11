package Maths;

import java.io.*;
public class Smith {
    static final StdIn in = new StdIn();
    static final PrintWriter out=new PrintWriter(System.out);
    static int sumOfPrimeFactors(int num) {
        int sum = 0;
        while (num % 2 == 0) {
            sum += 2;
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                sum += digitSum(i);
                num /= i;
            }
        }
        if (num > 2) {
            sum += digitSum(num);
        }
        return sum;
    }
    static int digitSum(int n){
        int sum=0;
        while(n!=0){
            int m=n%10;
            sum+=m;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=in.nextInt();
        int ans=sumOfPrimeFactors(n)==digitSum(n)?1:0;
        out.println(ans);
        out.flush();
    }
}