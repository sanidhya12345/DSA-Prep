package Leetcode;

import java.util.*;
public class Leetcode418Q1 {
    public static void main(String[] args) {
        int [] nums={1,2,3};

        Integer [] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }

        Arrays.sort(arr,(a,b)->{
            String binA=Integer.toBinaryString(a);
            String binB=Integer.toBinaryString(b);

            return (binB+binA).compareTo(binA+binB);
        });

        StringBuilder sb=new StringBuilder();

        for(Integer num:arr){
            sb.append(Integer.toBinaryString(num));
        }
        System.out.println(Integer.parseInt(sb.toString(), 2));
    }
}
