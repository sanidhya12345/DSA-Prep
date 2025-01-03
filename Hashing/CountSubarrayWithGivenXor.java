package Hashing;

import java.util.HashMap;

public class CountSubarrayWithGivenXor {
    public static long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int xor=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            xor=xor ^ arr[i];
            if(map.containsKey(k ^ xor)){
                count+=map.get(k ^ xor);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
        
    }
    public static void main(String[] args) {
        int [] arr={4, 2, 2, 6, 4};
        int k=6;
        System.out.println(subarrayXor(arr, k));
    }
}
