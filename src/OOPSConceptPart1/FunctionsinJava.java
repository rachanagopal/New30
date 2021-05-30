package OOPSConceptPart1;

public class FunctionsinJava {
	
	//function and method are same
//main is the starting point of execution
	
	//main is void because we never write return statemtn in main method==never returns a value
	
	public static void main(String[] args) {

		FunctionsinJava obj = new FunctionsinJava();// object is created and obj is reference variable referring to this object
		//after creating object, the copy of all non static methods will be given to this object.
		//obj can hold only non static method and since main is static, object created will not hold main method
		
		  obj.test();
		  
		  int i = obj.pqr();//obj.pqr will be given 30
		  System.out.println("i value is :  "+ i);
		  
		  String S1 = obj.QA(); System.out.println("S1 value is  "+S1);
		 
	
	int div=	obj.division(3,5);
	System.out.println(div);
		
	}
//non static method
	
	  public void test() { //1. no input no output
	  System.out.println("test method");
	  
	  }
	 
	
	  public int pqr() {// 2. no input some output
	  System.out.println("PQR method"); int a=10; int b=20; int c=a+b;
	  System.out.println("value of C : "+ c); return c;
	  
	  }
	 
	
	
	  public String QA() {//2. no input some output
	  System.out.println("QA Method"); String s="Selenium"; return s;
	  
	  }
	 
	public int division(int x, int y) {//3.some input n we get an output
		System.out.println("Division Method");
		int d= x/y;
		return d;
	}
}


	
