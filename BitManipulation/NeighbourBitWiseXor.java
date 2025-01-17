import java.util.Scanner;

public class NeighbourBitWiseXor {
  public boolean doesValid(int[] derived) {
    int xor = 0;
    for (int i : derived) {
      xor = xor ^ i;
    }
    return xor == 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] derived = new int[n];
    System.out.println(doesValid(derived));
  }
}
