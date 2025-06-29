/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    if(head === null) return null;
    let length = 0;
    let temp = head;

    while(temp !== null){
        temp = temp.next;
        length++;
    }

    if(length === n) return head.next;
    let res = length - n;

    temp = head;

    while(temp !== null){
        res--;
        if(!res) break;
        temp = temp.next;
    }

    temp.next = temp.next.next;
    return head;
};