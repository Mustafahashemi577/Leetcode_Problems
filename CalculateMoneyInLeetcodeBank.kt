class ClaculateMoneyInLeetcodeBank {
    fun totalMoney(n: Int): Int {
        val w = n / 7
        val r = n % 7
        return (28 * w + 7 * (w * (w - 1) / 2))+(r * w + r * (r + 1) / 2);
    }
}
