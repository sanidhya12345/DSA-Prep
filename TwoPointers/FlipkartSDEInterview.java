package TwoPointers;

import java.util.*;
public class FlipkartSDEInterview {
    public static void main(String[] args) {
        int [] arr={1,3 ,8 ,4 ,8, 2 ,10, 11, 15, 18, 111};
        int n=arr.length;
        int ans=-1;
        HashMap<Integer,Integer> visited=new HashMap<>();
        for(int i=0,j=0;j<n;j++){
            if(visited.containsKey(arr[j])){
                i=visited.get(arr[j]);
                j=i;
                visited.clear();
            }
            else{
                visited.put(arr[j], j);
            }
            ans=j-i;
        }
        System.out.println(ans);
    }
}
