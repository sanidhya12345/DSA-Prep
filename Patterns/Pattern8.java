package Patterns;
import java.util.*;
/*

Q2. Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1


 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int counter=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(counter);
            }
            counter--;
            System.out.println();
        }
        sc.close();
    }
}
