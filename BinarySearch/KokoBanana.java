package BinarySearch;

import java.util.*;
public class KokoBanana {
    public static int totalHours(int []arr,int n,int k){
        int totalHrs=0;
        for(int i=0;i<n;i++){
            totalHrs += (arr[i] + k - 1) / k; // This is a way to do ceiling division for positive integers
        }
        return totalHrs;
    }
    public static void main(String[] args) {
        int [] arr={30,11,23,4,20};
        int n=arr.length;
        int h=6;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1];
        while (low<high) {
            int mid=(low+high)/2;
            int totalHrs=totalHours(arr, n, mid);
            if(totalHrs<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
}
