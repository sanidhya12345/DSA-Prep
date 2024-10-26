package CSES;

import java.util.Arrays;
import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        int n = sc.nextInt();  // number of applicants
        int m = sc.nextInt();  // number of apartments
        int k = sc.nextInt();  // maximum allowed difference
        
        long[] applicants = new long[n];
        long[] apartments = new long[m];
        
        // Read desired sizes of applicants
        for (int i = 0; i < n; i++) {
            applicants[i] = sc.nextInt();
        }
        
        // Read sizes of available apartments
        for (int i = 0; i < m; i++) {
            apartments[i] = sc.nextInt();
        }
        
        // Sort both arrays
        Arrays.sort(applicants);
        Arrays.sort(apartments);
        
        int i = 0, j = 0;
        long matches = 0;
        
        // Use two-pointer technique
        while (i < n && j < m) {
            if (Math.abs(applicants[i] - apartments[j]) <= k) {
                // Found a suitable apartment for the applicant
                matches++;
                i++;
                j++;
            } else if (apartments[j] < applicants[i] - k) {
                // Apartment is too small, move to the next apartment
                j++;
            } else {
                // Applicant's requirement is too large, move to the next applicant
                i++;
            }
        }
        
        // Output the number of matches
        System.out.println(matches);
        sc.close();
    }
}
