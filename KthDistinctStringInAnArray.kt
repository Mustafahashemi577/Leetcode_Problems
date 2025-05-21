class KthDistinctStringInAnArray {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = hashMapOf<String, Int>()
        arr.forEach{
            map.put(it, map.getOrDefault(it, 0)+1)
        }
        var k = k
        arr.forEach{
            if(map[it] == 1) {
                k--
            }
            if(k==0) return it
        }
        return ""
    }
}
