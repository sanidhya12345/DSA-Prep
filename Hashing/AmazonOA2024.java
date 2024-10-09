package Hashing;

import java.util.HashMap;

public class AmazonOA2024 {
    public static void main(String[] args) {
        String s="abdadccacd";
        String t="edac";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int maxCount=Integer.MAX_VALUE;
        boolean flag=false;
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch)){
                maxCount=Math.min(maxCount,map.get(ch));
            }
            else{
                flag=true;  //finds a character which is not present in the hashmap.
                break;
            }
        }
        if(flag){
            System.out.println(0);
        }
        else{
            System.out.println(maxCount);
        }
    }
}
