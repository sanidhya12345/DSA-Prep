package Hashing;

import java.util.*;
public class IntuitOA {
    public static void main(String[] args) {
        int [] arr={1,2};
        int k=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            // Edge case where we are searching for the same element twice
            // For example, if we have 8 and we got 4 two times in our array
            if (k == 0) {
                if (value > 1) {
                    count++;
                }
            } else { // Normal case
                if (map.containsKey(key + k)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
