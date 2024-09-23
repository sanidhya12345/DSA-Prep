package Patterns;
import java.util.Scanner;
/*

Print the following pattern for the given N number of rows.
Pattern for N = 4
   1
  12
 123
1234     

 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int spaces=n-1;
        for(int i=0;i<n;i++){
            //loop for spaces
            for(int j=spaces;j>0;j--){
                System.out.print(" ");
            }
            spaces--;
            //loop for numbers
            for(int k=0;k<i+1;k++){
                System.out.print(k+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
