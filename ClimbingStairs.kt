class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        if(n<=1)
            return 1
        var prev = 1
        var prev2 = 1
        for(i in 2..n){
            var cur = prev2+prev
            prev2 = prev;
            prev = cur;
        }
        return prev
    }
}
