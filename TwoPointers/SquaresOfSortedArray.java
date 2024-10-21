package TwoPointers;
import java.util.*;
public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i]*nums[i];
        }
        int n=nums.length;
        int i=0;
        int j=n-1;
        for(int k=n-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[k]=nums[i]*nums[i];
                i++;
            }
            else{
                ans[k]=nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
