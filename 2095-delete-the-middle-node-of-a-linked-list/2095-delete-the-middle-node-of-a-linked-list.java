/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        else {
            int n = 0;
            ListNode temp = head;
            while(temp!=null){
                n++;
                temp = temp.next;
            }
            int mid = n/2;
            ListNode curr = head;
            for(int i = 0; i<mid-1;i++){
                curr = curr.next;
            }
            curr.next= curr.next.next;
        }
        return head;
    }
}