package Other;

import java.util.HashMap;

public class SubarrayWithZeroSum {
    static boolean findsum(int arr[]) {
        // Your code here
        int n=arr.length;
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++) prefix[i]=prefix[i-1]+arr[i];
        
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<n;i++){
            
            if(map.containsKey(prefix[i]) || prefix[i]==0){
                return true;
            }
            else{
                map.put(prefix[i],true);
            }
        }
        return false;
    }
}
