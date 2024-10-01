package BinarySearch;

public class UpperBound {
    public static int upperBound(int [] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6 , 6, 7, 7, 9};
        int target = 6;
        System.out.println(upperBound(arr, target));
    }
}