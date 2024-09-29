package Hashing;
import java.util.*;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            else{
                map.put(ch,map.get(ch)-1);
            }
        }
        int count=0;
        for(char ch:map.keySet()){
            if(map.get(ch)==0){
                count++;
            }
        }
        return count==map.size();
    }
}
