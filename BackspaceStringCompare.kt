class BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        val s1 = ArrayDeque<Char>()
        val s2 = ArrayDeque<Char>()
        for (c in s) {
            if (c == '#') {
                if (s1.isNotEmpty()) s1.removeLast()
            } else {
                s1.addLast(c)
            }
        }
        for (c in t) {
            if (c == '#') {
                if (s2.isNotEmpty()) s2.removeLast()
            } else {
                s2.addLast(c)
            }
        }

        return s1 == s2
    }
}
