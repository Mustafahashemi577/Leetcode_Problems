/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class GuessNumberHigherOrLower : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var l = 1
        var r = n
        while (l <= r) {
            val m = l + (r - l) / 2
            val result = guess(m)
            when {
                result == 0 -> return m
                result < 0 -> r = m - 1
                else -> l = m + 1
            }
        }
        return -1
    }
}
