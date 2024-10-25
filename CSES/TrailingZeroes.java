package CSES;

import java.util.*;
public class TrailingZeroes {
    public static long countTrailingZeros(long n) {
        long count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        long n=sc.nextInt();     
        System.out.println(countTrailingZeros(n));
        sc.close();
    }
}
