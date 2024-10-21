package DynamicProgramming;
import java.util.*;
public class GoogleOA {

    public static long longestSubsequence(String s){
        //a....e.....i.....o.....u
        //for this we have to create a 5 dp arrays
        //dp1-> for aaaaaaaaaaaaaa......
        //dp->2 for aaaaaaaaaeeeeeeee
        //dp3-> for aaaaaeeeeiiiiiii
        //dp4-> for aaaaaeeeeeiiiiioooo
        //dp5-> for aaaeeeeiiioooouuuu
        int n=s.length();
        long [] dp1=new long[n+1];
        long [] dp2=new long[n+1];
        long [] dp3=new long[n+1];
        long [] dp4=new long[n+1];
        long [] dp5=new long[n+1];
        for (int i = 1; i <= n; ++i) {
            // Carry forward previous values
            dp1[i] = dp1[i - 1];
            dp2[i] = dp2[i - 1];
            dp3[i] = dp3[i - 1];
            dp4[i] = dp4[i - 1];
            dp5[i] = dp5[i - 1];

            char ch = s.charAt(i - 1);

            if (ch == 'a') {
                dp1[i] = dp1[i - 1] + 1;
            } else if (ch == 'e') {
                //if there are more than 2 e at the end.
                if (dp2[i - 1] >= 2) {
                    dp2[i] = Math.max(dp2[i], dp2[i - 1] + 1);
                }
                //id there is single e at the end.
                if (dp1[i - 1] >= 1) {
                    dp2[i] = Math.max(dp2[i], dp1[i - 1] + 1);
                }
            } 
            //similarly for all the cases......
            else if (ch == 'i') {
                if (dp3[i - 1] >= 3) {
                    dp3[i] = Math.max(dp3[i], dp3[i - 1] + 1);
                }
                if (dp2[i - 1] >= 2) {
                    dp3[i] = Math.max(dp3[i], dp2[i - 1] + 1);
                }
            } else if (ch == 'o') {
                if (dp4[i - 1] >= 4) {
                    dp4[i] = Math.max(dp4[i], dp4[i - 1] + 1);
                }
                if (dp3[i - 1] >= 3) {
                    dp4[i] = Math.max(dp4[i], dp3[i - 1] + 1);
                }
            } else if (ch == 'u') {
                if (dp5[i - 1] >= 5) {
                    dp5[i] = Math.max(dp5[i], dp5[i - 1] + 1);
                }
                if (dp4[i - 1] >= 4) {
                    dp5[i] = Math.max(dp5[i], dp4[i - 1] + 1);
                }
            }
        }
        return dp5[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestSubsequence(s));
        sc.close();
    }
}
