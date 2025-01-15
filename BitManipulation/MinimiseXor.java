import java.util.*;

public class MinimiseXor {
  public static int minimiseXor(int num1, int num2) {
    int setBitsInNum2 = Integer.bitCount(num1);
    int currentSetBits = Integer.bitCount(num2);
    while (currentSetBits != setBitsInNum2) {
      if (currentSetBits < setBitsInNum2) {
        num1++;
      } else {
        num1--;
      }
      currentSetBits = Integer.bitCount(num1);
    }
    return num1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(minimiseXor(num1, num2));
    sc.close();
  }
}
