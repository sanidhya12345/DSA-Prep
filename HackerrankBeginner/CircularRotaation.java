package HackerrankBeginner;

import java.util.ArrayList;
import java.util.List;

public class CircularRotaation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
       for(int i = 0;i<k;i++){
            a.add(0,a.get(a.size() - 1));
            a.remove(a.size()-1);
        }
        List<Integer> q = new ArrayList<>();
        for(int i : queries){
            q.add(a.get(i));
        }
        return q;
    }
}
