class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self, value) -> None:
        new_node = Node(value)
        self.head = new_node
        self.tail = new_node
        self.size = 1

    def print_list(self):
        temp = self.head
        while temp is not None:
            print(temp.value)
            temp = temp.next
        print(self.size)
    
    def append(self, value):
        """ check if LL is empty """
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.size += 1

    def pop(self):
        if self.head is None:
            return False
        
        if self.size is 1:
            self.head = None
            self.tail = None
            self.size = 0
            return True
        else:
            temp = self.head
            prev = self.head
            while temp.next:
                prev = temp
                temp = temp.next
            self.tail = prev
            self.tail.next = None
            self.size -= 1
    
    def prepend(self, value):
        newNode = Node(value)
        if self.head is None:
            self.head = newNode
            self.tail = newNode
        else:
            newNode.next = self.head
            self.head = newNode
        self.size += 1
    
    def popFirst(self):
        if self.head is None:
            return False
        temp = self.head
        if self.size is 1:
            self.head = None
            self.tail = None
        else:
            self.head = self.head.next
            temp.next = None
        self.size -= 1
        return temp

    def get(self, index):
        if index < 0 or index >= self.size:
            return None
        else:
            temp = self.head
            for _ in range(index):
                temp = temp.next
            return temp.value
    
    def set_value(self, index, value):
        if index < 0 or index >= self.size:
            return None
        else:
            temp = self.head
            for _ in range(index):
                temp = temp.next
            temp.value = value
        return True
        
                



    
    

linkedList = LinkedList(4)
linkedList.append(5)
linkedList.append(7)
# linkedList.print_list()
linkedList.pop();
# linkedList.print_list()
linkedList.prepend(99)
# linkedList.print_list()
print(linkedList.popFirst())
# linkedList.print_list()
linkedList.append(55)
linkedList.append(89)
linkedList.print_list()
print(linkedList.get(3))
linkedList.set_value(3, 10000)
linkedList.print_list()