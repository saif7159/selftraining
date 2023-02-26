public class LinkedList{
	Node head;

	public static class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			next = null;
		}
	}

	public void printList(){
		Node headTrack = head;
		while(head != null)
			{
				System.out.print(head.data+"\t");
				head = head.next;
			}
		System.out.println();
		head = headTrack;	
	}

	public void pushElement(int num){
		// O(1)
		Node hcopy = head;
		Node newElement = new Node(num);
		newElement.next = head;
		head = newElement;
	}

	public void insertElement(int num){
		//O(n)
		Node newElement = new Node(num);
		newElement.next = null;
		Node lastElement = head;
		while(lastElement.next!=null){
			lastElement = lastElement.next;
		}
		lastElement.next = newElement;	
	}

	public void insertAfterElement(int numref,int num){
		//O(n)
		Node newElement = new Node(num);
		Node refElement = head;
		while(refElement.data != numref)
		{
			refElement = refElement.next;
		}
		newElement.next = refElement.next;
		refElement.next = newElement;
	}

	public void deleteElement(int numref){
		//O(n)
		Node refNode = head;
		while(refNode.next.data != numref){
			refNode = refNode.next;
		}
		refNode.next = refNode.next.next;
	}

	public void deleteRecursive(Node head, int key){
		if(head.next.data == key)
			head.next = head.next.next;
		else
			deleteRecursive(head.next,key);
	}

	// public void reverseLinkedList(Node nodeHead){
	// 	Node nodeRef = nodeHead;
	// 	while(nodeRef.next.next != null)
	// 		nodeRef = nodeRef.next; // reaching second last
	// 	while(!nodeRef.next.equals(head)){
	// 		nodeRef.next.next = nodeRef; // pointing back
	// 		while(nodeHead.next.equals())
	// 	}
	// }

	public void reverseLinkedListNew(Node nodeHead){
		Node prev = null;
		Node curr = nodeHead;
		Node next = null;
		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
}

