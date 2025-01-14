import java.util.*;

public class MinimumLengthOfString {
  public static int minimumLength(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    int numDeletions = 0;
    for (char ch : map.keySet()) {
      if (map.get(ch) > 2) {
        if (map.get(ch) % 2 == 0) {
          numDeletions += (map.get(ch) - 2);
        } else {
          numDeletions += (map.get(ch) - 1);
        }
      }
    }
    return s.length() - numDeletions;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(minimumLength(s));
    sc.close();
  }
}
