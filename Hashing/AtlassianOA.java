package Hashing;

import java.util.*;
public class AtlassianOA  {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] s=new int[n];

        for(int i=0;i<n;i++){
            s[i]=arr[i]-i;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+arr[i]);
            }
            else{
                map.put(s[i],arr[i]);
            }
        }
        System.out.println(Collections.max(map.values()));
        sc.close();
    }
}
