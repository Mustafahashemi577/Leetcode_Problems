class MaximumNumberOfBallons {
    fun maxNumberOfBalloons(text: String): Int {
         val count = IntArray(5)
        for (c in text) {
            when (c) {
                'b' -> count[0]++
                'a' -> count[1]++
                'l' -> count[2]++
                'o' -> count[3]++
                'n' -> count[4]++
            }
        }
        count[2] /= 2 
        count[3] /= 2 
        return count.min()
    }
}
