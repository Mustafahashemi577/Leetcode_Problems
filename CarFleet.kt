class CarFleet {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val n = position.size
        if (n == 0) return 0
        val cars = position.indices
            .map { position[it] to speed[it] }
            .sortedByDescending { it.first }
        var fleets = 0
        var prevTime = 0.0
        for ((pos, spd) in cars) {
            val time = (target - pos).toDouble() / spd
            if (time > prevTime) {
                fleets++
                prevTime = time
            }
        }
        return fleets
    }
}
