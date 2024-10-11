package Hashing;

import java.util.*;
public class MinimumElementsToMakeAllEqual {
    public static int minOps(int [] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr) map.put(i, map.getOrDefault(i, 0)+1);
        int maxCount=Collections.max(map.values());
        return n-maxCount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(minOps(arr, n));
        sc.close();
    }
}
