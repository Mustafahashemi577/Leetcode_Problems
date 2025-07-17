class SimplifyPath {
    fun simplifyPath(path: String): String {
        val stack = ArrayDeque<String>()
        val cur = StringBuilder()
        for (c in "$path/") {
            if (c == '/') {
                val segment = cur.toString()
                when {
                    segment == ".." -> if (stack.isNotEmpty()) stack.removeLast()
                    segment.isNotEmpty() && segment != "." -> stack.addLast(segment)
                }
                cur.setLength(0)
            } else {
                cur.append(c)
            }
        }
        return "/" + stack.joinToString("/")
    }
}
