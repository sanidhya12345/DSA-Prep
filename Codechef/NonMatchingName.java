package Codechef;

import java.util.*;
public class NonMatchingName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            String sa=sc.next();
            String sb=sc.next();
            boolean flag=false;
            HashMap<Character,Integer> map=new HashMap<>();
            for(char ch:sa.toCharArray()){
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
            for(char ch:sb.toCharArray()){
                map.put(ch,map.getOrDefault(ch, 0)-1);
            }
            for(char ch:map.keySet()){
                if(map.get(ch)==0){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}