import java.io.*;
import java.util.*;

class LinkedList
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
}
}