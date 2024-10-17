package Hashing;
import java.util.*;
public class GoogleSWE2023 {
    public static int maxOperations(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i]) && map.get(k-nums[i])>0){
                count++;
                map.put(k-nums[i],map.getOrDefault(k-nums[i],0)-1);
            }
            else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
  public static void main(String args[]) {
    int [] arr={1,2,6,6,5};
    int n=5;
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            set.add(arr[i]+arr[j]);
        }
    }
    int maxPairs=Integer.MIN_VALUE;
    for(int k:set){
        maxPairs=Math.max(maxPairs,maxOperations(arr,k));
    }
    System.out.println(maxPairs);
  }
}
