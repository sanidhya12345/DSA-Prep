import java.util.*;

public class CountCommonPrefix {
  public static int[] findThePrefixCommonArray(int[] A, int[] B) {
    int n = A.length;
    int i = 0;
    int[] count = new int[n];
    while (i < n) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int j = i; j >= 0; j--) {
        map.put(A[j], map.getOrDefault(A[j], 0) + 1);
      }
      int common = 0;
      for (int j = i; j >= 0; j--) {
        if (map.containsKey(B[j])) {
          common++;
          map.put(B[j], map.getOrDefault(B[j], 0) - 1);
          if (map.get(B[j]) == 0) {
            map.remove(B[j]);
          }
        }
      }
      count[i] = common;
      i++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    for (int i = 0; i < n; i++)
      A[i] = sc.nextInt();
    for (int i = 0; i < n; i++)
      B[i] = sc.nextInt();
    System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    sc.close();
  }
}
