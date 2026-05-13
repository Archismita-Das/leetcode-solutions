
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
     if(head==null || left==right){
        return head;
     }

    ListNode DummyNode = new ListNode(0);
    DummyNode.next = head;
     ListNode PrevNode = DummyNode;;
     for(int i=1;i<left;i++){
         PrevNode = PrevNode.next;
     }
     ListNode CurrentNode = PrevNode.next;

     for(int i=0;i<right-left;i++){
        ListNode NextNode= CurrentNode.next;
        CurrentNode.next = NextNode.next;
        NextNode.next = PrevNode.next;
        PrevNode.next = NextNode;
     }
       return DummyNode.next;
    }
}