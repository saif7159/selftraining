import java.util.*;

public class TreeImp{
	int data;
	TreeImp leftNode;
	TreeImp rightNode;
	Scanner sc;
	
	public TreeImp(int data, TreeImp leftNode, TreeImp rightNode){
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		sc = new Scanner(System.in);
	}
	
	public TreeImp(int data){
		this.data = data;
	}

	public void populateTree(){
		String x = sc.nextLine();
		System.out.println("Hello"+x);
	}

	public static void main(String[] args){
		TreeImp treeImp = new TreeImp(3,null,null);
		treeImp.populateTree();
	}

}