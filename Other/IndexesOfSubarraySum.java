import java.util.*;
public class IndexesOfSubarraySum{
    public static ArrayList<Integer> subarraySum(int [] arr, int target){
        int n=arr.length;
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0,j=0;j<n;j++){
            sum+=arr[j];
            while(sum>target){
                sum-=arr[i];
                i++;
            }
            if(sum==target){
                list.add(i+1);
                list.add(j+1);
                break;
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        return list;
    }
    public static void main(String [] args){
        int [] arr={1,2,3,7,5};
        int target=12;
        System.out.println(subarraySum(arr,target));
    }
}
