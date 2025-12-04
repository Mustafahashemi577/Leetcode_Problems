class Leetcode2211:
    def countCollisions(self, directions: str) -> int:
        n = len(directions)
        if n == 1:
            return 0
        
        l, r = 0, n - 1
        
        while l < r and directions[l] == 'L':
            l += 1
        while l < r and directions[r] == 'R':
            r -= 1
        
        if l >= r:
            return 0
        
        ans = 0
        while l <= r:
            ans += 1 if directions[l] != 'S' else 0
            l += 1
        
        return ans

