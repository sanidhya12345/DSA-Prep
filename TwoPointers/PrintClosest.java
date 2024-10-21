package TwoPointers;

import java.util.ArrayList;

public class PrintClosest {
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
       ArrayList<Integer> ans = new ArrayList<>();
        int fi = -1,si = -1 , i=0,j=m-1,min = Integer.MAX_VALUE;
        while(i<n && j>=0){
            int sum = (arr[i] + brr[j]);
            if(Math.abs(sum - x) < min){
                min = Math.abs(sum - x);
                fi = i;
                si = j;
            }else if(sum < x){
                i++;
            }else if(sum > x){
                j--;
            }else{
                fi = i;
                si = j;
                break;
            }
        }
        
        ans.add(arr[fi]);
        ans.add(brr[si]);
        
        return ans; 
    }
}
