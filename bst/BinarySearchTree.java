package javapractice.bst;

public class BinarySearchTree {
	private BinarySearchTreeNode root;

	public BinarySearchTree() {
		root = null;
	}
	public BinarySearchTreeNode getRoot() {
		return root;
	}
	public boolean isEmpty(){
		return (root == null);
	}
	public void insert(int data){
		root = insert(root,data);
	}
	private BinarySearchTreeNode insert(BinarySearchTreeNode node,int data){
		if (node == null){
			node =  new BinarySearchTreeNode(data);
		}else {
			if (data < node.getData()){
				node.left = insert(node.getLeft(),data); 
			} else if (data > node.getData()){
				node.right = insert(node.getRight(),data);
			} else {
				System.out.println("Data already exist");
			}
		}		
		return node;		
	}
	public void delete(int data){
		if (isEmpty()){
			System.out.println("Tree is empty");
		} else if (!search(data)){
			System.out.println("Data not found");
		} else {
			root = delete(root,data);
		}
	}
	private BinarySearchTreeNode delete(BinarySearchTreeNode root, int k){
		BinarySearchTreeNode p,p2,node;
		if (root.getData() == k){
			BinarySearchTreeNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null) {
                p = rt;
                return p;
            } else if (rt == null) {
                p = lt;
                return p;
            } else {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null){
                    p = p.getLeft();
                }
            	p.setLeft(lt);
            	return p2;
            }
			
		}else if(root.getData() > k){
			node = delete(root.getLeft(),k);
			root.setLeft(node);
			
		} else if (root.getData() < k){
			node = delete(root.getRight(),k);
			root.setRight(node);
		}
		return root;
	}
	
	public int count(){
		return count(root);
	}
	private int count(BinarySearchTreeNode root){
		if (root ==  null){
			return 0;
		} else {
			int l = 1;
			l = l + count(root.getLeft());
			l = l + count(root.getRight());
			return l;
		}
	}
	
	public boolean search(int value){
		return searchNode(root,value);
	}
	
	private boolean searchNode(BinarySearchTreeNode root,int value){
		boolean found = false;
		while ((root != null) && !found){
			if (root.getData() >  value){
				root = root.getLeft();
			} else if (root.getData() <  value) {
				root = root.getRight();
			} else {
				found = true;
				break;
			}
			found = searchNode(root,value);
		}
		return found;
	}
	
	public void preorder(){
		preorder(root);
	}
	private void preorder(BinarySearchTreeNode root){
		if(root != null){
			System.out.println(root.getData());
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	} 
	public void postorder(){
		postorder(root);
	}
	private void postorder(BinarySearchTreeNode root){
		if(root != null){			
			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.println(root.getData());
		}
	} 
	public void inorder(){
		inorder(root);
	}
	private void inorder(BinarySearchTreeNode root){
		if(root != null){			
			inorder(root.getLeft());
			System.out.println(root.getData());
			inorder(root.getRight());			
		}
	}
}
