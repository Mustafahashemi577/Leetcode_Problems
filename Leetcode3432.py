class Leetcode3432:
    def countPartitions(self, nums: List[int]) -> int:
        total = sum(nums)
        left,count = 0,0
        for i in range(len(nums)-1):
            left+=nums[i]
            if (left-(total-left))%2==0:
                count+=1
        return count

