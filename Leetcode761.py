class Leetcode761:
    def makeLargestSpecial(self, s: str) -> str:
        count,i=0,0
        res=[]

        for j,char in enumerate(s):
            if char=='1':
                count+=1
            else:
                count-=1
            if count==0:
                midOpt = self.makeLargestSpecial(s[i+1:j])
                res.append("1"+midOpt+'0')
                i=j+1
        res.sort(reverse=True)
        return ''.join(res)
