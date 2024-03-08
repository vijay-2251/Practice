class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beg(self, data):
        node = Node(data, self.head)
        self.head= node

    def insert_at_end(self, data):
        if self.head is None:
            self.head = Node(data, None)
            return
        itr = self.head
        while itr.next:
            itr = itr.next
        itr.next = Node(data, None)

    def insert_values(self, data_list):
        self.head = None
        for data in data_list:
            self.insert_at_end(data)
    def get_length(self):
        count=0
        itr = self.head
        while itr:
            count+=1
            itr = itr.next
        return count

    def remove_at(self,index):
        if index<0 or index>=self.get_length():
            raise Exception("invalid index")

        if index==0:
            self.head = self.head.next
            return

        count =0
        itr = self.head
        while itr:
            if count == index-1:
                itr.next = itr.next.next
                break
            itr = itr.next
            count+=1
            
    def print(self):
        if self.head is None:
            print("Linked list is empty")
            return

        itr = self.head
        llst = ''
        while itr:
            llst += str(itr.data)+' '
            itr = itr.next
        print(llst)

if __name__ == '__main__':
    ll = LinkedList()
    #ll.insert_at_beg(10)
    #ll.insert_at_beg(20)
    #ll.insert_at_end(30)
    ll.insert_values(["50","60","70"])
    ll.print()
    print("length of the list:", ll.get_length())
    ll.remove_at(1)
    ll.print()
