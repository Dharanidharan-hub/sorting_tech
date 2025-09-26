package sorting_tech;

public class main {
	public static void main(String[] args) {

		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(45);
		tree.insert(12);
		tree.insert(8);
		tree.insert(7);
		tree.insert(5);
		
		tree.inorder();
		tree.insert(2);
		tree.inorder();
		System.out.println(tree.root.data);


}
}
