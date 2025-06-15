class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
          val a = IntArray(m) { nums1[it] }
        var i = 0
        var j = 0
        var k = 0

        while (j < m && k < n) {
            if (a[j] < nums2[k]) {
                nums1[i] = a[j]
                i++
                j++
            } else {
                nums1[i] = nums2[k]
                i++
                k++
            }
        }

        while (k < n) {
            nums1[i] = nums2[k]
            i++
            k++
        }

        while (j < m) {
            nums1[i] = a[j]
            i++
            j++
        }
    }
}
