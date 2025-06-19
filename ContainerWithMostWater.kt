class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size-1
        var res = 0
        while(l<r){
            res = max(res,min(height[l],height[r])*(r-l))
            if(height[l]<=height[r])
                l++
            else
                r--
        }
        return res
    }
}
