class Remove_Nth_Node_From_End_Of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        return null;
        ListNode current=head;
        int length = 0;
        while(current!=null){current = current.next; length++;}
        current = head;
        int index = length-(n-1);
        ListNode previous = null;
        if(n==length)
        return head.next;
        while(index>1){
            previous=current;
            current = current.next;
            index--;
        }
        previous.next = current.next;
        current.next=null;
        
        return head;
    }
}