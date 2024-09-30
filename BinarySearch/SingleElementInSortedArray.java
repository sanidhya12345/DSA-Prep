package BinarySearch;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
         int right=nums.length-1;
         while(left<right){
             int mid=(left+right)/2;
             if(nums[mid]==nums[mid+1]){
                 mid=mid-1;
             }
             if((mid-left+1)%2!=0){
                 right=mid;
             }
             else{
                 left=mid+1;
             }
         }
         return nums[left];
     }
}
