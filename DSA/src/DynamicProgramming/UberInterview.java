package DynamicProgramming;

import java.util.*;
public class UberInterview {

	//dp[i][0][0]=>even number from a
	//dp[i][0][1]=>odd number from a
	//dp[i][1][0]=>even number from b
	//dp[i][1][1]=>odd number from b
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=Arrays.asList(1,2,1);
		List<Integer> b=Arrays.asList(3,1,1);
		countJourneys(a,b);
	}
	public static void countJourneys(List<Integer> a,List<Integer> b) {
		int n=a.size();
		
		//intialize the dp array
		int [][][] dp=new int[n+1][2][2];
		
		//Base case:
		
		if(a.get(0)%2==0) {
			dp[1][0][0]=1;
			dp[1][0][1]=0;
		}
		else {
			dp[1][0][0]=0;
			dp[1][0][1]=1;
		}
		
		if(b.get(0)%2==0) {
			dp[1][1][0]=1;
			dp[1][1][1]=0;
		}
		else {
			dp[1][1][0]=0;
			dp[1][1][1]=1;
		}
		// Dynamic programming
        for (int i = 2; i <= n; ++i) {
            // Update dp[i][a][even]
            if (a.get(i - 1) % 2 == 0) {
                dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][1][0]);
            } else {
                dp[i][0][0] = (dp[i - 1][0][1] + dp[i - 1][1][1]);
            }

            // Update dp[i][a][odd]
            if (a.get(i - 1) % 2 == 0) {
                dp[i][0][1] = (dp[i - 1][0][1] + dp[i - 1][1][1]);
            } else {
                dp[i][0][1] = (dp[i - 1][0][0] + dp[i - 1][1][0]);
            }

            // Update dp[i][b][even]
            if (b.get(i - 1) % 2 == 0) {
                dp[i][1][0] = (dp[i - 1][0][0] + dp[i - 1][1][0]);
            } else {
                dp[i][1][0] = (dp[i - 1][0][1] + dp[i - 1][1][1]);
            }

            // Update dp[i][b][odd]
            if (b.get(i - 1) % 2 == 0) {
                dp[i][1][1] = (dp[i - 1][0][1] + dp[i - 1][1][1]);
            } else {
                dp[i][1][1] = (dp[i - 1][0][0] + dp[i - 1][1][0]);
            }
        }
        int even=dp[n][0][0]+dp[n][1][0];
        int odd=dp[n][1][1]+dp[n][0][1];
        System.out.println("Number of odd journeys: "+odd);
        System.out.println("Number of even journeys: "+even);
	}

}
