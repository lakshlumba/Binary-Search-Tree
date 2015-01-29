package javapractice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		System.out.println(factorial(N));
	}
	private static int factorial(int i ){
		if (i == 0 || i == 1){
			return i;
		}
			return i*factorial(i-1);
	}
}
