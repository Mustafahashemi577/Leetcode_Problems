class Leetcode3075:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        happiness.sort(reverse=True)
        total = 0
        for i in range(k):
            cur = happiness[i]-i
            if cur <=0:
                break
            total += cur
        return total
