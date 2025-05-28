class FindWordsThatCanBeFormedByCharacters {
    fun countCharacters(words: Array<String>, chars: String): Int {
         val mapc = HashMap<Char, Int>()
        for (c in chars) {
            mapc[c] = mapc.getOrDefault(c, 0) + 1
        }
        var count = 0
        for (w in words) {
            val curword = HashMap<Char, Int>()
            for (c in w) {
                curword[c] = curword.getOrDefault(c, 0) + 1
            }
            var flag = true
            for ((c, freq) in curword) {
                if (freq > mapc.getOrDefault(c, 0)) {
                    flag = false
                    break
                }
            }
            if (flag) {
                count += w.length
            }
        }
        return count    
    }
}
