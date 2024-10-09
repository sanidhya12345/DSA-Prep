package Hashing;

import java.util.*;
public class MaximumSumDigitsMicrosoft {

    public static long digitSum(long n){
        long sum=0;
        while(n!=0){
            long m=n%10;
            sum+=m;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        long [] a=new long[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long ans=-1;

        HashMap<Long,Long> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(digitSum(a[i]))){
                long curr=a[i]+map.get(digitSum(a[i]));
                ans=Math.max(ans, curr);
                map.put(digitSum(a[i]),Math.max(digitSum(a[i]), a[i]));
            }
            else{
                map.put(digitSum(a[i]),a[i]);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}