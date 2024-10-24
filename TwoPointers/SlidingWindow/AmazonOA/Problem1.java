package TwoPointers.SlidingWindow.AmazonOA;

// Author: Sanidhya Varshney
// Date: 2024-10-24 12:03
public class Problem1 {
    public static void main(String[] args) {
        int [] arr={5, 3, 9, 7, 4, 1, 8};
        int n=arr.length;
        int m=3; //windows size
        int totalsum=0;
        for(int i:arr) totalsum+=i;

        int i=0;
        int j=0;
        int sum=0;
        int maxSumSubarray=0;
        while(j<n){
            sum+=arr[j];
            if(j-i+1<m) j++;
            else if(j-i+1==m){
                maxSumSubarray=Math.max(maxSumSubarray,sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(totalsum-maxSumSubarray);
    }
}
