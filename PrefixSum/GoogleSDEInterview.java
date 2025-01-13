import java.util.Scanner;

public class GoogleSDEInterview {
  public static int longestIncreasing(int n, int[] arr) {
    if (n == 0)
      return 0;

    // Arrays to store the lengths of increasing subarrays
    int[] best = new int[n + 1]; // Length of increasing subarray ending at index i
    int[] best1 = new int[n + 1]; // Length with at most one change

    // Initialize best array
    best[0] = 1;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[i - 1]) {
        best[i] = best[i - 1] + 1;
      } else {
        best[i] = 1;
      }
    }

    // Calculate best1 array
    best1[0] = 1;
    int finalAnswer = 1;
    for (int i = 1; i < n; i++) {
      // Length of the current increasing subarray
      int len = best[i];

      // Check if changing one element helps
      if (i - len > 0 && arr[i - len] > arr[i - len - 1] + 1) {
        best1[i] = best[i] + 1 + best[i - len - 1];
      } else {
        best1[i] = best[i] + 1;
      }

      // Update the final answer
      finalAnswer = Math.max(finalAnswer, best1[i]);
    }

    return finalAnswer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(longestIncreasing(n, arr));
    sc.close();
  }
}
