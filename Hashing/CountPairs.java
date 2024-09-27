package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(Integer i:arr){
            map.put(i,true);
            if(map.containsKey(k-i)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
