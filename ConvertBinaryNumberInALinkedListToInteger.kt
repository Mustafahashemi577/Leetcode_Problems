class ConvertBinaryNumberInALinkedListToInteger {
    fun getDecimalValue(head: ListNode?): Int {
        var num = 0
        var curr = head
        while(curr != null) {
            num = (num shl 1) or curr!!.`val`
            curr = curr!!.next
        }
        return num
    }
}
