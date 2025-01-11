import java.util.*;

public class FindQuadruplets {
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
        return end - high; // Count of intervals with starting[l] > ending[k]
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

        // Iterate over the second interval (j)
        for (int j = 1; j < n - 2; j++) {
            long targetStartJ = p[j].first;

            // Count valid i intervals before j
            long countI = binaryHelperLeft(0, j - 1, p, targetStartJ);

            // Iterate over the third interval (k)
            for (int k = j + 1; k < n - 1; k++) {
                long targetEndJ = p[j].second;
                long targetStartK = p[k].first;
                long targetEndK = p[k].second;

                // Count valid l intervals after k
                long countL = binaryHelperRight(k + 1, n - 1, p, targetEndK);

                // Multiply counts of valid i, j, k, and l
                ans += countI * countL;
            }
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

