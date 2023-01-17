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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode right= new ListNode();
        while(slow.next!=null){
            slow=slow.next;
            right= new ListNode(slow.val,right);
        }
        while(right.next!=null){
            if(head.val!=right.val){return false;}
            head=head.next;
            right=right.next;
        }
        return true;
    }
}