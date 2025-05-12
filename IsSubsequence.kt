class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        val sb = StringBuilder()
        var j = 0
        for (i in t.indices) {
            if (j < s.length && t[i] == s[j]) {
                sb.append(t[i])
                j++
            }
        }
        return sb.toString() == s
    }
}
