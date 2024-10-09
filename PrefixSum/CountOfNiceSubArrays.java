package PrefixSum;

public class CountOfNiceSubArrays {
    public static void main(String[] args) {
        int [] arr={1,1,2,1,1};
        int n=4;
        int k=3;

        int [] count=new int[n+1];
        count[0]=1;
        int oddcount=0;
        int result=0;
        for(int num:arr){
            if(num%2!=0) oddcount++;
            if(oddcount-k>=0){
                result+=count[oddcount-k];
            }
            count[oddcount]++;
        }
        System.out.println(result);
    }
}
