package Patterns;
import java.util.Scanner;
/*

Question 1.
for n=3     
pattern is 
1
2 2
3 3 3

for n=5
pattern is 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
now print for n=6!!

 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }   
        sc.close();
    }
}
