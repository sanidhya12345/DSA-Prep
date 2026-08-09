class Solution:
    def stoneGameII(self, piles: List[int]) -> int:
        n=len(piles)

        suffix_sum=[0]*n
        suffix_sum[-1]=piles[-1]
        for i in range(n-2,-1,-1):
            suffix_sum[i]=suffix_sum[i+1]+piles[i]
        
        dp=[[0]*(n+1) for _ in range(n+1)]

        for i in range(n-1,-1,-1):
            for M in range(1,n+1):

                if i+ 2 * M >= n:
                    dp[i][M]=suffix_sum[i]
                else:

                    for X in range(1,2*M+1):

                        nextM=max(M,X)

                        currentscore=suffix_sum[i]-dp[i+X][nextM]

                        dp[i][M]=max(dp[i][M],currentscore)
                    
        return dp[0][1]
        