package TwoPointers;

public class NumberOfPairsLessEqualToK {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int k=2;
        int count=0;
        for(int i=0,j=0;j<arr.length;j++){
            int diff=arr[j]-arr[i];
            while(diff>k){
                i++;
                diff=arr[j]-arr[i];
            }
            count+=j-i+1;
        }
        System.out.println(count-arr.length);
    }
}
