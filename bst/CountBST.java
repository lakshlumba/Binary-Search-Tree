package javapractice.bst;

public class CountBST {
	
	public static void main(String args[]){
		int[] nodes = {1,2,3,4};
		System.out.println(nodes.length);
		System.out.println(countBSTree(nodes.length));
	}
	public static int countBSTree(int n){		
		if (n == 0 ||  n == 1){
			return 1;
		}
		else{
			int sum = 0; int left = 0; int right = 0;
			for (int k = 1 ; k <= n ; k++ ){
				left = countBSTree(k-1);
				right = countBSTree(n-k);
				sum = sum + (left*right); 
			}
			return sum;
		}
		
	}
	

}
