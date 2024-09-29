package PrefixSum;
import java.util.*;
public class SubarrayWithSumK {
    public static void main(String[] args) {
        int [] arr={10 , 2, -2, -20, 10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0, 1);
        int currsum=0;
        for(int i:arr){
            currsum+=i;

            if(map.containsKey(currsum-k)){
                count+=map.get(currsum-k);
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        System.out.println(count);
    }
}
