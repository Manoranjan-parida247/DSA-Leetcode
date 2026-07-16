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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(size == n) return head.next;

        int idx = size - n; // 3
        temp = head;
        int cnt = 0;

        while(temp != null){
            cnt++;
            if(cnt == idx){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}