/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let curr = head;
    const seenNodes = new Set();
    while(head !== null){
        if(seenNodes.has(head)){
            return true;
        }
        seenNodes.add(head);
        head = head.next;
    }
    return false;
};