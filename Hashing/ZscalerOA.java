package Hashing;

import java.util.*;

public class ZscalerOA {

    public static int findRangeSum(int [] arr,int i,int j){
        int sum=0;
        for(int k=i;k<=j;k++) sum+=arr[k];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int l=map.get(arr[i]);
                int r=i;
                if((r-l+1)>=3){
                    int sum=findRangeSum(arr, l+1, r-1);
                    if(arr[l]==arr[r] && arr[r]==sum){
                        count++;
                    }
                }
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(count);
        sc.close();
    }

}
