package Patterns;
import java.util.Scanner;
/*

Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC

Sample Input 1:
7


Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG


Sample Input 2:
6


Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF



 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)(i+65));
            }
            System.out.println();
        }
        sc.close();
    }
}
