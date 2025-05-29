class Largest3SameDigitNumberInString {
    fun largestGoodInteger(num: String): String {
        var maxD = -1
        var maxS = ""
        for(i in 0 until num.length-2){
            if(num[i]==num[i+1] && num[i+1]==num[i+2]){
                val current = num.substring(i, i + 3)
                val currentValue = current.toInt()
                if (currentValue > maxD) {
                    maxD = currentValue
                    maxS = current
                }
            }
        }
        return maxS
    }
}
