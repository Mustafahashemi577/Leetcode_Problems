class Middle_Of_The_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){temp = temp.next; length++;}
        if(length%2==0){
            for(int i = 0;i<length/2;i++){
                head = head.next;
            }
            return head;
        }
        else{
            for(int i = 0;i<length/2;i++){
                head = head.next;
            }
            return head;
        }
    }
}