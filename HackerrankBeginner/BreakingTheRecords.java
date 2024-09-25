package HackerrankBeginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
      public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
       int min=scores.get(0);
        int [] lowest=new int[scores.size()];
        lowest[0]=min;
        for(int i=1;i<scores.size();i++){
            min=Math.min(min,scores.get(i));
            lowest[i]=min;
        }
        System.out.println(Arrays.toString(lowest));

        int max=scores.get(0);
        int [] highest=new int[scores.size()];
        highest[0]=max;

        for(int i=1;i<scores.size();i++){
            max=Math.max(max,scores.get(i));
            highest[i]=max;
        }
        int mincount=0;
        int maxcount=0;

        for(int i=1;i<scores.size();i++){
            if(lowest[i-1]>lowest[i]){
                mincount++;
            }
            if(highest[i-1]<highest[i]){
                maxcount++;
            }

        }
        List<Integer> list=new ArrayList<>();
        list.add(maxcount);
        list.add(mincount);
        return list;
    }
}
