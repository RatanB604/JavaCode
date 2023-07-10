package firstJavaPackage;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		ArrayList <String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("Java");
		arrayList1.add("Selenium");
		arrayList1.add("TestNG");
		arrayList1.add("Maven");
		
		System.out.println(arrayList1.get(3));	
		System.out.println(arrayList1.size());
		System.out.println(arrayList1);
		arrayList1.remove(1);
		System.out.println(arrayList1);
		System.out.println(arrayList1.size());
		arrayList1.add("Selenium");
		System.out.println(arrayList1);
		System.out.println(arrayList1.size());
		arrayList1.add("Ant");
		System.out.println(arrayList1);
		arrayList1.clear();
		System.out.println(arrayList1);
		System.out.println(arrayList1.size());
	}

}
