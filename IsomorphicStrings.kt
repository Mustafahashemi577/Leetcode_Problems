class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        val charIndexS = mutableMapOf<Char, Int>()
        val charIndexT = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            val c1 = s[i]
            val c2 = t[i]

            if (!charIndexS.containsKey(c1)) {
                charIndexS[c1] = i
            }

            if (!charIndexT.containsKey(c2)) {
                charIndexT[c2] = i
            }

            if (charIndexS[c1] != charIndexT[c2]) {
                return false
            }
        }

        return true
    }
}
