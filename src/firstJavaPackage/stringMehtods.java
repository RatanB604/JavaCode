package firstJavaPackage;

public class stringMehtods {

	public static void main(String[] args) {
		String str1 = "Automation Testing with JAVA";
		String str2 = "AUTOMATION TESTING";
		String str3 = "$elenium2";
		String str4 = " Automation Testing ";
		
		System.out.println(str1.charAt(11));//T
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		System.out.println(str1.length());//18
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str3.toUpperCase());
		
		System.out.println(str2.toLowerCase());
		
//		System.out.println(str1.equalsIgnoreCase(str4));
		
		System.out.println(str4.trim());//Automation Testing
		
		System.out.println(str1.substring(11));//Testing with JAVA
		System.out.println(str1.substring(11,18));//Testing
		
		System.out.println(str1.endsWith("JAVA"));//true
		System.out.println(str1.endsWith("Python"));//false
		
		
	}

}
