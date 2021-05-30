package OOPSConceptPart1;

public class MethodOverloading {
	
	
	//you cannot create a method within a method
	//duplicate methods- same method with same number of arguments are not allowed
	//we can overload main method with diff arguments

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(3);
		obj.sum(5, 2);
		
		main(10);
		obj.main(12.33);
		
		
		obj.sum(10.67);

	}
	
	
	public static void main(int q) {
		System.out.println("Test");
		
	}
	
	public void main(double d) {
		System.out.println("Test1");
	}
	
//method overloading- method name is same with different arguments or input arguments within the same class
	public void sum() {//0 input parameter
		System.out.println("Sum method----zero parameter");
	}
	
	public void sum(int i) {//1 input parameter
		System.out.println("Sum method----1 input arguments");
		System.out.println(i);
	}
	
	public void sum(int j, int k) {//2 input parameter
		System.out.println("Sum method----2 input arguments");
		System.out.println(j);
		System.out.println(k);
	}
	
	//method overloading- method name is same with different arguments or input arguments within the same class but of diff data type
	
	public void sum(double d) {//1 input parameter
		System.out.println("Sum method----zero parameter of diff data type");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
