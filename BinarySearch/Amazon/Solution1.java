package BinarySearch.Amazon;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-29
 * Time: 17:11
 */

import java.util.*;
public class Solution1 {

    public static int totalDays(int [] arr,int n,int x){
        int total=0;
        for(int i=0;i<n;i++){
            total+=(arr[i]+x-1)/x;
        }
        return total;
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1];
        while (low<high) {
            int mid=(high+low)/2;
            int tdays=totalDays(arr, n, mid);
            if(tdays<=d){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
        sc.close();
    }
}