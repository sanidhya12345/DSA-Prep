package TwoPointers;

/*

 Given an array of numbers which are sorted find the largest subarray such that the difference between abs(maximum-minimum)<=K
 */
public class FindLargestSubarrayWithABSK {

    public static int findLargest(int [] arr,int n,int k){
        int left=0;
        int right=n-1;
        int res=0;
        while(left<=right){
            //calculate the difference b/w left and right
            int diff=Math.abs(arr[right]-arr[left]);

            if(diff>k){
                right--;
            }
            else{
                res=Math.max(res, right-left+1);
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={5,5,5,5,5};
        int k=0;
        int n=arr.length;
        System.out.println(findLargest(arr, n, k));
    }
}
