package OASessions.Rubrik.Nov_4_2024;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-05
 * Time: 10:27
 */

import java.util.*;
public class Solution {

    //Sieve of eros to check the prime number from 0....n
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
        boolean [] prime=isPrime(n-1);
        //closest prime number which is less than n
        int closestPrime=-1;
        for(int i=n-1;i>=2;i--){
            if(prime[i]){
                closestPrime=i;
                break;
            }
        }
        
        if((closestPrime*n)%2==0){
            System.out.println((closestPrime*n)/2);
        }
        else{
            System.out.println((((n-1)*closestPrime)+2)/2);
        }
        sc.close();
    }
}
