package PrefixSum;

import java.util.*;
public class SprinkleOA {

    public static int numberOfSubstringInRange(String s,int l,int r,int [][] prefix){
        int ans=0;
        for(int i=0;i<26;i++){
            int num=prefix[r][i]-prefix[l-1][i];
            ans+=(num*(num+1)/2);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of string
        int q=sc.nextInt();//queries
        String s=sc.next();
        int [][] prefix=new int[n+1][26]; 
        //row number of prefix matrix denotes 'ith' index and each row consist of 26 columns which represents the frequency of all letters till 'ith' index.
        for(int i=0;i<n;i++){
            int e=s.charAt(i)-'a';
            for(int j=0;j<26;j++){
                prefix[i+1][j]=(e==j)?1:0;
                prefix[i+1][j]+=prefix[i][j];
            }
        }
        while(q--!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(numberOfSubstringInRange(s, l, r, prefix));
        }
        sc.close();

    }
}
