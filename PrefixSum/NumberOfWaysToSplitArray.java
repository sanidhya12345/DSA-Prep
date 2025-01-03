package PrefixSum;

public class NumberOfWaysToSplitArray {

    public static int solve(int [] nums){
        int n=nums.length;
        int total=0;
        for(int i:nums) total+=i;
        int prefixsum=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            prefixsum+=nums[i];
            int suffixsum=total-prefixsum;
            if(prefixsum>=suffixsum){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums={10,4,-8,7};
        System.out.println(solve(nums));
    }
}