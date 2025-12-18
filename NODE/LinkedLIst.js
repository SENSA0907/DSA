var LinkedListNode = /** @class */ (function () {
    function LinkedListNode(value) {
        this.value = value;
        this.next = null;
    }
    return LinkedListNode;
}());
var LinkedList = /** @class */ (function () {
    function LinkedList(value) {
        var newNode = new LinkedListNode(value);
        this.value = newNode;
        this.head = newNode;
        this.tail = newNode;
        this.size = 1;
    }
    LinkedList.prototype.printList = function () {
        var temp = this.head;
        while (temp !== null) {
            console.log(temp.value);
            temp = temp.next;
        }
        console.log("linked list size is ", this.size);
    };
    LinkedList.prototype.append = function (value) {
        var newNode = new LinkedListNode(value);
        if (this.head === null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            if (this.tail) {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }
        this.size += 1;
    };
    LinkedList.prototype.pop = function () {
        if (this.head === null)
            return false;
        if (this.size === 1) {
            var temp = this.head;
            this.head = null;
            this.tail = null;
            this.size = 0;
            return temp;
        }
        else {
            var temp = this.head;
            var prev = this.head;
            while (temp.next) {
                prev = temp;
                temp = temp.next;
            }
            this.tail = prev;
            this.tail.next = null;
            this.size -= 1;
            return temp;
        }
    };
    LinkedList.prototype.prepend = function (value) {
        var newNode = new LinkedListNode(value);
        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size += 1;
    };
    LinkedList.prototype.get = function (index) {
        if (index < 0 || index >= this.size)
            return false;
        else {
            var temp = this.head;
            for (var i = 0; i < index; i++) {
                temp = temp === null || temp === void 0 ? void 0 : temp.next;
            }
            return temp === null || temp === void 0 ? void 0 : temp.value;
        }
    };
    LinkedList.prototype.set = function (index, value) {
        if (index < 0 || index >= this.size)
            return false;
        else {
            var temp = this.head;
            for (var i = 0; i < index; i++) {
                temp = temp === null || temp === void 0 ? void 0 : temp.next;
            }
            if (temp === null || temp === void 0 ? void 0 : temp.value)
                temp.value = value;
            return true;
        }
    };
    return LinkedList;
}());
var myLinkedLIst = new LinkedList(4);
// myLinkedLIst.append(5)
// myLinkedLIst.append(10)
// myLinkedLIst.printList()
console.log(myLinkedLIst.pop());
// myLinkedLIst.printList()
console.log('pop on empty list, show False', myLinkedLIst.pop());
myLinkedLIst.append(20);
// myLinkedLIst.printList();
myLinkedLIst.prepend(99);
// myLinkedLIst.printList()
myLinkedLIst.append(25);
myLinkedLIst.append(50);
myLinkedLIst.printList();
console.log(myLinkedLIst.get(0));
console.log(myLinkedLIst.get(1));
console.log(myLinkedLIst.get(2));
console.log(myLinkedLIst.get(3));
console.log(myLinkedLIst.get(-1));
myLinkedLIst.set(3, 19999);
console.log(myLinkedLIst.get(3));
