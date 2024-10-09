package Hashing;

import java.util.*;
public class VisaSDEIntern {
    public static void main(String[] args) {
        int [][] lamps={{1,7},{5,11},{7,9}};
        int [] points={7,1,5,10,9,15};
        int [] ans=new int[points.length];
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<lamps.length;i++){
            for(int j=lamps[i][0];j<=lamps[i][1];j++){
                freq.put(j, freq.getOrDefault(j, 0)+1);
            }
        }
        for(int i=0;i<points.length;i++){
            if(freq.containsKey(points[i])){
                ans[i]=freq.get(points[i]);
            }
            else{
                ans[i]=0;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
