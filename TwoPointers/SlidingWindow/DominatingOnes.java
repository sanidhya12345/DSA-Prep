import java.util.ArrayList;
import java.util.Scanner;

public class DominatingOnes {
  public static int sumTillN(int n) {
    return n * (n + 1) / 2;
  }

  public int numberOfSubstrings(String s) {
    int n = s.length();
    int totalZerosPossible = (int) Math.sqrt(n) + 1;

    // store the indices of all the zeros in the string
    ArrayList<Integer> list = new ArrayList<>();
    list.add(-1); // for the boundary
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '0')
        list.add(i);
    }
    list.add(n); // for the boundary;

    int ans = 0;
    int prev = -1;

    // case 1:count the substrings with no zeros

    for (int curr : list) {
      ans += sumTillN(curr - prev - 1);// formula used n*(n+1)/2
      prev = curr;
    }
    // case 2: count the substring where the number of zeros are between 1 to
    // totalZerosPossible
    //
    for (int numZeros = 1; numZeros < totalZerosPossible; numZeros++) {
      for (int i = 1; i < list.size() - numZeros; i++) {
        int j = i + numZeros - 1;
        int L = list.get(i) - list.get(i - 1);
        int R = list.get(j + 1) - list.get(j);

        int base = numZeros * numZeros + numZeros - (list.get(j) - list.get(i) + 1);

        if (base < L + R) {
          ans += L * R;
          ans -= sumTillN(Math.max(0, base));
          ans += sumTillN(Math.max(0, base - L));
          ans += sumTillN(Math.max(0, base - R));
        }
      }
    }
    return ans;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DominatingOnes obj = new DominatingOnes();
    String s = sc.next();
    System.out.println(obj.numberOfSubstrings(s));
    sc.close();
  }
}
