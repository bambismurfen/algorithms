package lab3AndAnd;

public class TestAVL {
	
	public static void main(String []args){
		AvlTree at=new AvlTree();
		at.add(4);
		at.add(6);
		at.add(9);
		at.printTree();
		at.add(10);
		at.add(3);
		at.add(2);
		at.add(1);
		
		
		at.printTree();
	}
}
