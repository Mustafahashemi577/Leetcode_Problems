class Leetcode1727:
    def largestSubmatrix(self, matrix: List[List[int]]) -> int:
        m = len(matrix)
        n = len(matrix[0])
        ans = 0

        for row in range(m):
            for col in range(n):
                if matrix[row][col]!=0 and row>0:
                    matrix[row][col]+=matrix[row-1][col]
            curRow = sorted(matrix[row],reverse=True)
            for i in range(n):
                ans = max(ans,curRow[i]*(i+1))
        return ans
