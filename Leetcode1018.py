class Leetcode1018:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        ans =[]
        prefix = 0
        for num in nums:
            prefix=(prefix*2+num)%5
            ans.append(prefix==0)

        return ans
