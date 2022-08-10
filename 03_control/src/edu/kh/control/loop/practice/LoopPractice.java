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
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 하나 입력하세요 : ");
			
			int sum = 0;
			
			
			
		}
		public void practice4() {}
		public void practice5() {}
		public void practice6() {}
		public void practice7() {}
		public void practice8() {}
		public void practice9() {}
		public void practice10() {}
		public void practice11() {}
		public void practice12() {}
		public void practice13() {}
}