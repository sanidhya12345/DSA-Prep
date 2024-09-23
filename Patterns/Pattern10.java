package Patterns;
import java.util.*;
/*

Print the following pattern for the given number of rows.
Note: N is always odd.
Pattern for N = 5

  *
 ***
*****
 ***
  *  

 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int spaces=n/2;
        int stars=1;
        //Upper Pyramid
        for(int i=0;i<=n/2;i++){
            //loop for spaces
            for(int j=spaces;j>0;j--){
                System.out.print(" ");
            }
            spaces--;
            //loop for stars
            for(int k=1;k<stars+1;k++){
                System.out.print("*");
            }
            stars+=2;
            System.out.println();
        }
        spaces=1;
        stars=n-2;
        //Lower Pyramid
        for(int i=0;i<n/2;i++){
            //loop for spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            spaces++;
            //loop for stars
            for(int k=1;k<stars+1;k++){
                System.out.print("*");
            }
            stars-=2;
            System.out.println();
        }
        sc.close();
    }
}
