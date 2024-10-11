package Hashing;

import java.util.*;
public class UberOAProblem {
    public static void main(String[] args) {
       int[][] g = new int[200005][28];
       List<String> lst=new ArrayList<>();
       lst.add("abc");
       lst.add("ade");
       lst.add("abc");
       int n=lst.size();
       List<Integer> ans=new ArrayList<>(n);
       for(int i=0;i<n;i++) ans.add(0);

       for(int i=n-1;i>=0;i--){
           String s=lst.get(i);
           int c=0;
           int l=s.length();

           for(int j=0;j<l;j++){  //j represent the column number
              int ch=s.charAt(j)-'a';
              c=c+g[j][ch];   //g[j][ch] --> tells you the frequency of ch in col "j"
              g[j][ch]=g[j][ch]+1;
           }
           ans.set(i, c);
       }
       System.out.println(ans);

    }
}
