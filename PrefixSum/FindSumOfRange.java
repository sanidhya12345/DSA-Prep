package PrefixSum;
public class FindSumOfRange {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,7,5};
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int left=2;
        int right=4;
        System.out.println(prefix[right]-prefix[left-1]);
    }
}
