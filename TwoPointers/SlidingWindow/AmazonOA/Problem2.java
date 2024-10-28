package TwoPointers.SlidingWindow.AmazonOA;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-28
 * Time: 10:57
 */

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        // Your code here
        int [] arr={1,2,7,7,4,3,6};
        int k=3;
        int n=arr.length;
        int maxSum=0;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        while(j<n){
            sum+=arr[j];
            map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            if(j-i+1<k) j++;
            else if(j-i+1==k){

                if(map.size()==k){
                    maxSum=Math.max(maxSum, sum);
                }

                sum-=arr[i];
                map.put(arr[i], map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
                j++;
            }
        }
        System.out.println(maxSum);
    }
}
