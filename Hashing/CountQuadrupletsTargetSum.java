package Hashing;

import java.util.*;
public class CountQuadrupletsTargetSum {

    public static int countQuadruplets(int [] arr,int n,int target){
        int count=0;
        //map is used to store the frequency of all possible sum values.
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                int temp=arr[i]+arr[j];
                count+=map.getOrDefault(target-temp, 0);
            }
            for(int j=0;j<i;j++){
                map.put(arr[i]+arr[j], map.getOrDefault(arr[i]+arr[j], 0)+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr={4, 5, 3, 1, 2, 4};
        int n=arr.length;
        int target=13;
        System.out.println(countQuadruplets(arr, n, target));
    }
}