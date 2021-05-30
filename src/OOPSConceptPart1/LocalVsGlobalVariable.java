package OOPSConceptPart1;

public class LocalVsGlobalVariable {
	//global or class variables
	String name = "Tom";
	int age = 25;
	

	public static void main(String[] args) {
		
		int i = 10;//local variable
		System.out.println(i);
		LocalVsGlobalVariable obj= new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	
	public void sum () {
		int i = 10;//local varibale
		int j = 20;//local varibale
		int age = 25;//local varibale
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
