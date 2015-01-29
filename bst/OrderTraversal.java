package javapractice.bst;

import java.util.LinkedList;

public class OrderTraversal {
	private static LinkedList<BinarySearchTreeNode> queueList = new LinkedList<BinarySearchTreeNode>();
	
	/**
	 * breadth first search
	 * @param binarySearchTree
	 */
	public static void levelOrderTraversal(BinarySearchTree binarySearchTree){
		if (!binarySearchTree.isEmpty()){
			queueList.add(binarySearchTree.getRoot());
			while (null != queueList && queueList.size() > 0){
				System.out.println(" " + queueList.get(0).getData());
				BinarySearchTreeNode binarySearchTreeNode = queueList.get(0).getLeft(); 
				if (null != binarySearchTreeNode){
					queueList.add(binarySearchTreeNode);
				}
				binarySearchTreeNode = queueList.get(0).getRight();
				if (null != binarySearchTreeNode){
					queueList.add(binarySearchTreeNode);
				}
				queueList.pollFirst();
			}
		}
	}
	/**
	 * depth first search
	 * @param binarySearchTree
	 */
	public static void depthFirstSearchTraversal(BinarySearchTree binarySearchTree){
		if (!binarySearchTree.isEmpty()){
			queueList.add(binarySearchTree.getRoot());
			while (null != queueList && queueList.size() > 0){				
				BinarySearchTreeNode binarySearchTreeNode = queueList.pollLast();
				System.out.println(" " + binarySearchTreeNode.getData());
				if (null != binarySearchTreeNode && null != binarySearchTreeNode.getRight()){
					queueList.add(binarySearchTreeNode.getRight());
				}
				if (null != binarySearchTreeNode && null != binarySearchTreeNode.getLeft()){
					queueList.add(binarySearchTreeNode.getLeft());
				}
				
			}
		}
	}
	/**
	 * return the minimum element in the BST
	 * @param binarySearchTree
	 * @return
	 */
	public static String minimumElement(BinarySearchTree binarySearchTree){
		if (binarySearchTree.isEmpty()){
			return null;
		}
		BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getRoot();
		while (null != binarySearchTreeNode.getLeft()){				
			binarySearchTreeNode = binarySearchTreeNode.getLeft();
		}	
		return String.valueOf(binarySearchTreeNode.getData());
	}	
	/**
	 * return the max element in the BST
	 * @param binarySearchTree
	 * @return
	 */
	public static String maximumElement(BinarySearchTree binarySearchTree){
		if (binarySearchTree.isEmpty()){
			return null;
		}
		BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getRoot();
		while (null != binarySearchTreeNode.getRight()){				
			binarySearchTreeNode = binarySearchTreeNode.getRight();
		}	
		return String.valueOf(binarySearchTreeNode.getData());
	}
	/**
	 * return the max depth of BST
	 * @param binarySearchTree
	 * @return
	 */
	public static int maximumDepth(BinarySearchTreeNode binarySearchTreeNode){
		if (null == binarySearchTreeNode){
			return 0;
		}
		else {
			int lDepth = maximumDepth(binarySearchTreeNode.getLeft());
			int rDepth = maximumDepth(binarySearchTreeNode.getRight());
				if(lDepth > rDepth){
					return (lDepth + 1);
				} else {
					return (rDepth + 1);
				}
		}
	}
}
