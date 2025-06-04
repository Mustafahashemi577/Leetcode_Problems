class AverageWaitingTime {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var result = customers[0][1].toDouble()
        var previous = customers[0][0] + customers[0][1]
        for (i in 1 until customers.size) {
            if (previous > customers[i][0]) {
                result += (previous - customers[i][0] + customers[i][1])
                previous += customers[i][1]
            } else {
                result += customers[i][1]
                previous = customers[i][0] + customers[i][1]
            }
        }
        return result / customers.size
    }
}
