package TwoPointers;

public class CountSubarrayWithSumLessThanK {
    public static void main(String[] args) {
        int [] arr={1,11,2,3,15};
        int n=arr.length;
        int k=10;
        int count=0;
        int sum=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum<=k){
                count+=(right-left+1);
            }
        }
        System.out.println(count);
    }
}
