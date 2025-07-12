class ValidStackSequences {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = ArrayDeque<Int>()
        var i = 0
        for (n in pushed) {
            stack.addLast(n)
            while (i < popped.size && stack.isNotEmpty() && stack.last() == popped[i]) {
                stack.removeLast()
                i++
            }
        }
        return stack.isEmpty()
    }
}
