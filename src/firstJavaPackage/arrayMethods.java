package firstJavaPackage;

import java.util.Arrays;

public class arrayMethods {

	public static void main(String[] args) {
	
		int [] a = {10, 20, 30, 40, 50};
		String [] str1 = {"Java", "Selenium", "Python", "Load Runner"};
		
		System.out.println(a.length);//5
		
		//Printing the Array using loop
		for(int i=0;i<(a.length); i++) {
			System.out.println(a[i]);
		}
		
		//Copy Array to string
		String str2 = Arrays.toString(a);
		System.out.println(str2);
		
		//Enhanced For loop
		for(String Val:str1) {
			System.out.println(Val);
		}
		
		//Array contains any value
		boolean result = Arrays.asList(str1).contains("JAVA");
		System.out.println(result);//true
		
		
	
	}

}
