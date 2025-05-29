class DestinationCity {
    fun destCity(paths: List<List<String>>): String {
        val sources = mutableSetOf<String>()
        for (path in paths) 
            sources.add(path[0])
        for (path in paths) {
            val destination = path[1]
            if (destination !in sources) {
                return destination
            }
        }
        return ""
    }
}
