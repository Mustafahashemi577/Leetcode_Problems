class Pascal'sTriangle{
    fun generate(numRows: Int): List<List<Int>> {
        val mainList = mutableListOf<List<Int>>()
        var prev = mutableListOf<Int>()
        for (i in 0 until numRows) {
            val temp = mutableListOf<Int>()
            for (j in 0..i) {
                if (i == 0 || i == 1 || j == 0 || j == i) {
                    temp.add(1)
                } else {
                    temp.add(prev[j] + prev[j - 1])
                }
            }
            mainList.add(temp)
            prev = temp
        }
        return mainList    
    }
}
