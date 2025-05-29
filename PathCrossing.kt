class PathCrossing {
    fun isPathCrossing(path: String): Boolean {
        val set = mutableSetOf<String>()
        var x = 0
        var y = 0
        set.add("$x,$y")
        for (ch in path) {
            when (ch) {
                'N' -> y++
                'S' -> y--
                'E' -> x++
                'W' -> x--
            }
            val coordinate = "$x,$y"
            if (coordinate in set) return true
            set.add(coordinate)
        }
        return false    
    }
}
