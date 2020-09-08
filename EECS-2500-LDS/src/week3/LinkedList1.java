package week3;
//THis one is from CS DOJO tutorial
public class LinkedList1 {
	public static void main(String[] args) {
		Node A = new Node(2); //this is a node new object
		Node B = new Node(2);
		Node C = new Node(2);
		A.next = B;
		B.next = C;
		System.out.println(countNodes(A));
	}
	static int countNodes(Node head) { //This counts the number of nodes in the linked list
		int count = 1;
		Node current = head;
		while(current.next != null) {
			current = current.next;
			count++;
		}
		return count;
		}
}
class Node{//this is a class node to define the object node
	int data;
	Node next;

	Node(int data){//This is a constructor
		this.data=data;
	}
}
