package Hashing;

import java.util.*;
public class PrefixCommonArray {
     public static void main(String[] args) {
        int [] a={2,3,1};
        int [] b={3,1,2};
        int [] count=new int[a.length];
        int i=0;
        while(i<a.length){

            HashMap<Integer,Integer> map=new HashMap<>();

            for (int j = i; j >= 0; j--) {
                map.put(a[j], map.getOrDefault(a[j], 0) + 1);
            }
            int cmn=0;
            for(int j=i;j>=0;j--){
                if(map.containsKey(b[j])){
                    cmn++;
                    map.put(b[j], map.get(b[j])-1);
                    if(map.get(b[j])==0){
                        map.remove(b[j]);
                    }
                }
            }
            count[i]=cmn;
            i++;
        }
        System.out.println(Arrays.toString(count));
     }
}
