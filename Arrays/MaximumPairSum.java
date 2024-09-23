package Arrays;

public class MaximumPairSum {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4};
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(maxSum<arr1[i]+arr2[j]){
                    maxSum=arr1[i]+arr2[j];
                }
            }
        }
        System.out.println("Maximum Pair Sum: "+maxSum);
    }
}
