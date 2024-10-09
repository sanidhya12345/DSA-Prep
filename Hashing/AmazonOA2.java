package Hashing;

import java.util.HashMap;

public class AmazonOA2 {
    public static void main(String[] args) {
        int [] pw={2,4,6,6,4,2,4,6,6,6,6};
        int trips=0;
        boolean flag=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int weight:pw){
            map.put(weight,map.getOrDefault(weight, 0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)%2==0 && map.get(key)%3!=0){
                trips+=(map.get(key)/2);
            }
            else if(map.get(key)%3==0 && map.get(key)%2!=0){
                trips+=(map.get(key)/3);
            }
            else if(map.get(key)%3==0 && map.get(key)%2==0){
                trips+=Math.min((map.get(key)/2),(map.get(key)/3));
            }
            else{
                flag=true; //finds a weight which is not allowed to deliver acc. to rules.
                break;
            }
        }
        if(flag){
            System.out.println(-1);
        }
        else{
            System.out.println(trips);
        }
    }
}
