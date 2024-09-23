package Patterns;
import java.util.Scanner;
/*

Q2.Print the following pattern for the given number of rows.
Pattern for N = 5
E
D E
C D E
B C D E
A B C D E

 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int counter1=65+n-1;
        int counter2=1;
        for(int i=0;i<n;i++){
            for(int j=counter1;j<counter1+counter2;j++){
                System.out.print((char)(j)+" ");
            }
            counter1--;
            counter2++;
            System.out.println();
        }
        sc.close();
    }
}
