public class LinkedListSelfPractice {
	Node head;
	public static class Node {
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}

	public void addNode(int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if(head == null)
		{
			head = newNode;
		}
		else{
			Node headRef = head;
			while (head.next != null) {
				head = head.next;
			}
			head.next = newNode;
			head = headRef;
		}

	}

	public void traverseList(){
		Node headRef = head;
		System.out.print("[");
		while (head != null) {
			System.out.print(head.data + "\t");
			head = head.next;
		}
		System.out.print("]\n");
		head = headRef;
	}

	public void reverseList(){
		Node headRef = head;
		Node headRef1 = null;
		while (head.next != null){
			headRef1 = head;
			Node headNext = head.next;
			headRef1 = headNext.next;
			head = headNext; 
		}
		head.next = headRef1;
		// headRef.next = null;
	}

	public static void main (String ... args) {
		LinkedListSelfPractice linkedList = new LinkedListSelfPractice();
		linkedList.addNode(22);
		linkedList.addNode(23);
		linkedList.addNode(24);
		linkedList.traverseList();
		linkedList.reverseList();
		linkedList.traverseList();
	}
}