package Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MaxMinFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        int maxFreq=Collections.max(map.values());
        int minFreq=Collections.min(map.values());

        for(Integer i:map.keySet()){
            if(map.get(i)==maxFreq){
                System.out.println("Element"+i+","+"Frequency: "+maxFreq);
            }
            if(map.get(i)==minFreq){
                System.out.println("Element"+i+","+"Frequency: "+minFreq);
            }
        }
        sc.close();
    }
}
