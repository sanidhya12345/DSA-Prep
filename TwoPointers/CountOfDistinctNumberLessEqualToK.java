package TwoPointers;
import java.util.*;
public class CountOfDistinctNumberLessEqualToK {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int k=3;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0, j = 0; j < arr.length; j++) {
            map.put(arr[j],map.getOrDefault(arr[j], 0)+1);
            int d=map.size();
            while (d > k) {
                map.put(arr[i],map.getOrDefault(arr[i], 0)-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }
            count += (j - i + 1);
        }
        System.out.println(count);
    }
}
