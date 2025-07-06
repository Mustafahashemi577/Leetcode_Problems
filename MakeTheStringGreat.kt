class MakeTheStringGreat {
    fun makeGood(s: String): String {
        val sb = StringBuilder()
        for (c in s) {
            val len = sb.length
            if (len > 0 && kotlin.math.abs(sb[len - 1] - c) == 32) {
                sb.deleteCharAt(len - 1)
            } else {
                sb.append(c)
            }
        }
        return sb.toString()
    }
}
