package Patterns;
import java.util.*;
/*

   1
  232
 34543
4567654
 */
public class Pattern9 {
    public static String reverseStr(String s){
        String rev="";
        for(int i=s.length()-1;i>0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j <= 2 * i + 1; j++) {
                System.out.print(j);
            }
            //2nd loop
            for (int j = 2 * i; j >= i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
