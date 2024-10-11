package PrefixSum;

import java.util.*;
public class FindIncreasingSubsequence {

    public static boolean checkValidSubsequence(int [] arr,int n){
        int [] prefix=new int[n+1];
        int [] suffix=new int[n+1];
        prefix[1]=arr[1];
        suffix[n]=arr[n];

        //check for the minimum value present in array from 1----i-1 index.
        for(int i=2;i<=n;i++){
            prefix[i]=Math.min(prefix[i-1],arr[i]);
        }
        //check for the maximum value present in array from i+1----n index.
        for(int i=n-2;i>=1;i--){
            suffix[i]=Math.max(suffix[i+1],arr[i]);
        }

        for(int i=2;i<=n-1;i++){
            if(prefix[i-1]<arr[i] && arr[i]<suffix[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=sc.nextInt();
        System.out.println(checkValidSubsequence(arr, n));
        sc.close();        
    }
}
