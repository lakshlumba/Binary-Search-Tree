package javapractice;

public class CharReplace {
	public static void main (String args[]){
		String str = "asdfhaaaaa";
		String newstr = replaceALL(str);
		System.out.println(newstr);
	}
	private static String replace(String str){
		String newstr = str.replace('a', 'b');
		return newstr;
	} 
	private static String replaceALL(String str){
		//String newstr = str.replace('a', 'b');
		char[] strchar =  str.toCharArray();
		for (int i = 0 ; i < strchar.length; i++ ){
				if (strchar[i] == 'a'){
					strchar[i] = 'b';
				}
			}		
		return new String(strchar);
	}
}
