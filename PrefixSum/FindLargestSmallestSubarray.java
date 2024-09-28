package PrefixSum;

public class FindLargestSmallestSubarray {
    public static void main(String[] args) {
        int [] arr={3,1,3,-2,2};
        int maxLength=-1;
        int k=4;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[i];
                if(sum==k && (j-i+1)>maxLength){
                    maxLength=j-i+1;
                    System.out.println("Largest Subarray starts from "+i+" to "+j);
                }
            }
        }
    }
}
