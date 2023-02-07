public class LinkedListPractice {
	Node head;
	public static class Node{
		int value;
		Node next;
		public Node(int value){
			this.value = value;
		}
	}

	//Utility Methods
	public void traverseLinkedList(){
		while(head.next != null)
		{
			System.out.print(head.value+", ");
			head = head.next;
		}
	}
}