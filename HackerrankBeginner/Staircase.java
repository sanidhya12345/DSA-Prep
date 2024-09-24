package HackerrankBeginner;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n-1;
        for(int i=0;i<n;i++){

            for(int j=spaces;j>0;j--){
                System.out.print(" ");
            }
            spaces--;

            for(int k=0;k<i+1;k++){
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
