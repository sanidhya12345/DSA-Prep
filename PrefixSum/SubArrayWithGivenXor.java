package PrefixSum;
import java.util.*;
public class SubArrayWithGivenXor {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4}; 
        int m = 6;
        int curXor=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:arr){
            curXor ^=i;

            if(map.containsKey(curXor ^ m)){
                count+=map.get(curXor ^ m);
            }
            map.put(curXor, map.getOrDefault(curXor,0)+1);
        }
        System.out.println(count);
    }
}
