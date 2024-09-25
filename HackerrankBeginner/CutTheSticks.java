package HackerrankBeginner;

import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {
     public static int getMin(List<Integer> b){
        int min=Integer.MAX_VALUE;
        for(int n:b){
            if(n>0 && n<min){
                min=n;
            }
        }
        return min;
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    List<Integer> result=new ArrayList<>();
    int ArrSize=(int)arr.stream().filter(i-> i!=0).count();
    
    while(ArrSize!=0){
        result.add(ArrSize);
        int n=getMin(arr);
        
    for(int i=0;i<arr.size();i++){  
        if(arr.get(i)!=0){
            arr.set(i, arr.get(i)-n);
        }
    }  
    ArrSize=(int)arr.stream().filter(i-> i!=0).count(); 
    }
    
    return result;
    }
}
