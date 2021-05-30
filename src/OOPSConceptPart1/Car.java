package OOPSConceptPart1;

public class Car {
	
	 int mod;
	int wheel;
	//new Car() is the object of Car class
// new keyword is used to create the object
	// a,b,c is the obejct reference 
	public static void main(String[] args) {

	Car a =	new Car(); // new Car() is the object of Car class and a,b,c  is the reference of this object
	Car b = new Car();
	Car c = new Car();
	
	a.mod= 2018;
	a.wheel =4;
	
	b.mod = 2016;
	b.wheel = 4;
	
	c.mod =  2019;
	c.wheel = 4;
	
	System.out.println(" before assigning the references");
	
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	System.out.println(b.mod);
	System.out.println(b.wheel);
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	System.out.println("after shifting references");//object a will hv no reference
	a=b;
	b=c;
	c=a;
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	System.out.println(b.mod);
	System.out.println(b.wheel);
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	a.mod=10;
	System.out.println("a mod:  " + a.mod);//a=10;
	c.mod=20;
	System.out.println("a mod :  "+ a.mod);//c overwrites on object pointed by a, so a=20
	System.out.println("c mod :  "+ c.mod);//20
	
	
	
	
		

	}

}
