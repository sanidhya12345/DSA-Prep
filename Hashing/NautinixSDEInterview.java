package Hashing;

import java.util.HashMap;

public class NautinixSDEInterview {
    public static void main(String[] args) {
        int [] nums1={2,5};
        int [] nums2={3,8};
        int [] nums3={-5,8};
        int [] nums4={5,10};
        int [] nums5={-10,100};
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        for(int i:nums3){
            for(int j:nums4){
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        int count=0;
        for(int i:nums5){
            if(map.containsKey(-(i))){
                count+=map.get(-(i));
            }
        }
        System.out.println(count);
    }
}
