package OOPSConceptPart1;

public class Wrapperclassconcept {

	public static void main(String[] args) {
		
		
		String x ="100";
		System.out.println(x+20);
		//converting string to an integer
		int y= Integer.parseInt(x);
		System.out.println(y+20);
		
		//Integer, Double, Character, Boolean, 
		
		//converting string to an double
		String a= "12.33";
		
		double b = Double.parseDouble(a);
		System.out.println(b+10);
		
		//converting string to an char
		
		//String k = 'A';-----not available
		
		//converting string to an boolean
		String k = "true";
		boolean l =Boolean.parseBoolean(k);
		System.out.println(l);
		
		
		
		
		//int to string conversion
		
		int j=200;
		System.out.println(j+20);
		
	String c= 	String.valueOf(j);
		
		System.out.println(c+20);
		
		
		String u = "100A";
	int z= 	Integer.parseInt(u);
		System.out.println(y);// java.lang.NumberFormatException: For input string: "100A" 
		
		
		
		
		
		
		
		

	}

}
