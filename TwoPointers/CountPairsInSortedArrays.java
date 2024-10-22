package TwoPointers;

public class CountPairsInSortedArrays {

    public static int findPairs(int [] arr,int n,int x){
        int result=0;
        int left=0;
        int right=n-1;
        while(left<right){

            if(arr[left]+arr[right]<x){
                result+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5, 6, 7, 8};
        int n=arr.length;
        int x=7;
        System.out.println(findPairs(arr, n, x));
    }
}
