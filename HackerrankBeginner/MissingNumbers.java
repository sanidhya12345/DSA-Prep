package HackerrankBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
     
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:brr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        
        for(Integer i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
            }
        }
        List<Integer> lst=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)!=0){
                lst.add(key);
            }
        }
        Collections.sort(lst);
        return lst;

    }

}
