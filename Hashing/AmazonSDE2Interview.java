package Hashing;

import java.util.*;
public class AmazonSDE2Interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a =new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(map.containsKey(k-a[i])){
                minLength=Math.min((i-map.getOrDefault(a[i],0))+1,minLength);
            }
            map.put(a[i],i);
        }
        // System.out.println(map);
        System.out.println(minLength);
        sc.close();
    }
}
