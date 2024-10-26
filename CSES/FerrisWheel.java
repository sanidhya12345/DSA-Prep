package CSES;
import java.io.*;
import java.util.*;

public class FerrisWheel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the first line of inputs
        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);  // number of children
        int x = Integer.parseInt(firstLine[1]);  // max weight limit per gondola
        
        // Read the weights and convert to integer array
        int[] weights = Arrays.stream(reader.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        // Sort the weights
        Arrays.sort(weights);

        int i = 0, j = n - 1;  // Initialize two pointers
        int gondolas = 0;

        // Use two-pointer approach to minimize gondolas
        while (i <= j) {
            if (weights[i] + weights[j] <= x) {
                // If both children fit in the gondola, move both pointers
                i++;
                j--;
            } else {
                // Otherwise, only the heavier child (pointed by j) goes into a gondola
                j--;
            }
            // One gondola is used in each iteration
            gondolas++;
        }

        // Output the minimum number of gondolas needed
        System.out.println(gondolas);
    }
}
