package BinarySearch;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-31
 * Time: 09:59
 */

import java.util.*;
public class CountingElementsInTwoArrays {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       Arrays.sort(arr2);
       ArrayList<Integer>ans=new ArrayList<>();
       for(int i=0;i<arr1.length;i++)
       {
           int count=0;
           int target=arr1[i];
           int lo=0;
           int hi=arr2.length-1;
           while(lo<=hi)
           {
               int mid=(lo)+(hi-lo)/2;
               if(arr2[mid]==target)
               {
                   count=count+mid-lo+1;
                   lo=mid+1;
               }
               else if(arr2[mid]<target)
               {
                   count+=mid-lo+1;
                   lo=mid+1;
               }
               else{
                   if(arr2[mid]>target)
                   {
                       hi=mid-1;
                   }
               }
           }
           ans.add(count);
       }
       return ans;
    }
}