class EvaluateReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        for (token in tokens) {
            when (token) {
                "+" -> stack.addLast(stack.removeLast() + stack.removeLast())
                "-" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b - a)
                }
                "*" -> stack.addLast(stack.removeLast() * stack.removeLast())
                "/" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b / a)
                }
                else -> stack.addLast(token.toInt())
            }
        }
        return stack.removeLast()
    }
}
