package HackerrankBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetweenTwoSets {
     public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int start=1;
        int end=Collections.min(b);

        List<Integer> aFactors=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(Integer i:a){
            for(int val=start;val<=end;val++){

                if(val%i==0){
                    aFactors.add(val);
                }
            }
        }

        for(Integer i:aFactors){

            for(Integer val:a){

                if(i%val!=0){
                   ans.add(i);
                }
            }
        }
       
        aFactors.removeAll(ans);
        Set<Integer> set=new HashSet<>(aFactors);
        
        int fc=0;
        for(Integer i:set){
            int c=0;
            for(Integer j:b){
                if(j%i==0){
                    c++;
                }
                if(c==b.size()){
                    fc++;
                }
            }
        }
        return fc;
    }
}
