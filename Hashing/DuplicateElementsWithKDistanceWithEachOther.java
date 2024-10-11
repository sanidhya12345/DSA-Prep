package Hashing;

import java.util.*;
public class DuplicateElementsWithKDistanceWithEachOther {

    public static boolean check(int [] arr,int n ,int k){

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i-map.getOrDefault(arr[i], 0)==k){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(check(a, n, k));
        sc.close();
    }
}
