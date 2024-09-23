package Patterns;
import java.util.*;

/**
for n=4
****
 ****
  ****
   ****
 */
public class ParellelogramPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //loop for spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //loop for stars
            for(int k=0;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
