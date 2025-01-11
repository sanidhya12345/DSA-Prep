import java.util.*;

public class FindTriplets {
    public static long binaryHelperLeft(int start, int end, Pair[] p, long target) {
        int low = start;
        int high = end;
        while (low <= high) {
            int mid = (low + high) / 2;
            long rightEnd = p[mid].second;
            if (rightEnd < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; // Count of intervals with ending[i] < starting[j]
    }

    public static long binaryHelperRight(int start, int end, Pair[] p, long target) {
        int low = start;
        int high = end;
        while (low <= high) {
            int mid = (low + high) / 2;
            long leftStart = p[mid].first;
            if (leftStart > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return end - high; // Count of intervals with starting[k] > ending[j]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] starting = new long[n];
        long[] ending = new long[n];
        for (int i = 0; i < n; i++) {
            starting[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            ending[i] = sc.nextLong();
        }
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(starting[i], ending[i]);
        }
        // Sort by ending in ascending order
        Arrays.sort(p, (a, b) -> Long.compare(a.second, b.second));

        long ans = 0;
        for (int j = 1; j < n - 1; j++) {
            long targetStart = p[j].first;
            long targetEnd = p[j].second;

            // Count intervals before j where ending[i] < starting[j]
            long ans1 = binaryHelperLeft(0, j - 1, p, targetStart);

            // Count intervals after j where starting[k] > ending[j]
            long ans2 = binaryHelperRight(j + 1, n - 1, p, targetEnd);

            // Multiply and add to the result
            ans += ans1 * ans2;
        }
        System.out.println(ans);
    }
}

class Pair {
    long first;
    long second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

