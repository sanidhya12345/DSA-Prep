package Arrays;

public class SumOfPairsTwoArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                sum+=arr1[i]+arr2[j];
            }
        }
        System.out.println("Total Pair Sum: "+sum);
    }
}
