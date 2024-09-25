package HackerrankBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JimAndOrders {
    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
       List<Integer>list = new ArrayList<>();
      for(int i=0;i<orders.size();i++){
         list.add(orders.get(i).get(0)+orders.get(i).get(1)); 
       }
    List<Integer>list2 = new ArrayList<>(list);
    Collections.sort(list2);
    List<Integer>ans = new ArrayList<>();
    for(int i=0;i<list2.size();i++){
       ans.add(list.indexOf(list2.get(i))+1); 
     }
    return ans;
    }
}
