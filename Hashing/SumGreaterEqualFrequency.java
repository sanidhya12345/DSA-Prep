package Hashing;
import java.util.*;
public class SumGreaterEqualFrequency {
    public static int sum(int [] a,int n){
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a) map.put(i,map.getOrDefault(i,0)+1);
        for(int key:map.keySet()){
            if(key<=map.get(key)){
                res+=key;
            }
        }
        return res;
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       System.out.println(sum(arr,n));
       sc.close();
    }
}
