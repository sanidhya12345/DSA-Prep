package TwoPointers;

public class ShortestSubArrayWithSumAtleastK {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int k=11;
        int n=arr.length;
        int minLength=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
               while(sum>=k && left<=right){
                minLength=Math.min(minLength, right-left+1);
                sum-=arr[left];
                left++;
            }
            if(left<=right){}
            else{
                right=left;
            }
        }
        System.out.println(minLength);
    }
}
