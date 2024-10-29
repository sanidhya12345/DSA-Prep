package BinarySearch.Amazon;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-29
 * Time: 20:33
 */


public class Solution2 {
    public static void main(String[] args) {
        // Your code here
        int [] arr={2,2,2,3,3,4,4,4,5,5,5};
        int k=3;
        int n=arr.length;
        int low=0;
        int high=n-1;
        while (low<high) {
            int mid=(low+high)/2;
            if(mid%k==0){
                if(arr[mid]==arr[mid+k-1]){
                    low=mid+k;
                }
                else{
                    high=mid;
                }
            }
            else{
                mid=mid-(mid%k);
                if(arr[mid]==arr[mid+k-1]){
                    low=mid+k;
                }
                else{
                    high=mid;
                }
            }
        }
        System.out.println(arr[low]);
    }
}