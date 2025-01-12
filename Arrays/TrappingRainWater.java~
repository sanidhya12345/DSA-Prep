import java.util.Scanner;

public class TrappingRainWater {
    public static int maxWater(int[] heights) {
        int n = heights.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = heights[0];
        rightMax[n - 1] = heights[n - 1];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 1; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(maxWater(heights));
        sc.close();
    }
}
