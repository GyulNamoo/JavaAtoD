package prc;

import java.util.Scanner;

class DoIt_1C_1 {
	static int med3 (int a, int b, int c) {
		if ( b <= a ) { 
			if ( a <= c) 
				return a;
			else if ( b >= c) // a > c && a >= b      
				return b;
			else
				return c; 
			}
		// b > a  
		else {
			if ( b <= c )
		
			return b;
		else if ( a >= c)  // b>a && b>c
			return a;
		else
			return c;   
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("mid = " + med3(a , b, c));
		
	
	}
}
