package HackerrankBeginner;

import java.util.Collections;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
       int maxValue=Collections.max(a);
       int [] freqMap=new int[maxValue+1];
       for(Integer item:a){
           freqMap[item]++;
       }
       int ans=-1;
       for(int i=0;i<freqMap.length;i++){
           if(freqMap[i]==1){
               ans=i;
               break;
           }
       }
       return ans;
    }
}
