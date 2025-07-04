class CrawlerLogFolder {
    fun minOperations(logs: Array<String>): Int {
        val stack = ArrayDeque<String>()
        for (s in logs) {
            if (s == "../" && stack.isNotEmpty()) {
                stack.removeLast()
            } else if (s == "./" || s == "../") {
                continue
            } else {
                stack.addLast(s)
            }
        }
        return stack.size
    }
}
