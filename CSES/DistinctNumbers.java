package CSES;
import java.util.*;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        List<Integer> values = new ArrayList<>(n);
        
        // Read all elements into the list
        for (int i = 0; i < n; i++) {
            values.add(sc.nextInt());
        }
        
        // Sort the list
        Collections.sort(values);
        
        // Count distinct elements
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (!values.get(i).equals(values.get(i - 1))) {
                answer++;
            }
        }
        
        // Output the result, add 1 for the first unique element
        System.out.println(answer + 1);
        sc.close();
    }
}
