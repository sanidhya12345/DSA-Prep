package Hashing;
import java.util.*;
public class MaximumDistance {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int maxDistance=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                int dist=Math.abs(i-map.get(arr[i]));
                maxDistance=Math.max(dist,maxDistance);
            }
        }
        System.out.println(maxDistance);
    }
}
