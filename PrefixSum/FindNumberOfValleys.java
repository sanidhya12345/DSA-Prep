package PrefixSum;

import java.util.Scanner;

public class FindNumberOfValleys {
    public static int[] prefix(int [] arr,int n){
        int [] pref=new int[n+1];
        pref[0]=0;
        for(int i=1;i<=n;i++){
            if(arr[i-1]>arr[i]){
                pref[i]=pref[i-1]+1;
            }
            else{
                pref[i]=1;
            }
        }
        return pref;
    }
    public static int[] suffix(int [] arr,int n){
        int [] suff=new int[n+1];
        suff[n]=1;
        for(int i=n-1;i>=1;i--){
            if(arr[i+1]>arr[i]){
                suff[i]=suff[i+1]+1;
            }
            else{
                suff[i]=1;
            }
        }
        return suff;
    }
    public static int numberOfValleys(int [] arr,int n){
        int [] prefix=prefix(arr, n);
        int [] suffix=suffix(arr, n);
        int ans=0;

        for(int i=1;i<=n;i++){
            ans=ans+((prefix[i]-1)*(suffix[i]-1));// add all the possible combinations to the ans.
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=sc.nextInt();
        System.out.println(numberOfValleys(arr, n));
        sc.close();
    }
}