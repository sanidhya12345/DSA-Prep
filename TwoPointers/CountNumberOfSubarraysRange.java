package TwoPointers;

public class CountNumberOfSubarraysRange {

    public static long countSubArray(int[] arr, int n, long k) {
        long ans=0;
        long sum=0;
        for(int l=0, r=0; r<n;r++){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    long countSubarray(int N,int A[],long L,long R) {
        long ans1=countSubArray(A,N,R);
        long ans2=countSubArray(A,N,L-1);
        return ans1-ans2;
    }
}
