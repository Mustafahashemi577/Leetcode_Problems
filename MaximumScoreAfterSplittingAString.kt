class MaximumScoreAfterSplittingAString {
    fun maxScore(s: String): Int {
        var left = 0
        var right = 0
        var one = 0
        var zero = 0
        for(c in s)
            if(c=='1')
                one++
            else
                zero++
        right=one
        var max = 0
        for(i in 0 until s.length-1){
            if(s[i]=='0')
                left++
            else
                right--
            max=max(max,(left+right))
        }
        return max
    }
}
