public class Linked_List_Cycle2 {
    public boolean hasCycle(ListNode head) {
        HashMap <ListNode, Integer> map = new HashMap<>();
        while(head!=null){
            if(map.containsKey(head))
            return true;
            map.put(head,1);
            head = head.next;
        }
        return false;
    }
}