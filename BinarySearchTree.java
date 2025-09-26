package sorting_tech;

public class BinarySearchTree {
	node root;
	
    public void insert(int data) {
    	root=insertrec(root,data);
    }

	private node insertrec(node root, int data) {
		
		if(root==null) {
			root=new node(data);
		
		}
		else if (data<root.data) {
			root.left=insertrec(root.left,data);
			
		}
		else if(data>root.data) {
			root.right=insertrec(root.right,data);
		}
		return root;
	}
	public void inorder() {
		inorderrec(root);
		System.out.println();
	}
	private void inorderrec(node root) {
		if (root!=null) {
			inorderrec(root.left);
			System.out.print(root.data+" ");
			inorderrec(root.right);
		}
	}

}


