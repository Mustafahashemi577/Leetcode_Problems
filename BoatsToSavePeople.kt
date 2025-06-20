class BoatsToSavePeople {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var count = 0
        var l = 0
        var r = people.size - 1

        while (l <= r) {
            val remain = limit - people[r--]
            count++
            if (l <= r && remain >= people[l]) {
                l++
            }
        }
        return count
    }
}
