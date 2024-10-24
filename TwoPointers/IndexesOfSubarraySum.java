package TwoPointers;

// Author: Sanidhya Varshney
// Date: 2024-10-24 11:02
public class IndexesOfSubarraySum {
    public static void main(String[] args) {
        int [] arr={5,3,4};
        int n=arr.length;
        int target=2;
        int sum=0;
        for(int i=0,j=0;j<n;j++){
            sum+=arr[j];
            while(sum>target){
                sum-=arr[i];
                i++;
            }
            if(sum==target){
                System.out.println(i+1+" "+(j+1));
                break;
            }
        }
    }
}
