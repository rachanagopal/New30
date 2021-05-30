package javabasics;

public class IfElseconcept {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("b is lesser than a");
		}
		
		//comparison operators
		// >, <, <=, >= ,!=, ==, 
		
		int c = 40;
		int d = 400;
		
		if (c==d) {
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		
		// logic to find the highest number
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		if(a1>b1 && a1>c1) {			
			System.out.println("A is greater");
		}else if (b1>a1 && b1>c1) {
			System.out.println("B is greater");
		}else {
			System.out.println("C is greater");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
