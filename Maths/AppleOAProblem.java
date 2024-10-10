package Maths;

import java.util.*;
public class AppleOAProblem {
    public static long nCr(long n, long r) {
        if (r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        
        long result = 1;
        for (long i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long target=n-1;
        long [] b=new long[64];
        //store the values like 2^0,2^1,2^3.........

        for(int i=0;i<64;i++){
            b[i]=(long)Math.pow(2, i);
        }
        
        long sum=0;
        long ways=0;

        for(int i=0;i<64;i++){
            sum+=b[i];
            if(sum>=target){
                long diff=sum-target;
                if(i+2<diff){
                    break;  //if we donot have enough spaces to accomodate the difference.
                }
                else{
                    ways+=nCr(i+2, diff);
                }
            }
        }
        System.out.println(ways);
        sc.close();
    }
}
