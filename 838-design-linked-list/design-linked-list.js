function Node(val) {
    this.val = val;
    this.next = null;
}


var MyLinkedList = function () {
    this.head = null;
    this.size = 0;
};

/** 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function (index) {
    if (index < 0 || index >= this.size) return -1;

    let currNode = this.head;

    for(let i = 0; i < index; i++){
        currNode = currNode.next;
    }

    return currNode.val;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function (val) {
    let newNode = new Node(val);
    newNode.next = this.head;
    this.head = newNode;
    this.size++;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function (val) {
    let newNode = new Node(val);

    //edge case => if head is empty
    if (this.head === null) {
        this.head = newNode;
    } else {
        let currNode = this.head;

        while (currNode.next !== null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    this.size++;
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function (index, val) {
    if (index < 0 || index > this.size) return; // invalid index

    let newNode = new Node(val);
    //edge case if(index === 0) || // Inserting at the head
    if (index === 0) {
        newNode.next = this.head;
        this.head = newNode;
    } else {
        let currNode = this.head;
        let i = 0;
        let prev = null;

        // Traverse untill index - 1
        while (i < index) {
            prev = currNode;
            currNode = currNode.next;
            i++;
        }

        // Insert newNode between prev and curr
        prev.next = newNode;
        newNode.next = currNode;
    }
    this.size++;
};

/** 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if (index < 0 || index >= this.size) return; // Invalid index

    // Case 1: Delete head
    if (index === 0) {
        this.head = this.head.next;
    } else {
        // Case 2: Delete non-head node
        let currNode = this.head;
        for (let i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }
        // Skip the node to be deleted
        currNode.next = currNode.next.next;
    }

    this.size--;
};


/** 
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */