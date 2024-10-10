package Hashing;

import java.util.*;
public class GoogleSDE2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int [] a=new int[n+1];

        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=1;i<=n;i++){
            int rhs=a[a[a[i]]];
            count+=map.getOrDefault(rhs, 0);
            int lhs=a[a[a[i]]];
            map.put(lhs,map.getOrDefault(lhs, 0)+1);
        }
        System.out.println(count);
        sc.close();
    }
}
