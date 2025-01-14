import java.util.*;

public class MaximumPossibleJourney {
  // bruteforce method
  public static int solve(int n, int[] arr) {
    int[] dp = new int[n + 1]; // dp[i] represents the max sum ending at index i

    // Initialize dp array
    for (int i = 1; i <= n; i++) {
      dp[i] = arr[i]; // At least the value of arr[i] (if journey starts and ends here)
    }

    // Fill dp array
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        if (j + arr[j] == i) { // Valid jump from j to i
          dp[i] = Math.max(dp[i], dp[j] + arr[i]);
        }
      }
    }

    // Find maximum in dp array
    int max = 0;
    for (int i = 1; i <= n; i++) {
      max = Math.max(max, dp[i]);
    }

    return max;
  }

  // optmize the above code using hashmap because the time complexity is not upto
  // the mark as
  // it will generates TLE
  //
  public static int solveHashMap(int[] arr) {
    HashMap<Integer, Integer> dpMap = new HashMap<>();
    int maxsum = 0;
    int n = arr.length - 1;
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      int jumpTo = i + arr[i];
      if (jumpTo <= n) {
        dpMap.put(i, jumpTo);
      } else {
        dpMap.put(i, -1);// indicates that no valid jump
      }
    }
    int maxSum = Integer.MIN_VALUE;
    for (int i = n; i >= 1; i--) {
      dp[i] = arr[i];
      if (dpMap.get(i) != -1) {
        dp[i] += dp[dpMap.get(i)];
      }
      maxSum = Math.max(maxSum, dp[i]);
    }
    return maxSum;
  }

  // more optmised solution using reverse dp
  public static int maxJourneySum(int[] arr) {
    int n = arr.length - 1;
    int[] dp = new int[n + 1];

    int maxSum = Integer.MIN_VALUE;
    for (int i = n; i >= 1; i--) {
      int futureIndex = i + arr[i];
      dp[i] = arr[i];
      if (futureIndex <= n) {
        dp[i] += dp[futureIndex];
      }
      maxSum = Math.max(maxSum, dp[i]);
    }

    return maxSum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(solve(n, arr));// solved using bruteforce.
    System.out.println(solveHashMap(arr));
    System.out.println(maxJourneySum(arr));
    sc.close();
  }
}
