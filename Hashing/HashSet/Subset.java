package Hashing.HashSet;

import java.util.*;
public class Subset {

    public static boolean checkSubset(int [] a,int []b){
        HashSet<Integer> set=new HashSet<>();
        for(int i:a) set.add(i);
        int count=0;
        for(int i:b){
            if(set.contains(i)) count++;
        }
        return count==b.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(); //size of first array.
        int [] a=new int[n1];
        for(int i=0;i<n1;i++) a[i]=sc.nextInt();
        int n2=sc.nextInt();// size of second array.
        int [] b=new int[n2];
        for(int i=0;i<n2;i++) b[i]=sc.nextInt();
        System.out.println(checkSubset(a, b));
        sc.close();
    }
}
