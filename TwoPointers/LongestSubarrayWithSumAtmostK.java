package TwoPointers;

public class LongestSubarrayWithSumAtmostK {
    public static void main(String[] args) {
        int [] arr={1,2,1,0,1,1,0};
        int k=4;
        int n=arr.length;
        int left=0;
        int sum=0;
        int maxLength=Integer.MIN_VALUE;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            maxLength=Math.max(maxLength, right-left+1);
        }
        System.out.println(maxLength);
    }
}
