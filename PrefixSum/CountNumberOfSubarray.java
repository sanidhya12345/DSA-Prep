package PrefixSum;
import java.util.*;
public class CountNumberOfSubarray {
    public static void main(String[] args) {
        int [] arr={1,0,1,2,10,5};
        int k=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i:arr){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        System.out.println(count);
    }
}
