package Hashing.HashSet;
import java.util.*;
public class TwoSumVariation {

    public static boolean twoSumVariation(int [] a,int target){
        HashSet<Integer> set=new HashSet<>();
        for(int num:a){
            if(set.contains(target-num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(twoSumVariation(a, target));
        sc.close();
    }
}