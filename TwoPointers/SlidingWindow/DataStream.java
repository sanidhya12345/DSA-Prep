package TwoPointers.SlidingWindow;

import java.util.*;
// Author: Sanidhya Varshney
// Date: 2024-10-25 16:39
public class DataStream {
    ArrayList<Integer> list=new ArrayList<>();
    int value;
    int k;
    
    //constructor
    public DataStream(int value, int k) {
        this.value=value;
        this.k=k;
    }
    int i=0;
    int j=0;
    int count=0;
    public boolean consec(int num) {
        boolean ans=false;
        list.add(num);
        
        if(list.get(j)==value) count++;
        if(j-i+1<k){
            j++;
            ans=false;
        }
        else if(j-i+1==k){
            
            if(count==k) ans =true;
            else ans=false;
            
            if(list.get(i)==value) count--;
            i++;
            j++;
        }
        return ans;
    }
}
