package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//array is used to store similar data type values
		// one dimensional array
		
		//disadvantages= 
		//1. size is fixed===static array---To overcome this, we use collection(dynamic collections) 
		
		//2. stores only similar data type values ==To overcome this, we use object array 
		
		//1. int array
		
		int i[] = new int[4];
		i[0]=2;
		i[1]=3;
		i[2]=7;
		i[3]=10;
		
		System.out.println(i[2]);
		//System.out.println(i[4]);///ArrayindexOutOfBoundsException
		System.out.println("Size of array i: "+i.length);
		
		System.out.println("==================");
		
		for (int k=0; k<4; k++) {
			
			System.out.println(i[k]);
		}
				
	System.out.println("===========================");	
		//2. double array
		
		double d[] = new double[4];
		d[0] = 2.22;
		d[1] = 3.42;
		d[3] = 4.87;
            for (int k=0; k<d.length; k++) {
			
			System.out.println(d[k]);
		}
            
            
            System.out.println("=================================");
            
            //3. char array
            
            
            char c[] = new char[5];
            c[1] = 'a';
            c[2] = 'b';
            c[3] = 'c';
            c[0] =  'z';
            
            
            for (int L=0; L<d.length; L++) {
    			
    			System.out.println(c[L]);
    		}
            
            System.out.println("value of c:  " +  c[0]);
		
            System.out.println("=================================");
		
		// 4. Boolean array
            
            boolean b[] = new boolean [3];
            b[0] = true;
            b[1] = false;
            
            System.out.println("value of b1 is " + b[0]);
            System.out.println("value of b1 is " + b[1]);	
            
            System.out.println("================================="); 
            
            //5. String array
            
            
            String S[] = new String[5];
            S[1] = "true";
            S[2] = "3";
            S[0] = "Alphabet";
            S[3] =  "23.33666";
            
            System.out.println("Array length of S the String is " + S.length);
            
 for (int T=0; T<S.length; T++) {
    			
    			System.out.println(S[T]);
    		}
 
 System.out.println("=================================");
 
 // 6. Object Array- is superclass available in JAVA==is used to store diff data type values
 
Object O[] = new Object[4];
O[1] = "system";
O[3] = true;
O[2] = 22.33;

System.out.println("First vlaue is " + O[2]);


System.out.println("Fourth  vlaue is " + O[3]);
 	
 
            
		
		
		
		
		
		
		
		
		
		

	}

}
