package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//static or compile time  polymorphism
		BMW obj = new BMW();
		obj.start();//both car and bmw has this method but preference is given for child class//method overriding
		obj.theftsafety();
		obj.stop();
		obj.refuel();
		obj.engine();
		
		System.out.println("===========");
		  Car C= new Car(); 
		  C.start(); 
		  C.stop(); 
		  C.refuel();
		  C.engine();
		  
	    System.out.println("===========");
	    
	    //top casting= child calss object refered by the parent class reference 
		 
       Car C1 =   new BMW();//child class object can be referred by the parent class reference variable---- dynamic polymorphism or run time poly
       C1.start();
       C1.refuel();
       C1.stop();
       //c1's theft safety method cannt be called-bcz bmw theftsafety cannot be called by parent class
       //by creatin gobject class referred by parent class, parent class method along with the child classes'over ridden methods can be called. 25mins video
       C1.engine();
       
       //Down casting- car class cannot be fit into BMW class
       
     //  BMQ b = new Car();
       
       //but by casting as seen below, we can do it
       
       BMW b = (BMW)new Car();///gives  java.lang.ClassCastException error. Downcasting not possible
       b.start();
       b.theftsafety();
       b.stop();
       b.refuel();
       b.engine(); 
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
