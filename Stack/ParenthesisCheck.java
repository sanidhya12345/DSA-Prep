import java.util.Scanner;

public class ParenthesisCheck {
  public static boolean canBeValid(String s, String locked) {
    int n = s.length();
    // if the length of the string is odd then it is impossible to create a valid
    // parenthesis
    if (n % 2 != 0)
      return false;
    // check the available positions to balance the extra close parenthesis from
    // left to right
    int available = 0;
    int balance = 0;
    for (int i = 0; i < n; i++) {
      if (locked.charAt(i) == '0') {
        available++;
      } else {
        if (s.charAt(i) == '(') {
          balance++;
        } else
          balance--;
      }
      if (balance + available < 0)
        return false;
    }
    // check the available positions to balance the extra open parenthesis from
    // right to left.
    available = 0;
    balance = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (locked.charAt(i) == '0') {
        available++;
      } else {
        if (s.charAt(i) == ')') {
          balance++;
        } else
          balance--;
      }
      if (balance + available < 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String locked = sc.next();
    System.out.println(canBeValid(s, locked));
    sc.close();
  }
}
