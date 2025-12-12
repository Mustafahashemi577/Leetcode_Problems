class Leetcode1140:
    def stoneGameII(self, piles: List[int]) -> int:
        n = len(piles)
        suffix_Sum = [0]*n
        suffix_Sum[-1]=piles[-1]
        for i in range(n-2,-1,-1):
            suffix_Sum[i]=piles[i]+suffix_Sum[i+1]

        dp = [[0]*(n+1) for _ in range(n+1)]

        for i in range(n-1,-1,-1):
            for m in range(1,n+1):
                for x in range(1,2*m+1):
                    if i+x>n:
                        break
                    dp[i][m]=max(dp[i][m],suffix_Sum[i]-dp[i+x][max(m,x)])
        return dp[0][1]
