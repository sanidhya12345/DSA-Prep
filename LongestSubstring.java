import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
  public static int longestSubstring(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int i = 0;
    int n = s.length();
    int maxlen = 0;
    for (int j = 0; j < n; j++) {
      map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
      while (map.get(s.charAt(j)) > 1) {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
        if (map.get(s.charAt(i)) == 0) {
          map.remove(s.charAt(i));
        }
        i++;
      }
      maxlen = Math.max(maxlen, j - i + 1);
    }
    return maxlen;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(longestSubstring(s));
    sc.close();
  }
}
