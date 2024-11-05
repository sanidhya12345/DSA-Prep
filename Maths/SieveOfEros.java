package Maths;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-05
 * Time: 09:34
 */

import java.util.*;
public class SieveOfEros {
    public static boolean[] isPrime(int n){
        boolean [] prime=new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        
        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                //mark all the number with p as their multiple as false because they are not prime.
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
        }
       }
       return prime;
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean [] prime=isPrime(n);
        System.out.println(Arrays.toString(prime));
        sc.close();
    }
}