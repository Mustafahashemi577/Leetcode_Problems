class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val res = IntArray(temperatures.size)
        val stack = ArrayDeque<Pair<Int, Int>>() 

        for (i in temperatures.indices) {
            val t = temperatures[i]
            while (stack.isNotEmpty() && t > stack.peek().first) {
                val (_, idx) = stack.pop()
                res[idx] = i - idx
            }
            stack.push(Pair(t, i))
        }
        return res
    }
}

