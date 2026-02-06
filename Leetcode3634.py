class Leetcode3634:
    def minRemoval(self, nums: List[int], k: int) -> int:
        nums.sort()
        ans = len(nums)
        right=0
        for left in range(len(nums)):
            while right<len(nums) and nums[right]<=nums[left]*k:
                right+=1
            ans = min(ans,len(nums)-(right-left))
        return ans
