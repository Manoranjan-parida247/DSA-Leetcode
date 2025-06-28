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
// var hasCycle = function(head) {
//     let curr = head;
//     const seenNodes = new Set();
//     while(head !== null){
//         if(seenNodes.has(head)){
//             return true;
//         }
//         seenNodes.add(head);
//         head = head.next;
//     }
//     return false;
// };

var hasCycle = function(head) {
    if (head === null || head.next === null) return false;
    let slow = head;
    let fast = head.next; // head.next cause if fast = head . the while loop never exeecute

    while(slow !== fast){

        if(fast === null || fast.next === null) return false;

        slow = slow.next;
        fast = fast.next.next;
    }

    return true;
}


// var hasCycle = function(head) {
//     if (head === null || head.next === null) return false;

//     let slow = head;
//     let fast = head;

//     while (fast !== null && fast.next !== null) {
//         slow = slow.next;
//         fast = fast.next.next;

//         if (slow === fast) return true; // cycle detected
//     }

//     return false; // fast reached the end, no cycle
// };
