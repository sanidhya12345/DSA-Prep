package BinarySearch;

public class KthMissingPositive {

    public static boolean find(int [] arr,int target,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        int ans=0;
        for(int i=1;i<=1000000;i++){
            if(find(arr,i,n)==false){
                k--;
            }
            if(k==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        KthMissingPositive obj=new KthMissingPositive();
        int [] arr={2, 3, 4, 7, 11};
        int k=5;
        System.out.println(obj.kthMissing(arr, k));
    }
}