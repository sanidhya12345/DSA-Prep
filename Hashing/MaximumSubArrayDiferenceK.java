package Hashing;

import java.util.*;
public class MaximumSubArrayDiferenceK {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       int [] prefix=new int[n];
       prefix[0]=arr[0];
       for(int i=1;i<n;i++){
         prefix[i]=arr[i]+prefix[i-1];
       }
       HashMap<Integer,Integer> map=new HashMap<>();
       int maxSum=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
          if(map.containsKey(arr[i]-k)){
             int start=map.get(arr[i]-k);
             int end=i;
             maxSum=Math.max(maxSum,prefix[end]-prefix[start-1]);
          }
          else if(map.containsKey(arr[i]+k)){
            int start=map.get(arr[i]+k);
            int end=i;
            maxSum=Math.max(maxSum,prefix[end]-prefix[start-1]);
          }
          else{
            map.put(arr[i],i);
          }
       }
       System.out.println(maxSum);
       sc.close();
    }
}
