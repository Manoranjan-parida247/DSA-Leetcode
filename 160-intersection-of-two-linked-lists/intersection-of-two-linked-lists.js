/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    //put all nodes of head A linkedlist in set
    const seenNodes = new Set();
    let curr = headA;
    while(curr !== null){
        seenNodes.add(curr);
        curr = curr.next;
    }

    curr = headB;

    while(curr !== null){
        if(seenNodes.has(curr)){
            return curr;
        }
        curr = curr.next;
    }
};