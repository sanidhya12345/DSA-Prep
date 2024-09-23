package Patterns;
import java.util.*;

/**

n=6

******
*   *
*  *
* *
**
*
 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n/2;
        for(int i=0;i<n;i++){
            System.out.print("*");
            if(i==0){
               for(int j=0;j<n-2;j++){
                System.out.print("*");
               }
            }
            else{
                for(int j=spaces;j>0;j--){
                    System.out.print(" ");
                }
                spaces--;
            }
            if(i!=n-1){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
