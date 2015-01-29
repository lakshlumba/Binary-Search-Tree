package javapractice.bst;

public class BinarySearchTreeNode {
	BinarySearchTreeNode left,right;
	int data;	
	BinarySearchTreeNode next;
	/**
	 * constructor
	 */
	public BinarySearchTreeNode() {
		this.left = null;
		this.right = null;
		this.data = 0;
	}
	/**
	 * 
	 * @param data
	 */
	public BinarySearchTreeNode(int data) {
		this.left = null;
		this.right = null;
		this.data = data;
	}
	public BinarySearchTreeNode next(){
		return next;
	}
	public BinarySearchTreeNode getLeft() {
		return left;
	}
	public BinarySearchTreeNode getRight() {
		return right;
	}
	public int getData() {
		return data;
	}
	public void setNext(BinarySearchTreeNode node){
		this.next = node;
	}
	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}
	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String toString(){
		return String.valueOf(data);			
	}
	
}
