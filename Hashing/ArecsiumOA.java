package Hashing;

import java.util.*;
public class ArecsiumOA {
   public static boolean check(String x,String y){
    HashMap<Character,Integer> even1=new HashMap<>(); //character freq at even indices in x string
        HashMap<Character,Integer> odd1=new HashMap<>();  //character freq at odd indices in x string
        HashMap<Character,Integer> even2=new HashMap<>(); //character freq at even indices in y string
        HashMap<Character,Integer> odd2=new HashMap<>();  //character freq at odd indices in y string
        
        for(int i=0;i<x.length();i++){
            if(i%2==0){
               even1.put(x.charAt(i), even1.getOrDefault(x.charAt(i), 0)+1);
            }
            else{
                odd1.put(x.charAt(i), odd1.getOrDefault(x.charAt(i), 0)+1);
            }
        }

        for(int i=0;i<y.length();i++){
            if(i%2==0){
               even2.put(y.charAt(i), even2.getOrDefault(y.charAt(i), 0)+1);
            }
            else{
                odd2.put(y.charAt(i), odd2.getOrDefault(y.charAt(i), 0)+1);
            }
        }
        return even1.equals(even2) && odd1.equals(odd2);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(check("cdab", "abcd"));
        sc.close();
    }
}
