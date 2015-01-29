package javapractice.bst;

import java.util.Scanner;

public class BSTMain {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree(); 
        System.out.println("Binary Search Tree Test\n");          
        char ch;
        do {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty");
            System.out.println("6. BFS");
            System.out.println("7. DFS");
            System.out.println("8. Minimum value");
            System.out.println("9. Maximum value");
            System.out.println("10. Maximum depth");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 :
                System.out.println("Enter integer element to insert");
                bst.insert(scan.nextInt());
                break;
            case 2 :
                System.out.println("Enter integer element to delete");
                bst.delete(scan.nextInt());
                break;                         
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.search(scan.nextInt()));
                break;                                          
            case 4 :
                System.out.println("Nodes = "+ bst.count());
                break;
            case 5 :
                System.out.println("Empty status = "+ bst.isEmpty());
                break;
            case 6 :
            	System.out.println("BFS");
            	OrderTraversal.levelOrderTraversal(bst);
                break;
            case 7 :
            	System.out.println("DFS");
            	OrderTraversal.depthFirstSearchTraversal(bst);
                break;
            case 8 :
            	System.out.println("Minimum Value");
            	System.out.println(OrderTraversal.minimumElement(bst));
                break;
            case 9 :
            	System.out.println("Maximum Value");
            	System.out.println(OrderTraversal.maximumElement(bst));
                break;
            case 10 :
            	System.out.println("Maximum Depth");
            	System.out.println(OrderTraversal.maximumDepth(bst.getRoot()));
                break;
            default : 
                System.out.println("Wrong Entry \n");
                break;
            }
            System.out.print("\nPost order :");
            bst.postorder();
            System.out.print("\nPre order :");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
}
