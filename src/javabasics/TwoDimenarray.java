package javabasics;

public class TwoDimenarray {

	public static void main(String[] args) {
		
		int i[][] = new int[3][4];
		i[1][0] = 12 ;
		
		i[2] [3] =14;
		
		System.out.println("Row length " + i.length);
		System.out.println("Column length is "+ i[0].length);
		
		for (int L=0; L< i.length; L++) {
			for (int M=0; M<i [1].length; M++) {
				System.out.println("Value of Row and column is "+ i[L][M]);
				
			}
			System.out.println("======================================");
		}
		

	}

}
