package Other;

import java.util.HashMap;

public class SmallestPositiveMissingNumber {
    public int missingNumber(int[] arr) {
        // Your code here
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:arr){
            if(i>=0) map.put(i,true);
        }
        int ans=-1;
        for(int i=0;i<=1000001;i++){
            if(!map.containsKey(i+1)){
                ans=i+1;
                break;
            }
        }
        return ans;
        
    }
}
