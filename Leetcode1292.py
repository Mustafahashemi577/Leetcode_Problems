class Leetcode1292:
    def maxSideLength(self, mat: List[List[int]], threshold: int) -> int:
        m,n = len(mat),len(mat[0])
        p =[[0]*(n+1) for _ in range(m+1)]
        for i in range(1,m+1):
            for j in range(1,n+1):
                p[i][j]=(p[i-1][j]+p[i][j-1]-p[i-1][j-1]+mat[i-1][j-1])

        def getRect(x1,y1,x2,y2):
            return p[x2][y2]-p[x1-1][y2]-p[x2][y1-1]+p[x1-1][y1-1]
        
        l,r,ans = 1,min(m,n),0
        while(l<=r):
            mid = (l+r)//2
            find = any(getRect(i,j,i+mid-1,j+mid-1)<=threshold
                for i in range(1,m-mid+2)
                for j in range(1,n-mid+2)
            )
            if find:
                ans = mid
                l = mid+1
            else:
                r = mid-1
        return ans

