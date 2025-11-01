class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        var set = new HashSet<Integer>();
        for(int num : nums) set.add(num);
        var dummy = new ListNode(0,head);
        var prev = dummy;
        var cur = head;
        while(cur!=null){
            if(set.contains(cur.val)){
                prev.next = cur.next;
            }
            else{
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
