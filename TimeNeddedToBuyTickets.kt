class TimeNeddedToBuyTickets {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var seconds = 0
        var sum = tickets.sum().toLong()
        while (sum >= 0) {
            for (j in tickets.indices) {
                if (tickets[j] == 1 && k == j) {
                    return ++seconds
                } else if (tickets[j] > 0) {
                    sum--
                    tickets[j]--
                    seconds++
                }
            }
        }
        return seconds
    }
}
