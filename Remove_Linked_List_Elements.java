class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ref = new ListNode(0);
        ListNode curr = ref;
        ref.next = head;
        while(curr.next != null){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return ref.next;
    }
}