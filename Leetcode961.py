class Leetcode961 :
    def repeatedNTimes(self, nums: List[int]) -> int:
        map = {}
        for num in nums:
            if num in map:
                return num
            else:
                map[num]=1

