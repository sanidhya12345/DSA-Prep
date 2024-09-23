package Patterns;
import java.util.Scanner;
/*

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
B C
C D E
D E F G

Sample Input 1:
5

Sample Output 1:
A
B C
C D E
D E F G
E F G H I


 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int counter=1;
        for(int i=0;i<n;i++){
            for(int j=i;j<i+counter;j++){
                System.out.print((char)(j+65)+" ");
            }
            counter++;
            System.out.println();
        }
        sc.close();
    }
}
