class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
            return true;
        ListNode temp = head;
        boolean result = true;
        int length = 0;
        while(temp!=null){temp = temp.next; length++;}
        Stack<Integer> stack = new Stack<>();
            for(int i = 0;i<length/2;i++){
            stack.push(head.val);
            head=head.next;
        }
        if(length%2==1){
            head = head.next;
        }
        while(head!=null){
            if(head.val!=stack.pop()){
                result =false;
                break;
            }
            head = head.next;
        }
        return result;
    }
}