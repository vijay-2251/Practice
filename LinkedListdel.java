import java.io.*;

class LinkedListdel
{
Node head;
static class Node
{
int data;
Node next;
Node(int d)
{
data = d;
next = null;
}
}

public static LinkedList insert(LinkedList list, int data)
{
	Node nn = new Node(data);
	if(list.head == null)
	{
		list.head = nn;
	}
	else
	{
		Node last = list.head;
		while(last.next!=null){
		last = last.next;
		}
		last.next = nn;
	}
	return list;
}
public static LinkedList deletebykey(LinkedList list, int data)
{
	//Node nn = new Node(data);
	Node currnode = list.head, prev = null;
	if(currnode != null && currnode.data == data)
	{
		list.head = currnode.next;
		System.out.println(data+ "found in list and deleted");
		return list;
	}
	while (currnode != null && currnode.data != data) {
            // If currNode does not hold key
            // continue to next node
            prev = currnode;
            currnode = currnode.next;
        }
 
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currnode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currnode.next;
 
            // Display the message
            System.out.println(data + " found and deleted");
        }
 
        //
        // CASE 3: The key is not present
        //
 
        // If key was not present in linked list
        // currNode should be null
        if (currnode == null) {
            // Display the message
            System.out.println(data + " not found");
        }
	return list;
}
public static void print(LinkedList list)
{
	Node currnode = list.head;
	System.out.print("Linked List:");
	while(currnode!=null)
	{
		System.out.print(currnode.data+" ");
		currnode = currnode.next;
	}
}

public static void main(String args[])
{
	LinkedList list = new LinkedList();
	list = insert(list, 10);
	list = insert(list, 20);
	list = insert(list, 30);
	list = insert(list, 40);
	list = insert(list, 50);
	print(list);
	list = deletebykey(list, 10);
	print(list);
}
}