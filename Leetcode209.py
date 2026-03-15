class Leetcode209:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left,sum,mini=(0,0,float('inf'))
        for right in range(len(nums)):
            sum+=nums[right]

            while sum>=target:
                mini = min(mini,right-left+1)
                sum-=nums[left]
                left+=1
        
        return 0 if mini == float('inf') else mini
