package TwoPointers;

import java.util.Arrays;

public class FindTripletsWithZeroSum {

    public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        boolean found=false;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1; // Initialize second pointer
            int k = n - 1; // Initialize third pointer
            while (j < k) { // Ensure j and k don't cross each other
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    found = true;
                    break;
                } else if (sum < 0) {
                    j++; // Move j to the right to increase sum
                } else {
                    k--; // Move k to the left to decrease sum
                }
            }

            if (found) {
                break;
            }
        }
        return found;
    }
}