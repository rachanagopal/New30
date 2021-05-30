package OOPSConceptPart2;

public class BMW extends Car{//has a relationship
	//when same methods with same name and same no of arguments is present both in parent and child class, child class is given preference
	//this is called Method overriding
	
	
	public void start() {//over-ridden method		
		System.out.println("BMW class---start method");
	}
	
	public void  theftsafety() {
		System.out.println("BMW class----theftsafety method");
	}

}
