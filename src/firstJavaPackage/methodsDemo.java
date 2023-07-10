package firstJavaPackage;

public class methodsDemo {

	//1. Methods with return type and can be called by invoking an object
	
	public int add(int x, int y) {
		int a =x, b=y;
		return(a + b);		
	}
	
	//2. Methods without return type and can be called by invoking an object
	public void sub() {
		int a =10, b=20;
		int sub = b - a;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		
		methodsDemo obj1 = new methodsDemo();
		System.out.println(obj1.add(10, 20));		//30
		obj1.sub();//10
		
		System.out.println(multi());	//200
		div();//2
	}
	
	//3. Methods with return type and can be called without invoking an object
	public static int multi() {
		int a =10, b=20;
		return(a * b);		
	}
	
	//4. Methods without return type and can be called without invoking an object
	public static void div() {
		int a =10, b=20;
		System.out.println(b/a);
	}
	
}
