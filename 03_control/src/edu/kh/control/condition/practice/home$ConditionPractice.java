package edu.kh.control.condition.practice;

import java.util.Scanner;

public class home$ConditionPractice {
	static Scanner sc = new Scanner(System.in); 
		public static void main(String[] args) { // 입력받은 정수가 양수이면서 짝수일때만 짝수입니다 출력
			
			
			// 과제 1
//		
//			System.out.print("숫자를 한 개 입력해주세요. : ");
//			int input = sc.nextInt();
//			
//			if(input > 0) {
//				
//				if(input % 2 == 0) {
//					System.out.println("짝수 입니다.");
//				} else {
//					System.out.println("홀수 입니다.");
//				}
//				} else {
//					System.out.println("양수만 입력해주세요");
//				}
//			}
//		
		
		
			// 과제 2 
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum / 3.0;
			
			if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) {
			System.out.println("국어 점수 : " + kor);
			System.out.println("수학 점수 : " + math);
			System.out.println("영어 점수 : " + eng);
			System.out.println("합계 점수 : " + sum);
			System.out.println("평균 점수 : " + avg);
			System.out.println("축하합니다. 합격입니다^^");
			
		} else { 
			System.out.println("좀 더 분발하세요!");
		}
		}
}	
		

			
		
