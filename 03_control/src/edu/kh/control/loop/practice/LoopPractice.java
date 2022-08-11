package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	
		public void practice1() {
			Scanner sc = new Scanner(System.in);
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input < 1 ) {
				System.out.println("1 이상의 숫자를 입력해주세요.");

			}else {
				
				for(int i = 1; i <= input; i++) {
					System.out.print(i + " ");
				}
				
			}
			
		}
			
		
		
		public void practice2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input < 1 ) {
				System.out.println("1 이상의 숫자를 입력해주세요.");

			}else {
				
				for(int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
			}
			
		}
		public void practice3() {
			
			
			
		}
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//
//		ex.
//		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
//		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
//		4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
		public void practice4() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 <1) { // num1, num2 중에 0이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else { // 둘다 1미만이 아니다
			if(num1 < num2)
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			} else { // 둘다 1미만이 아니다
				
				if(num1 > num2)
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
			}
		}
		// int temp = 임시로 변수 저장
			
			
		}
		public void practice5() {}
		
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
//
//		숫자 : 4 숫자 : 10
//		===== 4단 ===== 2~9 사이 숫자만 입력해주세요.
//		===== 5단 =====
//		===== 6단 =====
//		===== 7단 =====
//		===== 8단 =====
//		===== 9단 =====
//		(해당 단의 내용들은 길이 상 생략)
		public void practice6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자 : ");
			int num = sc.nextInt();
			
			if( num >= 2 && num <= 9) {
				
				for(int dan = num; dan <= 9; dan++) {
				
					System.out.println("===== " + dan + "단 =====");
					
					for(int i =1; i <= 9; i++) {
						System.out.printf("%d X %d = %2d \n", dan, i,dan*i);
					}
					
					System.out.println(); // 사이 줄바꿈
				}
				
				
			} else {
				System.out.println("2~9사이의 숫자만 입력해주세요");
			}
			
			
			
			
			
			
			
		}
		
		
		public void practice7() {}
		public void practice8() {}

		
		
				
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		public void practice9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row= 1; row <= input; row++) {

				for(int i = input-row; i >= 1; i--) {
					//		input-1; i >= row;
					System.out.print(" "); // 이 구문이 있냐 없냐에 따라 별 공백 방향 바뀜
			}
				
				
				
				
				for(int col = 1; col <= row; col++) {
					System.out.print("*");
				}
					System.out.println(); // 줄바꿈
			}
			
		}
		
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*
		public void practice10() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			// 위쪽 삼각형
			for(int row = 1; row <= input; row++) {
				
				for(int col=1; col <= row; col++) {
					
					System.out.print("*");
				}
				System.out.println(); // 줄바꿈
			}
			
			// 아래쪽 삼각형
			
			for(int row = input -1; row >= 1; row--) {
				
				for(int col=1; col <= row; col++) {
					
					System.out.print("*");
				}
				System.out.println(); // 줄바꿈
			}
				
				
		}
		
		
//		다음과 같은 실행 예제를 구현하세요.
//		
//		ex.
//		정수 입력 : 4
//		   *
//		  ***
//		 *****
//		*******
		
		public void practice11() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row= 1; row <= input; row++) {

				for(int i = input-row; i >= 1; i--) {
					//		input-1; i >= row;
					System.out.print(" "); // 이 구문이 있냐 없냐에 따라 별 공백 방향 바뀜
			}
				
				
				
				
				for(int col = 1; col <= row*2-1; col++) {
					System.out.print("*");
				}
					System.out.println(); // 줄바꿈
			}
			
		}
		
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 5
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		public void practice12() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row = 1; row <= input; row++) {
				
				for(int col = 1; col <= input; col++) {
					
					// 첫 번째, 마지막 줄, 칸일 때만 * 출력
					if(row == 1 || row == input || col == 1 || col == input ) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		
//		
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
//
//		ex.
//		자연수 하나를 입력하세요 : 15
//		2 3 4 6 8 9 10 12 14 15
//		count : 2		
		public void practice13() {
			Scanner sc= new Scanner(System.in);
			
			System.out.print("자연수 하나를 입력하세요 : ");
			int input = sc.nextInt();
			System.out.println(); // 줄바꿈
			
			int count = 0;
			
			for(int i = 1; i <= input; i++) {
				
				// 2의 배수 또는 3의 배수인 경우 출력
				if(i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
					
					// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
					if(i % 2 == 0 && i % 3 == 0) {
						count++; // count 증가
						
					}
				}		
			}
			System.out.println("\ncount : " + count);
		}
		
		
		
		
		
		
	
}