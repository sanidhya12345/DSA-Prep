package DynamicProgramming;
import java.util.*;
public class FrogJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] b = new long[n+1];
        
        for (int i = 1; i <= n; i++) {
            b[i] = scanner.nextLong();
        }
        
        long[] dp = new long[n+1];
        
        dp[1] = 0;
        dp[2] = Math.abs(b[1] - b[2]);
        
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.min(dp[i-1] + Math.abs(b[i] - b[i-1]), dp[i-2] + Math.abs(b[i] - b[i-2]));
        }
        
        System.out.println(dp[n]);
        scanner.close();
    }
    
}
