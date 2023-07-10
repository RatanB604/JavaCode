package firstJavaPackage;

public class characterMethods {

	public static void main(String[] args) {
	char a = 'Z';
	char b = '1';
	char c = 'a';
	
	System.out.println(Character.isLetter(a));//true
	System.out.println(Character.isLetter(b));//false
	System.out.println(Character.isLetter('*'));//false
	
	System.out.println();
	
	System.out.println(Character.isDigit(a));//false
	System.out.println(Character.isDigit(b));//true
	System.out.println(Character.isDigit('9'));//true
	
	System.out.println();
	
	System.out.println(Character.isLowerCase(c));//true
	System.out.println(Character.isUpperCase(a));//true
	
	System.out.println();
	
	System.out.println(Character.isLowerCase(a));//false
	System.out.println(Character.isUpperCase(c));//false
	}
	

}
