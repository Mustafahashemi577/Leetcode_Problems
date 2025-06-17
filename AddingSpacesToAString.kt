class AddingSpacesToAString {
    fun addSpaces(s: String, spaces: IntArray): String {
        val temp = s.toCharArray()
        val result = CharArray(s.length + spaces.size)
        var j = 0
        var k = 0
        for (i in result.indices) {
            if (j < spaces.size && k == spaces[j]) {
                result[i] = ' '
                j++
            } else {
                result[i] = temp[k]
                k++
            }
        }
        return String(result)
    }
}
