package OOPSConceptPart1;

public class CallByValandCallByRef {
    int p;
    int q;
    
	public static void main(String[] args) {
		
		CallByValandCallByRef obj = new CallByValandCallByRef();
	    int d= 	obj.testsum(10,20);
	    System.out.println("Value of sum is:  "+ d);
		
		int x = 100;
		int y = 200;
		int e= 	obj.testsum(x,y);//call by value or pass by value
		System.out.println("Value of 2nd sum is:  "+ e);
		
		
		obj.p= 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println("Value of p" + obj.p);
		System.out.println("Value of q" + obj.q);
	}
	
	//call by value 
	public int testsum(int a, int b) {//Photocopy value of x and y is passed here but inside the method a and b is assigned a diff value 
		a=50;                        //so original value of x and y wont be changed 
		b =50;
		
		int c=a+b;
		return c;
		
	}
	
	
	//============================================================================================
	
	//call by reference
	
	public void swap(CallByValandCallByRef t ) {
		int temp;
		temp = t.p;//temp=50;
		t.p=t.q; //p=60
		t.q= temp;//q=50
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
