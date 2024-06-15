package prc;

import java.util.Scanner;

class DoIt_01_02 {
	 
	static int max(int a, int b, int c) {
		 int max = a;
		 if (b > max)
			 max = b;
		 if ( c > max)
			 max = c;
		 
		 return max; 
		 // 리턴값의 반환 : 호출자에게 전달 
		 /*
		  * 반환값이 없는 경우 : 메서드의 결과를 외부에서 사용 불가
		  *  + 매서드는 클래스 내부에 있어야함
		  */

	}
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		/*
		 *  main 영역에서 a, b, c 의 초기화 => 
		 */
		System.out.println("max( a, b, c ) = " + max(a, b, c)); 

	 }
}
