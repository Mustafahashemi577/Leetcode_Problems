class Solution:
    def maxSubarraySum(self, nums: List[int], k: int) -> int:
        pSum = 0
        subMax = float('-inf')
        minSo = [float('inf')] * k
        minSo[(k - 1) % k] = 0
        for i in range(len(nums)):
            pSum += nums[i]
            subMax = max(subMax, pSum - minSo[i % k])
            minSo[i % k] = min(minSo[i % k], pSum)
        
        
        return subMax
        
