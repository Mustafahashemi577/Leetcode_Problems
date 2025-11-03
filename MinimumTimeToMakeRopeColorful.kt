class MinimumTimeToMakeRopeColorful {
    fun minCost(colors: String, neededTime: IntArray): Int {
        var totalTime = 0
        for (i in 1 until neededTime.size)
            if(colors[i]==colors[i-1]){
                totalTime+=min(neededTime[i],neededTime[i-1])
                neededTime[i]=max(neededTime[i],neededTime[i-1])
            }
        return totalTime
    }
}
