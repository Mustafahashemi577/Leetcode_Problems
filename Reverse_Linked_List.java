class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        if(head == null )
            return null;
        else{
            while(head!=null){
                ListNode temp = head.next;
                head.next=result;
                result = head;
                head = temp;
            }
        }
        return result;
    }
}