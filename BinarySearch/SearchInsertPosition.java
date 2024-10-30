package BinarySearch;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-30
 * Time: 11:53
 */

public class SearchInsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high+1;
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(arr, target));
    }
}