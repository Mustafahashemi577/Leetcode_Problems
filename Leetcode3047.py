class Leetcode3047:
    def largestSquareArea(self, bottomLeft: List[List[int]], topRight: List[List[int]]) -> int:
        maxSize = 0

        for(bottomLefti,topRighti),(bottomLeftj,topRightj) in combinations(zip(bottomLeft,topRight),2):
            w = min(topRighti[0],topRightj[0])-max(bottomLefti[0],bottomLeftj[0])
            h = min(topRighti[1],topRightj[1])-max(bottomLefti[1],bottomLeftj[1])
            maxSize = max(maxSize,min(w,h))
        
        return maxSize*maxSize
