package PrefixSum;
import java.util.*;
public class ContigousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+nums[i])%k;
            if(map.containsKey(sum)){
                if(i+1-map.get(sum)>=2){
                    return true;
                }
            }
           else{
               map.put(sum,i+1);
           }
        }
        return false;
    }
}
