import java.util.*;
public class CountPairsSumLessK{
    public static int solve(int [] arr,int target){
        Arrays.sort(arr);
        int n=arr.length;
        int i=0;
        int j=n-1;
        int c=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target){
                c+=(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return c;
    }
    public static void main(String [] args){
        int [] arr={2,1,3,8,4,7,6,5};
        int target=7;
        System.out.println(solve(arr,target));
    }
}
