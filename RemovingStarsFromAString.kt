class RemovingStarsFromAString {
    fun removeStars(s: String): String {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            if (c == '*' && stack.isNotEmpty()) {
                stack.removeLast()
            } else {
                stack.addLast(c)
            }
        }
        return stack.joinToString("")
    }
}
