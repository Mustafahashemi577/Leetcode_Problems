class NumberOfStudentsUnableToEatLuch {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val n = students.size
        var res = n
        val cnt = IntArray(2)
        
        for (student in students) {
            cnt[student]++
        }

        for (i in 0 until n) {
            if (cnt[sandwiches[i]] > 0) {
                res--
                cnt[sandwiches[i]]--
            } else {
                break
            }
        }

        return res
    }
}
