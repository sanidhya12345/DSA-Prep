package DynamicProgramming;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-05
 * Time: 09:56
 */

import java.util.*;
public class AtcoderVacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[n+1];
        long[] c = new long[n+1];

        int i = 1;
        while (i <= n) {
            a[i] = input.nextLong();
            b[i] = input.nextLong();
            c[i] = input.nextLong();
            i++;
        }

        long[] dpa = new long[n+1];
        long[] dpb = new long[n+1];
        long[] dpc = new long[n+1];

        dpa[1] = a[1];
        dpb[1] = b[1];
        dpc[1] = c[1];

        i = 2;
        while (i <= n) {
            dpa[i] = a[i] + Math.max(dpb[i-1], dpc[i-1]);
            dpb[i] = b[i] + Math.max(dpa[i-1], dpc[i-1]);
            dpc[i] = c[i] + Math.max(dpa[i-1], dpb[i-1]);
            i++;
        }

        System.out.println(Math.max(dpa[n], Math.max(dpb[n], dpc[n])));
        input.close();
    }
}