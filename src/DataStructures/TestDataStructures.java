package DataStructures;

public class TestDataStructures {

	public static void main(String args[])
	{
		//BST Testing
		//BST b = new BST();
		
		//LinkedList Testing
		LinkedList<Integer> test = new LinkedList<Integer>();
		test.printAll();
		test.add(5);
		test.printAll();
		test.add(6);
		test.printAll();
		test.add(7,1);
		test.printAll();
		test.add(9);
		test.printAll();
		test.remove(1);
		test.printAll();
		test.remove(0);
		test.printAll();
		System.out.println(test.getData(1));
		test.removeLast();
		test.printAll();
	}
}
