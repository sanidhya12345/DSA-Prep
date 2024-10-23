package TwoPointers;

import java.util.*;

public class RemoveDuplicates {
    public static int remove_duplicate(List<Integer> arr) {
        // Code Here
        // Code Here
        int n = arr.size();
        if (n == 0)
            return 0; // Handle empty array edge case

        int i = 0; // Pointer for the last unique element

        for (int j = 1; j < n; j++) {
            // If arr[j] is distinct from arr[i], we move it to the next position
            if (!arr.get(i).equals(arr.get(j))) {
                i++; // Move the i pointer forward
                arr.set(i, arr.get(j)); // Update the array with the new unique element
            }
        }

        // The size of the modified array is the number of distinct elements, which is i
        // + 1
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i, sc.nextInt());
        }
        System.out.println(remove_duplicate(list));
        sc.close();
    }
}
