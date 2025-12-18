class LinkedListNode {
    value: any
    next: any
    constructor(value) {
        this.value = value;
        this.next = null
    }
}

class LinkedList {
    value: LinkedListNode | null
    head: LinkedListNode | null
    tail: LinkedListNode | null
    size: number;
    constructor(value) {
        let newNode = new LinkedListNode(value);
        this.value = newNode;
        this.head = newNode;
        this.tail = newNode;
        this.size = 1;
    }

    printList() {
        let temp = this.head;
        while(temp !== null) {
            console.log(temp.value);
            temp = temp.next
        }
        console.log("linked list size is ", this.size)
    }

    append(value) {
        let newNode = new LinkedListNode(value);
        if (this.head === null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            if (this.tail) {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }
        this.size += 1
    }

    pop() {
        if (this.head === null) return false;
        if (this.size === 1) {
            let temp = this.head
            this.head = null;
            this.tail = null;
            this.size = 0;
            return temp;
        } else {
            let temp = this.head;
            let prev = this.head;
            while(temp.next) {
                prev = temp;
                temp = temp.next
            }
            this.tail = prev
            this.tail.next = null
            this.size -= 1
            return temp
        }
    }

    prepend(value) {
        let newNode = new LinkedListNode(value);
        if (!this.head) {
            this.head = newNode
            this.tail = newNode
        } else {
            newNode.next = this.head
            this.head = newNode
        }
        this.size += 1
    }

    get(index) {
        if (index < 0 || index >= this.size) return false
        else {
            let temp = this.head;
            for(let i = 0; i < index; i++) {
                temp = temp?.next     
            }
            return temp?.value
        }
    }

    set(index, value) {
        if (index < 0 || index >= this.size) return false
        else {
            let temp = this.head;
            for(let i = 0; i < index; i++) {
                temp = temp?.next     
            }
            if (temp?.value) temp.value = value
            return true
        }
    }
}

const myLinkedLIst = new LinkedList(4);
// myLinkedLIst.append(5)
// myLinkedLIst.append(10)
// myLinkedLIst.printList()
console.log(myLinkedLIst.pop())
// myLinkedLIst.printList()
console.log('pop on empty list, show False',myLinkedLIst.pop())
myLinkedLIst.append(20);
// myLinkedLIst.printList();
myLinkedLIst.prepend(99);
// myLinkedLIst.printList()
myLinkedLIst.append(25);
myLinkedLIst.append(50);
myLinkedLIst.printList();
console.log(myLinkedLIst.get(0))
console.log(myLinkedLIst.get(1))
console.log(myLinkedLIst.get(2))
console.log(myLinkedLIst.get(3))
console.log(myLinkedLIst.get(-1))
myLinkedLIst.set(3, 19999);
console.log(myLinkedLIst.get(3))

