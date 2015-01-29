package javapractice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int sum = 0; int n = i;
		while(i > 0) {
			int j = i % 10;
			sum = sum + (j*j*j);
			i = i/10;
		}
		if (sum ==  n){
			System.out.println("Number is arm strong");
		}
		
	}

}
