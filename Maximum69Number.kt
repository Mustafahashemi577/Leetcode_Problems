class Maximum69Number {
    fun maximum69Number (num: Int): Int {
        val chars = num.toString().toCharArray()
        for (i in chars.indices) {
            if (chars[i] == '6') {
                chars[i] = '9'
                break
            }
        }
        return String(chars).toInt()
    }
}
