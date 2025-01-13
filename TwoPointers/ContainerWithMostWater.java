import java.util.Scanner;

public class ContainerWithMostWater {
  public static int maxWater(int[] heights) {
    int left = 0;
    int right = heights.length - 1;
    int max = Integer.MIN_VALUE;
    while (left < right) {
      int width = right - left;
      int h = Math.min(heights[left], heights[right]);
      int area = width * h;
      max = Math.max(area, max);
      if (heights[left] < heights[right])
        left++;
      else if (heights[right] < heights[left])
        right--;
      else {
        left++;
        right--;
      }
    }
    return max;
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
