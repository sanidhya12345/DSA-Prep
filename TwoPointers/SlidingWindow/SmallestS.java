package TwoPointers.SlidingWindow;
public class SmallestS {
    public static String smallestSubstring(String str, int k) {
        // Edge case: if k = 1, just find the character with the smallest ASCII value
        if (k == 1) {
            char minChar = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) < minChar) {
                    minChar = str.charAt(i);
                }
            }
            return String.valueOf(minChar);
        }
        
        // General case: sliding window approach
        int i = 0, j = 0, n = str.length();
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;

        // Initialize the sliding window
        while (j < n) {
            sum += (int)(str.charAt(j));
            
            if (j - i + 1 < k) {
                // Keep expanding the window to size k
                j++;
            } else if (j - i + 1 == k) {
                // Check if this window has the smallest sum
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
                
                // Slide the window
                sum -= (int)(str.charAt(i)); // Remove the ASCII value of the outgoing character
                i++;
                j++;
            }
        }
        
        // Return the substring with the smallest sum found
        return str.substring(minIndex, minIndex + k);
    }
}
