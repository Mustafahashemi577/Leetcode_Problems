class MergeInBetweenLinkedLists {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var cur = list1
        val arr = mutableListOf<ListNode>()
        while (cur != null) {
            arr.add(cur)
            cur = cur.next
        }
        arr[a - 1].next = list2
        cur = list2
        while (cur?.next != null) {
            cur = cur.next
        }
        cur?.next = arr[b + 1]
        return list1
    }
}
