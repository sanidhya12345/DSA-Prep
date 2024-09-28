package Leetcode;

public class Leetcode2574 {
    public int[] leftRightDifference(int[] nums) {
        int [] leftPref=new int[nums.length];
        int [] rightPref=new int[nums.length];
        leftPref[0]=nums[0];
        rightPref[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            leftPref[i]=leftPref[i-1]+nums[i];
        }
        for(int j=nums.length-2;j>=0;j--){
            rightPref[j]=rightPref[j+1]+nums[j];
        }
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftPref[i]-rightPref[i]);
        }
        return ans;
    }
}
