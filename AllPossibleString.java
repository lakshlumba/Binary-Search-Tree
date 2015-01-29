package javapractice;

public class AllPossibleString {
	public static void main(String args[]){
		String str = "ABCD";
		char[] buff =  new char[2*(str.length())];
		buff[0] = str.charAt(0);
		printAll(str.toCharArray(),buff,1,1,str.length());
	}
	
	public static void printAll(char[] str, char[] buff, int i, int j ,int n){
		if(i==n){
			buff[j] = '\0';
			System.out.println(buff);
			return; 
		}
		buff[j] = str[i];
		printAll(str,buff,i+1,j+1,n);
		buff[j] = ' ';
		buff[j+1] = str[i];
		printAll(str,buff,i+1,j+2,n);
	}
}
