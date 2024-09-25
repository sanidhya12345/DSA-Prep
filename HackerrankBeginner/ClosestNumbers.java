package HackerrankBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
       Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i<arr.size(); i++) {
                int diff = Math.abs(Math.subtractExact(arr.get(i), arr.get(i-1)));
                if (diff < min) {
                        min = diff;
                        resultList.clear();
                        resultList.add(arr.get(i-1));
                        resultList.add(arr.get(i));
                } else if (diff == min) {
                        resultList.add(arr.get(i-1));
                        resultList.add(arr.get(i));
                }
        }
        return resultList;

    }
}
