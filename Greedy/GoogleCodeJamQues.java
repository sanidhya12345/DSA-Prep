package Greedy;
import java.util.*;
public class GoogleCodeJamQues {
    public static void main(String[] args) {
        int [] a={1,8,5}; 
        int [] b ={-1,80,0};
        
        //first array need to be descedingly sorted.
        Integer [] aIntegers=new Integer[a.length];
        for(int i=0;i<a.length;i++){
            aIntegers[i]=a[i];
        }
        Arrays.sort(aIntegers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Sorting in descending order
                return b - a;  // or return Integer.compare(b, a);
            }
        });

        //second array need to be ascendingly sorted

        Arrays.sort(b);

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+(aIntegers[i]*b[i]);
        }
        System.out.println(sum);
    }
}
