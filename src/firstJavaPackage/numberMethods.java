package firstJavaPackage;

public class numberMethods {

	public static void main(String[] args) {
	int a1 = 10;
	int a2 = -10;
	int a3 = 100;
	
	double b1 = 10.2345;
	double b2 = -10.7375;
	
	Integer x = a1;
	
	System.out.println(x.compareTo(10));//0
	System.out.println(x.compareTo(11));//-1
	System.out.println(x.compareTo(1));//1

	System.out.println(x.equals(11));//false
	System.out.println(x.equals(10));//true
	
	System.out.println(a2);//-10
	System.out.println(Math.abs(a2));
	
	System.out.println(b2);//-10.234
	System.out.println(Math.abs(b2));
	
	System.out.println(Math.round(b1));//10
	System.out.println(Math.round(b2));//-11
	
	System.out.println(Math.min(a1, a3));//10
	
	System.out.println(Math.max(a1, a3));//100
	System.out.println(Math.max(b1, b2));//10.2345
	
	System.out.println(Math.random());
	}

}
