class CombinationSum2 {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        candidates.sort()
        backtrack(0, candidates, target, mutableListOf(), result)
        return result
    }

    private fun backtrack(
        start: Int,
        candidates: IntArray,
        target: Int,
        path: MutableList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (target == 0) {
            result.add(ArrayList(path))
            return
        }

        for (i in start until candidates.size) {
            if (i > start && candidates[i] == candidates[i - 1]) continue 
            val num = candidates[i]
            if (num > target) break  

            path.add(num)
            backtrack(i + 1, candidates, target - num, path, result)
            path.removeAt(path.lastIndex)
        }
    }
}

