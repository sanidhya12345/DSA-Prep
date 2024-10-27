package Other;

// Author: Sanidhya Varshney
// Date: 2024-10-27 14:24

import java.util.*;
public class LongestIncreasingSubsequence {
    public int findLongestConseqSubseq(int[] arr) {
        // code here
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num);
    }

    int longestStreak = 0;

    for (int num : set) {
        // Only check for sequences starting from the smallest element in the sequence
        if (!set.contains(num - 1)) {
            int currentNum = num;
            int currentStreak = 1;

            // Check for the next consecutive elements
            while (set.contains(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            // Update the longest streak found
            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }
        return longestStreak;
        
    }
}
