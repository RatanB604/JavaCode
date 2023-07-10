package firstJavaPackage;

public class stringDemo {

	public static void main(String[] args) {
/*	String str1 = "Java";
	String str2 = " Selenium";
	int a =10;
	
	System.out.println(str1 + a);
	System.out.println(str1 + str2);
	System.out.println(str1.concat(str2)); */
	
	String str1 = "Selenium";
	String str2 = "SELENIUM";
	String str3 = "Selenium";
	String str4 = "zelenium";
	
	System.out.println(str1.equals(str2));//false
	System.out.println(str1.equals(str3));//true
	System.out.println("");
	System.out.println(str1==str2);//false
	System.out.println(str1==str3);//true
	System.out.println("");
	System.out.println(str1.compareTo(str2));//Positive number
	System.out.println(str1.compareTo(str3));//0
	System.out.println(str1.compareTo(str4));//Negative number
	}

}
