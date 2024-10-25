package Hashing.RubrikOA;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.next();
        }
        int [] cx=new int[n+1]; // count of x till ith index.
        int [] cy=new int[n+1]; // count of y till ith index.
        int [] cz=new int[n+1]; // count of z till ith index.
        int [] cw=new int[n+1]; // count of w till ith index.
        int [] cb=new int[n+1]; // count of b till ith index.
        for(int i=1;i<=n;i++){
            if(arr[i].equals("x")){
                cx[i]=cx[i-1]+1;
            }
            else {
                cx[i]=cx[i-1];
            }
        }
        for(int i=1;i<=n;i++){
            if(arr[i].equals("y")){
                cy[i]=cy[i-1]+1;
            }
            else {
                cy[i]=cy[i-1];
            }
        }
        for(int i=1;i<=n;i++){
            if(arr[i].equals("z")){
                cz[i]=cz[i-1]+1;
            }
            else {
                cz[i]=cz[i-1];
            }
        }
        for(int i=1;i<=n;i++){
            if(arr[i].equals("w")){
                cw[i]=cw[i-1]+1;
            }
            else {
                cw[i]=cw[i-1];
            }
        }
        for(int i=1;i<=n;i++){
            if(arr[i].equals("b")){
                cb[i]=cb[i-1]+1;
            }
            else {
                cb[i]=cb[i-1];
            }
        }
        HashMap<ArrayList<Integer>,Integer> map=new HashMap<>();
        int count=0;
        for(int i=1;i<=n;i++){
            int d1=cy[i]-cx[i];
            int d2=cz[i]-cy[i];
            int d3=cw[i]-cz[i];
            int d4=cb[i]-cw[i];
            int d5=cx[i]-cb[i];
            ArrayList<Integer> lst=new ArrayList<>();
            lst.add(d1);
            lst.add(d2);
            lst.add(d3);
            lst.add(d4);
            lst.add(d5);
            map.put(lst, map.getOrDefault(lst, 0)+1);
        }
        for(ArrayList<Integer> key:map.keySet()){
            if((key.get(0)==key.get(1)) && (key.get(1)==key.get(2)) && (key.get(2)==key.get(3)) && (key.get(3)==key.get(4))){
                count+=map.get(key);
            }
        }
        System.out.println(count);
        sc.close();
        
    }
}
