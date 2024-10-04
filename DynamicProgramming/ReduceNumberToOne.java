package DynamicProgramming;
import java.util.*;
public class ReduceNumberToOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int [] dp=new int[x+1];
        Arrays.fill(dp, 0);
        for(int i=3;i<=x;i++){
            if(i%7==0){
                dp[i]=dp[i/7]+1;
            }
            else{
                dp[i]=Math.min(dp[i-1],dp[i-2])+1;
            }
        }
        System.out.println(dp[x]);
        sc.close();
    }
}
