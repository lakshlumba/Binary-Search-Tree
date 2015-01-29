package javapractice;

public class FabbonacciSeries {
	public static void main (String args[]){
//		long j = 0; long k = 1;
//		for (int i = 0 ; i < 50 ; i++){
//			if (i == 0 || i == 1){
//				System.out.println(i);
//			} else {
//				long l = j + k;
//				System.out.println(l);
//				j = k;
//				k = l;
//			}
//		}
		for (int i = 0 ; i < 10 ; i++){
			System.out.println(fabonacci(i));
		}
	}
	private static int fabonacci(int n){
		if (n == 0 || n == 1){
			return n;
		}
		else{ 
			return fabonacci(n-1) + fabonacci(n-2);
		}
	}
}
