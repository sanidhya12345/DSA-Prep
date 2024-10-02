package Greedy;

import java.util.*;
public class HackerLandMinPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        int [] prices=new int[n];
        int [] queries=new int[q];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            queries[i]=sc.nextInt();
        }
        //bruteforce greedy method tc: O(n*q)
        for(int i=0;i<q;i++){
            int target=queries[i];
            int minOps=0;
            for(int j=0;j<n;j++){
                minOps+=Math.abs(target-prices[j]);
            }
            ans.add(minOps);
        }
        System.out.println(ans);
        sc.close();
    }
}
