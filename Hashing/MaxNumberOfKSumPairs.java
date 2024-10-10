package Hashing;
import java.util.*;
public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
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
}
