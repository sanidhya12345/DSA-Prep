package TwoPointers.SlidingWindow;
import java.util.*;
class Pair {
    int start;
    int end;
    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Solution {
    public Pair slidingWindow(String s, HashMap<Character, Integer> freqMapT, int wsize) {
        int i = 0;
        int j = 0;
        int n = s.length();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        
        while (j < n) {
            // Add the current character to the window map
            char ch = s.charAt(j);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            // Check if the window size is valid
            if (j - i + 1 < wsize) {
                j++;
            } else if (j - i + 1 == wsize) {
                // Verify if the current window satisfies the frequency requirements of t
                boolean isValid = true;
                for (char key : freqMapT.keySet()) {
                    if (windowMap.getOrDefault(key, 0) < freqMapT.get(key)) {
                        isValid = false;
                        break;
                    }
                }

                // If valid, return the current window as a Pair
                if (isValid) {
                    return new Pair(i, j);
                }

                // Slide the window
                char startChar = s.charAt(i);
                windowMap.put(startChar, windowMap.get(startChar) - 1);
                if (windowMap.get(startChar) == 0) {
                    windowMap.remove(startChar);
                }
                i++;
                j++;
            }
        }

        return new Pair(-1, -1);
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        // Create a frequency map for string t
        HashMap<Character, Integer> freqMapT = new HashMap<>();
        for (char ch : t.toCharArray()) {
            freqMapT.put(ch, freqMapT.getOrDefault(ch, 0) + 1);
        }

        String ans = "";
        for (int wsize = t.length(); wsize <= s.length(); wsize++) {
            Pair p = slidingWindow(s, freqMapT, wsize);
            if (p.start != -1 && p.end != -1) {
                ans = s.substring(p.start, p.end + 1);
                break;
            }
        }

        return ans;
    }
}


public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution obj=new Solution();
        String s="aaaaaaaaaaaabbbbbcdd";
        String t="abcdd";
        System.out.println(obj.minWindow(s, t));
    }
}
