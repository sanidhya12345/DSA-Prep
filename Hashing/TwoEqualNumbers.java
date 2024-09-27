package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TwoEqualNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                if(Math.abs(map.get(arr[i])-i)<=k){
                    flag=true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
