package HackerrankBeginner;

import java.util.Collections;
import java.util.List;

public class MarkAndToys {
    public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
    Collections.sort(prices);
    int sum=0;
    int count=0;
    for(int i=0;i<prices.size();i++){
        sum+=prices.get(i);
        if(sum<=k){
            count++;
        }
        else{
            break;
        }
    }
    return count;
    }
}
