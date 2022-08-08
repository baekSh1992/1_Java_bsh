package edu.kh.op.ex;

public class OperatorExample3 {
		public static void main(String[] args) {
			
			// 비교 연산자(관계 연산자) : ==, !=, >, <, >=, <=
			
 			// 두 개의 피연산자의 크기를 비교하는 연산자
			// 결과는 항상 논리값 (true/false)
			// 복합 기호에서 '=' 기호가 항상 오른쪽

			
			
			int a = 10;
			int b = 20;
			
			
			System.out.println( a == b ); // false
			System.out.println( a != b);  // true
			System.out.println( a < b);   // true
			System.out.println( (a < b) != false ); // true
							//     t	!=    f     // t 
			
			System.out.println("=====================");
			
			System.out.println();
			
			System.out.println( 222 % 2 == 0);
			
			System.out.println("463984 는 짝수 인가? " + (463984 % 2 == 0) );
			System.out.println("463984 는 짝수 인가? " + (463984 % 2 != 0) );

			
			
			System.out.println("463984 는 3의 배수 인가? " + (463984 % 3 == 0) );
			System.out.println("463984 는 4의 배수 인가? " + (463984 % 4 == 0) );
			System.out.println("463984 는 5의 배수 인가? " + (463984 % 5 == 0) );
			
			
			
		}
}
