package Hashing.LevelAProblems;

import java.util.*;
class CountingFrequencies {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //putting the frequencies in hashmap
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        for(int i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
        sc.close();
    }
}