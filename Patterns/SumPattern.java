package Patterns;
import java.util.*;

/*

Sample Input 1 :
3

Sample Output 1 :
1=1
1+2=3
1+2+3=6


 */
public class SumPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                if (j < i + 1) {
                    System.out.print("+");
                }
                sum += j;
            }
            System.out.println("=" + sum);
        }
        sc.close();
    }
}
