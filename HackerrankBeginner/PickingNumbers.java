package HackerrankBeginner;
import java.util.*;
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int maxLength=0;
        for(int i=0;i<a.size();i++){
            int curLen=0;
            for(int j=i;j<a.size();j++){
                if(Math.abs(a.get(i)-a.get(j))<=1){
                    curLen++;
                }
            }
            maxLength=Math.max(maxLength,curLen);
        }
        return maxLength;
        }
}
