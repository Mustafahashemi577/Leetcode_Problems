// Second approach by helping of Mosh Hamedani's video
class Reverse_Linked_List2 {
    public ListNode reverseList(ListNode head) {
        if(head == null )
            return null;
        else{
            ListNode previous = null;
            ListNode current = head;
            while(current!=null){
                ListNode next = current.next;
                current.next=previous;
                previous = current;
                current = next;
            }
            return previous;
        }
    }
}