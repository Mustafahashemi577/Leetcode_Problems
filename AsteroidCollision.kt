class AsteroidCollision {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        for (a in asteroids) {
            var asteroid = a
            while (stack.isNotEmpty() && asteroid < 0 && stack.last() > 0) {
                val diff = asteroid + stack.last()
                if (diff < 0) {
                    stack.removeLast()
                } else if (diff > 0) {
                    asteroid = 0
                } else {
                    asteroid = 0
                    stack.removeLast()
                }
            }
            if (asteroid != 0) {
                stack.addLast(asteroid)
            }
        }
        return stack.toIntArray()
    }
}
