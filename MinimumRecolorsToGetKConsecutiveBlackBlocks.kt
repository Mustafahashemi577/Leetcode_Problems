class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var wtemp = 0
        var wmax = 0
        for (i in 0 until k) {
            if (blocks[i] == 'B') {
                wtemp++
            }
        }
        wmax = wtemp
        for (i in 1..blocks.length - k) {
            if (blocks[i - 1] == 'B') {
                wtemp--
            }
            if (blocks[i + k - 1] == 'B') {
                wtemp++
            }
            wmax = maxOf(wmax, wtemp)
        }
        return if (wmax >= k) 0 else k - wmax
    }
}
