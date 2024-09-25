package HackerrankBeginner;

import java.util.Collections;
import java.util.List;

public class TheHurdleRace {
     public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
      int max=Collections.max(height);
      if(max>k){
          return max-k;
      }
      return 0;

    }
}
