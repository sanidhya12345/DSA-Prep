package HackerrankBeginner;

import java.util.List;

public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
      int total = 0;
      for(Integer i:arr) total+=i;
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            int current = arr.get(i);
            count+=current;
            if((total - current)/2 == count - current) return "YES";
        }
        return "NO";
    }
}
