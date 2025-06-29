/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if (head === null || head.next === null || k === 0) return head;

    // Step 1: Compute the length and get the tail node
    let length = 1;
    let tail = head;
    while (tail.next !== null) {
        length++;
        tail = tail.next;
    }

    // Step 2: Compute effective rotation
    k = k % length;
    if (k === 0) return head;

    // Step 3: Find the new tail (length - k - 1 steps from the beginning)
    let newTail = head;
    for (let i = 1; i < length - k; i++) {
        newTail = newTail.next;
    }

    // Step 4: Set the new head and break the list
    let newHead = newTail.next;
    newTail.next = null;

    // Step 5: Connect the old tail to the old head
    tail.next = head;

    return newHead;
};
