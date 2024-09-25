package HackerrankBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
     public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        List<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(Integer i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        int maxValue=Collections.max(map.values());
        for(Integer key:map.keySet()){
            if(maxValue==map.get(key)){
                ans.add(key);
            }
        }
        if(ans.size()==1){
            System.out.println(ans.get(0));
        }
        return Collections.min(ans);
    }

}
