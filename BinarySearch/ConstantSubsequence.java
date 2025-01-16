import java.util.*;
import java.io.*;

public class ConstantSubsequence {
  public static boolean check(long mid, List<Long> positive, List<Long> negative) {
    int i = 0, j = 0;
    long sum = 0;

    while (i < positive.size() || j < negative.size()) {
      if (i < positive.size() && sum + positive.get(i) <= mid) {
        sum += positive.get(i);
        i++;
      } else if (j < negative.size()) {
        sum += negative.get(j);
        j++;
        if (sum < 0)
          sum = 0;
      } else {
        return false;
      }
    }
    return true;
  }

  public static long maxSubarraySum(int n, long[] arr) {
    long sum = 0;
    long ans = Long.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      sum = Math.max(sum + arr[i], arr[i]);
      ans = Math.max(sum, ans);
    }
    return ans;
  }

  // the largest element of the array will be the minimum largest subarrray sum
  // possible,
  public static long lowerBound(long[] arr) {
    long lb = Long.MIN_VALUE;
    for (long i : arr)
      lb = Math.max(i, lb);
    return lb;
  }

  // the sum of all the positive elements will be the maximum largest subarray sum
  // possible.
  public static long upperBound(long[] arr) {
    long ub = 0;
    for (long i : arr) {
      ub += i > 0 ? i : 0;
    }
    return ub;
  }

  public static long binaryHelper(int n, long[] arr) {
    List<Long> positive = new ArrayList<>();
    List<Long> negative = new ArrayList<>();

    // Separate the array into positive and negative lists maintaining the order
    for (long num : arr) {
      if (num >= 0) {
        positive.add(num);
      } else {
        negative.add(num);
      }
    }

    if (positive.isEmpty() && negative.isEmpty()) {
      return 0;
    }

    long low = lowerBound(arr);
    long high = upperBound(arr);
    while (low <= high) {
      long mid = (low + high) / 2;
      if (check(mid, positive, negative)) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  public static void main(String[] args) {
    StdIn in = new StdIn();
    PrintWriter out = new PrintWriter(System.out);
    int test = in.nextInt();
    while (test-- != 0) {
      int n = in.nextInt();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = in.nextLong();
      }
      long ans = binaryHelper(n, arr);
      if (ans >= 0) {
        out.println(ans);
      } else {
        out.println(0);
      }
    }
    out.flush();
  }
}

class StdIn {
  BufferedReader br;
  StringTokenizer st;

  public StdIn() {
    br = new BufferedReader(new InputStreamReader(System.in));
  }

  String next() {
    while (st == null || !st.hasMoreElements()) {
      try {
        st = new StringTokenizer(br.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return st.nextToken();
  }

  int nextInt() {
    return Integer.parseInt(next());
  }

  long nextLong() {
    return Long.parseLong(next());
  }

  double nextDouble() {
    return Double.parseDouble(next());
  }

  String nextLine() {
    String str = "";
    try {
      str = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return str;
  }
}
