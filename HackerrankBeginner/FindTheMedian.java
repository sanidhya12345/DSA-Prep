package HackerrankBeginner;

import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
    // Write your code here
      Collections.sort(arr);
      int n=arr.size();
      return arr.get(((n+1)/2)-1);

    }
}
