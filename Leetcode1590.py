class Leetcode1590:
    def minSubarray(self, nums: List[int], p: int) -> int:
        total = sum(nums)
        target = total%p
        
        if target == 0:
            return 0
        
        map = {0:-1}
        prefix = 0
        ans = len(nums)
        for i in range(len(nums)):
            prefix = (prefix+nums[i])%p
            need = (prefix-target+p)%p
            
            if need in map:
                ans = min(ans,i-map[need])
            map[prefix]=i

        return -1 if ans==len(nums) else ans
