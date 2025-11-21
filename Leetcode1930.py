class Leetcode1930:
    def countPalindromicSubsequence(self, s: str) -> int:
        ans=0
        string=set(s)
        for i in string:
            j=s.find(i)
            k=s.rfind(i)
            if j<k:
                ans+=len(set(s[j+1:k]))
        return ans
