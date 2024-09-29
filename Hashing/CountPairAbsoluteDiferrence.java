package Hashing;
import java.util.*;
public class CountPairAbsoluteDiferrence {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            count+=map.getOrDefault(i+k,0)+map.getOrDefault(i-k,0);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
}
