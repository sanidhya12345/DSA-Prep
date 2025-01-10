import java.util.*;

public class TowerResearchOA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values for array size and subarray size
        long arraySize = scanner.nextLong();
        long subArraySize = scanner.nextLong();

        // Input array and modulo group hash map
        long[] inputArray = new long[(int) arraySize + 1];
        Map<Long, Map<Long, Long>> frequencyMap = new HashMap<>();

        // Initialize frequency map for modulo groups
        for (long i = 0; i < subArraySize + 1; i++) {
            frequencyMap.put(i, new HashMap<>());
        }

        // Populate input array and frequency map
        for (long i = 1; i <= arraySize; i++) {
            inputArray[(int) i] = scanner.nextLong();
            long moduloGroup = i % subArraySize;
            frequencyMap.get(moduloGroup).put(inputArray[(int) i], frequencyMap.get(moduloGroup).getOrDefault(inputArray[(int) i], 0L) + 1);
        }

        // Declare and initialize dp array
        long[][] dp = new long[(int) (subArraySize + 1)][64];
        for (long[] row : dp) {
            Arrays.fill(row, Long.MAX_VALUE);
        }
        dp[0][0] = 0; // Base case: 0 elements and XOR 0 costs 0

        // Populate dp table
        for (int i = 1; i <= subArraySize; i++) {
            for (int goalXor = 0; goalXor <= 63; goalXor++) {
                long totalElementsInCycle = (arraySize - i) / subArraySize + 1;
                for (int lastElement = 0; lastElement <= 63; lastElement++) {
                    if (dp[i - 1][goalXor ^ lastElement] != Long.MAX_VALUE) {
                        dp[i][goalXor] = Math.min(dp[i][goalXor],
                                dp[i - 1][goalXor ^ lastElement] + totalElementsInCycle - frequencyMap.get((long) (i % subArraySize)).getOrDefault((long) lastElement, 0L));
                    }
                }
            }
        }

        // Output result
        System.out.println(dp[(int) subArraySize][0]);

        scanner.close();
    }
}

