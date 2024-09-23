package Arrays;

public class SumOfPairsSingleArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[i]+arr[j];
            }
        }
        System.out.println("Total Pair Sum of the array: "+sum);
    }
}
