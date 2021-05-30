package OOPSConceptPart1;

public class StaticandNonstatic {
	
	String name= "Tom";//non-static global variable 
	static int age = 25;//static global variable 
	
	

	public static void main(String[] args) {
		//1.direct calling
		System.out.println(age);
		sum();
		
		//2. Calling by Class name
		StaticandNonstatic.sum();
		System.out.println(StaticandNonstatic.age);
		
		
		StaticandNonstatic st= new StaticandNonstatic();//creating class object
		st.sendmail();
		System.out.println(st.name);
		
		
		System.out.println("calling static metd and vars in non-static way");
		//3.calling by non static way
		st.sum();
		System.out.println(st.age);
	}
	
	
	public void sendmail() {//non-static method
		System.out.println("Send mail");
		System.out.println("calling static variable and function inside a function");
		System.out.println(age);
		sum();
	}
	
	
	
	public static void sum() {//static method
		System.out.println("Sum method1");
		System.out.println("calling static variable1 and function1 inside a function");
		System.out.println(age);
		//sum();//******* java.lang.stackoverflowerror
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
