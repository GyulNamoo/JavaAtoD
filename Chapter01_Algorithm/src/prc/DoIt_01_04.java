package prc;

import java.util.Scanner;

class DoIt_01_04 {

	static int mid(int a, int b, int c)
	{
		if ( a >= b) // b <= a  
		{
			if (a <= c) 
				return a;
			else if ( b <= c) // c < a 
				return c;
			else
				return b;			
		}
		else {
			if ( c <= a ) {// && a < b
				return a;
			}
			else if ( c <= b ) // a < c
				return c; 
			else
				return b;
			}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a, b, c MID = " + mid(a, b, c));
	}
}


