package BinarySearch;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-03
 * Time: 16:53
 */


public class BStemplate {
    public static int binarySearch(int [] arr,int n,int target){
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low++;
            }
            else{
                high--;
            }
        }
        return -1;
    }
}