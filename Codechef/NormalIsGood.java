package Codechef;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-29
 * Time: 10:28 AM
 */

import java.util.*;
public class NormalIsGood {

    //Method to calculate the number of subarrays with consecutive x.
    public static long countConsecutive(int x,int [] arr){
        long count=0;
        long finalans=0;
        for(int i:arr){
            if(i==x){
                count++;
            }
            else{
                finalans+=(long)((count*(count+1))/2);
                count=0;
            }
        }
        finalans+=(long)((count*(count+1))/2);
        return finalans;
    }
    
    public static long subarraySumWithOptionalReset(int x, int[] arr, boolean excludeZero) {
        long count = 0;
        int prefixSum = 0;
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);  // Initialize to handle subarrays starting at index 0
    
        for (int i : arr) {
            if (excludeZero && i == x) {
                // Reset when encountering `x` (0 in this case)
                prefixSum = 0;
                map=new HashMap<>();
                map.put(0, 1L);
            } else {
                // Normal case
                prefixSum += i;
                count += map.getOrDefault(prefixSum, 0L);
                map.put(prefixSum, map.getOrDefault(prefixSum, 0L) + 1);
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases--!=0) {
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            long ans=0;
            //number of subarray with mean and median equal to 1.
            ans+=countConsecutive(1, arr);

            //number of subarray with means and median equal to 3.
            ans+=countConsecutive(3, arr);

            for(int i=0;i<n;i++){
                arr[i]=arr[i]-2;
            }
            ans+=(subarraySumWithOptionalReset(0, arr, false)-subarraySumWithOptionalReset(0, arr, true));
            System.out.println(ans);
        }
        sc.close();
    }
}
