class Leetcode1437:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        lastIndex = -1
        for i in range(len(nums)):
            if nums[i]==1:
                if lastIndex!=-1 and i-lastIndex<=k:
                    return False
                lastIndex=i
            
        return True
