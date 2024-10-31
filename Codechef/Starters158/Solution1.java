package Codechef.Starters158;

/**
 * GitHub: sanidhya12345
 * Date: 2024-10-30
 * Time: 19:47
 */

import java.util.*;
public class Solution1 {

    public static int findOdd(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && i%2!=0){
                count++;
            }
        }
        return count;
    }
    public static int findEven(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && i%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            int n=sc.nextInt();
            if(findEven(n)>findOdd(n)){
                System.out.println(1);
            }
            else if(findEven(n)<findOdd(n)){
                System.out.println(-1);
            }
            else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}