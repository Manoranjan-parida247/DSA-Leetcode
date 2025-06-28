/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    if(head.next === null) return true;
    //step 1 -> find middle of the linked list
    let slow = head;
    let fast = head;

    while(fast !== null && fast.next !== null){
        slow = slow.next;
        fast = fast.next.next;
    }

    let secondHalf = reverseList(slow);
    let temp = head;

    while(secondHalf !== null){
        if(temp.val !== secondHalf.val){
            return false;
        }
        temp = temp.next;
        secondHalf = secondHalf.next;
    }

    return true;
};


const reverseList = function(head) {
    let prev = null;
    let curr = head;

    while(curr !== null){
        let temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
};