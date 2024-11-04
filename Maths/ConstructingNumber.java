package Maths;

import java.util.List;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-04
 * Time: 16:57
 */

public class ConstructingNumber {
    public static String canConstruct(List<Integer> a) {
        // Return "Yes" or "No" denoting whether you can construct the required number.
        int n = a.size();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        if (sum % 3 == 0)
            return "Yes";
        else
            return "No";
    }

}