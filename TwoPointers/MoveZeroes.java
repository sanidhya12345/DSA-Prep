package TwoPointers;

import java.util.*;
public class MoveZeroes {
    public static  void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        while (i<n && j<n) {
            if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else if(nums[i]!=0 && nums[j]!=0){
                i++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums={0,1,0,3,12};
        moveZeroes(nums);
       System.out.println(Arrays.toString(nums));
    }
}
