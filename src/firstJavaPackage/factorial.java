package firstJavaPackage;

public class factorial {
	public static int fact(int r) {
		int result=1;
		for (int i =1;i<=r;i++) {
			result = result * i; 
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
