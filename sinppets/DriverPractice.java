public class DriverPractice{
	public static void main(String [] args){
		LinkedListPractice llp = new LinkedListPractice();
		llp.head = new LinkedListPractice.Node(0);
		LinkedListPractice.Node n0 = new LinkedListPractice.Node(1);
		llp.head.next = n0;
		LinkedListPractice.Node n1 = new LinkedListPractice.Node(3);
		n0.next = n1;
		LinkedListPractice.Node n2 = new LinkedListPractice.Node(4);
		n1.next = n2;
		llp.traverseLinkedList();
	}
}