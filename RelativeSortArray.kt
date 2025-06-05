class RelativeSortArray {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val result = IntArray(arr1.size)
        val list = arr1.toMutableList()
        var index = 0
        for (num in arr2) {
            while (list.contains(num)) {
                result[index++] = num
                list.remove(num)
            }
        }
        list.sort()
        for (num in list) {
            result[index++] = num
        }
        return result
    }
}
