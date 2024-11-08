package DynamicProgramming;
import java.util.Scanner;

public class AtlassianOa {
    public static long max(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }

    public static long min(long a, long b, long c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading 't'
        while (t-- > 0) {
            long b = scanner.nextLong();
            scanner.nextLine(); // Consume the newline character after reading 'b'
            long[] dp1 = new long[(int) (b + 1)];
            long[] dp2 = new long[(int) (b + 1)];
            dp1[0] = 1;
            dp2[0] = dp1[0];
            for (long i = 1; i <= b; i++) {
                String line = scanner.nextLine();
                char g = line.charAt(0);
                long e = 0;
                if (line.length() > 2) {
                    e = Long.parseLong(line.substring(2)); // Extract the integer value
                }
                if (g == '+') {
                    dp1[(int) i] = max(dp1[(int) (i - 1)] + e, dp2[(int) (i - 1)] + e, dp1[(int) (i - 1)]);
                    dp2[(int) i] = min(dp1[(int) (i - 1)] + e, dp2[(int) (i - 1)] + e, dp2[(int) (i - 1)]);
                } else if (g == '-') {
                    dp1[(int) i] = max(dp1[(int) (i - 1)] - e, dp2[(int) (i - 1)] - e, dp1[(int) (i - 1)]);
                    dp2[(int) i] = min(dp1[(int) (i - 1)] - e, dp2[(int) (i - 1)] - e, dp2[(int) (i - 1)]);
                } else if (g == '*') {
                    dp1[(int) i] = max(dp1[(int) (i - 1)] * e, dp2[(int) (i - 1)] * e, dp1[(int) (i - 1)]);
                    dp2[(int) i] = min(dp1[(int) (i - 1)] * e, dp2[(int) (i - 1)] * e, dp2[(int) (i - 1)]);
                } else if (g == '/') {
                    dp1[(int) i] = max(dp1[(int) (i - 1)] / e, dp2[(int) (i - 1)] / e, dp1[(int) (i - 1)]);
                    dp2[(int) i] = min(dp1[(int) (i - 1)] / e, dp2[(int) (i - 1)] / e, dp2[(int) (i - 1)]);
                } else {
                    dp1[(int) i] = max(-1 * dp1[(int) (i - 1)], -1 * dp2[(int) (i - 1)], dp1[(int) (i - 1)]);
                    dp2[(int) i] = min(-1 * dp1[(int) (i - 1)], -1 * dp2[(int) (i - 1)], dp2[(int) (i - 1)]);
                }
            }
            System.out.println(dp1[(int) b]);
        }
        scanner.close();
    }
}
