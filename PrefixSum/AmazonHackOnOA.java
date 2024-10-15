package PrefixSum;

import java.util.*;
public class AmazonHackOnOA {
    public static int digitCount(int n){
        return Integer.toString(n).length();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=sc.nextInt();
        int sum=0;
        int ans=0;
        for(int i=1;i<=n;i++){

            int y=digitCount(arr[i]);
            int cal=(i-1)*arr[i]+(int)(Math.pow(10,y))*sum;
            ans+=cal;
            sum+=arr[i];
        }
        System.out.println(ans);
        sc.close();
    }
}
