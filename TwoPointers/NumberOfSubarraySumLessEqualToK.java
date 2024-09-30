package TwoPointers;

public class NumberOfSubarraySumLessEqualToK{
    public static void main(String[] args) {
        int [] arr={2,1,1,8,2,2};
        int sum=0;
        int k=4;
        int count=0;
        for (int i = 0, j = 0; j < arr.length; j++) {
            sum += arr[j];
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
            count += (j - i + 1);
        }
        System.out.println(count);
    }
}