package firstJavaPackage;

public class objClassIntro {
	
	static int num1 = 10;
	String name = "Jason";
	
	public int printNum() {
		int a =100 , b =200;
		return (a + b);			
	}
	
	public static void main(String[] args) {
		int a = 200, b = 400;
		
		objClassIntro obj1 = new objClassIntro();
		
		System.out.println(a + b);//600
		System.out.println(obj1.printNum());//300
		System.out.println(num1);
		System.out.println(obj1.name);
		
	}

}
