package firstJavaPackage;

public class arrayDemo {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40};		
		System.out.println(a[0] + a[3]);//50
		
		char [] b = {'a','b','d','X'};
		String [] strArray = {"Java", "Selenium", "TestNG", "Git"};
		
		System.out.println(strArray[2]);
		strArray[2] = "C#";
		System.out.println(strArray[2]);
		strArray[4] = "Python";

	}

}
