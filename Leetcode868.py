class Leetcode868:
    def binaryGap(self, n: int) -> int:
        s = bin(n)
        temp ,res = -1,0
        for i in range (len(s)):
            if s[i]=='1':
                if temp!=-1:
                    res = max(res,abs(temp-i))
                temp = i
        return res
        
