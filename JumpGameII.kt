class JumpGameII {
    fun jump(nums: IntArray): Int {
        if(nums.size==1)
            return 0
        var cnt = 0
        var curEnd = 0
        var farthest = 0
        for(i in 0..nums.size-2){
            farthest = max(farthest,i+nums[i])
            if(curEnd==i){
                cnt++
                curEnd=farthest
            }
        }
        return cnt
    }
}
