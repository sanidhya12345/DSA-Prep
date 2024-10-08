package Hashing;

import java.util.*;
public class LongestPalindromByConcatenation {
    public static void main(String[] args) {
        String [] words={"ab","ty","yt","lc","cl","ab"};
        HashMap<String,Integer> map=new HashMap<>();
        boolean flag=false;
        for(String word:words) map.put(word,map.getOrDefault(word, 0)+1);

        //2 cases

        //1.if words[i][0]!=words[i][1]

        int len=0;
        for(int i=0;i<words.length;i++){

            String s="";
            s+=words[i].charAt(1);
            s+=words[i].charAt(0);

            if(map.containsKey(s)){
                int count=Math.min(map.get(words[i]),map.get(s));

                len+=(count*4); //lc cl

                map.remove(words[i]);
                map.remove(s);
            }
            //2.words[i][0]==words[i][1]
            else if(words[i].charAt(0)==words[i].charAt(1)){

                int count=map.get(words[i]);

                //even

                if(count%2==0){
                    len+=(count*2);
                }

                //odd
                else{
                    if(flag==false){
                        len+=(count*2);
                        flag=true;
                    }
                    else{
                        len+=(count-1)*2;
                    }
                }
                map.remove(words[i]);
            }
        }
        System.out.println(len);

    }
}
