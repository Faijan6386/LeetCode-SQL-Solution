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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(-1);
        ListNode s=small;
        ListNode l=large;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val>=x){
                l.next=temp;
                l=l.next;
            }else{
                s.next=temp;
                s=s.next;
            }
            temp=temp.next;
        }
        l.next=null;
        s.next=large.next;
        return small.next;

    }
}