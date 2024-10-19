package Codechef.Diifficulty5001000;

import java.util.*;
public class JanmanshAssignments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while (test--!=0) {
            int n=sc.nextInt();
            if(10-n>=3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
