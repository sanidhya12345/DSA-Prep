package Patterns;

import java.util.*;
/*

Odd Square pattern for n=4
1357
3571
5713
7135

*/

public class OddSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int min=1;
        int max=(2*n)-1;
        for(int i=0;i<n;i++){
            int val=(2*i)+1;
            for(int j=0;j<n;j++){
                if(val==max){
                    System.out.print(val);
                    val=min;
                }
                else{
                    System.out.print(val);
                    val=val+2;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}