package Codechef.Diifficulty5001000;
import java.util.*;
public class Exams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            int total=x*y;
            if((total/2)<z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
