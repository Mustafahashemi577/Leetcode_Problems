class Leetcode1975:
    def maxMatrixSum(self, matrix: List[List[int]]) -> int:
        sum,negative,mini = 0,0,1000000
        for nums in matrix:
            for num in nums:
                if num<0:
                    negative+=1
                mini = min(mini,abs(num))
                sum+=abs(num)
        return sum if negative%2==0 else sum-2*mini

