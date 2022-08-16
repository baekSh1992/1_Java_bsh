package edu.kh.array.ex;

import java.util.Scanner;

public class adadadad {
		public static void main(String[] args) {
			{


		// home_ex1
			// 백승훈님은 31세 남성, 키는 176.5입니다. (true)
//			String name = "백승훈";
//			int age = 31;
//			char gender = '남';
//			double height = 176.5;
//			boolean tf = true;
//			System.out.print(name + "님은 " + age + "세 " + gender + "성, " + "키는 " +
//										height + "입니다. ("+ tf +")\n");
//			
//			System.out.printf("%s님은 %s세 %c성, 키는 %.1f 입니다. (%b)", 
//					name, age, gender, height, tf );
		
				}
		
		// home_ex2
			// 입력 받은 두 정수의 합 구하기
//			Scanner sc = new Scanner(System.in);
//			
//				System.out.println("입력 받은 두 정수의 합");
//				System.out.print("입력 정수 1 : ");
//				int input1 = sc.nextInt();
//				
//				System.out.print("입력 정수 2 : ");
//				int input2 = sc.nextInt();
//				
//				System.out.printf("%d + %d = %d" , input1, input2, input1 + input2);
//				
//				System.out.println("입력 받은 두 실수의 합");
//				System.out.print("실수 입력 1 : ");
//				double input3 = sc.nextDouble();
//				
//				System.out.print("실수 입력 2 :");
//				double input4 = sc.nextDouble();
//				
//				System.out.printf("%.1f + %.1f = %.1f\n",input3, input4, input3+input4);
//				
//				System.out.print("이름을 입력 해주세요! : ");
//				String name = sc.next();
//				
//				
//				System.out.println(name + "아 공부 열심히 해라");
				
				

		// home_ex3 연산자
//			System.out.println("두 정수를 입력 받아 산술 연산 결과 출력하기");
//			
//			Scanner sc =  new Scanner(System.in);
//			
//			System.out.print("정수 입력 1 : ");
//			int input1 = sc.nextInt();
//			
//			System.out.print("정수 입력 2 : ");
//			int input2 = sc.nextInt();
//			// +
//			System.out.println(input1+"+"+input2 + "=" + (input1+input2));
//			// -
//			System.out.printf("%d-%d=%d\n",input1, input2,input1-input2);
//			// *
//			System.out.printf("%d*%d=%d \n",input1, input2,input1*input2);
//			// % 나머지 연산자는 하나가 아니라 %%두개를 입력해야 연산으로 인식
//			System.out.printf("%d %% %d=%d\n",input1, input2,input1%input2);
			
			
		// home_ex4 연산자 실습문제1 사탕나누기
//			Scanner sc =  new Scanner(System.in);
//			System.out.print("사탕 갯수 : ");
//			int input = sc.nextInt();
//			
//			System.out.print(" 인원 수 : ");
//			int people = sc.nextInt();
//			
//			System.out.println("1인당 사탕 갯수 : " + (input/people));
//			System.out.println("나눠주고 남은 사탕 갯수 : " + (input%people));
//		
			
			// home_ex5 연산자 실습문제2 인적사항
//			Scanner sc = new Scanner(System.in);
//			System.out.print("이름 : ");
//			String name = sc.next();
//			
//			System.out.print("학년 : ");
//			int grade = sc.nextInt();
//			
//			System.out.print("반 : ");
//			int classs = sc.nextInt();
//			
//			System.out.print("번호 : ");
//			int number = sc.nextInt();
//			
//			System.out.print("성별 : ");
//			String gender = sc.next();
//			
//			System.out.print("성적 : ");
//			double score = sc.nextDouble();
//			
//			System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f점 입니다."
//					, grade, classs, number, name, gender, score);
			
			
			// home_ex6 연산자 실습문제3 합계 평균
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("국어 점수 : ");
//			int kor = sc.nextInt();
//			
//			System.out.print("영어 점수 : ");			
//			int eng = sc.nextInt();
//
//			System.out.print("수학 점수 : ");
//			int math = sc.nextInt();
//			
//			int sum = kor + eng + math;
//			double avg = sum/3;
//			
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + avg);
//			String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격 입니다." : "불합격 입니다.";
//			System.out.println(result);
//			
			
			// home_ex7 조건문 실습문제1 연령 구분
//			Scanner sc = new Scanner(System.in);
//			System.out.print("나이를 입력 해주세요 : ");
//			int input = sc.nextInt();
//			
//			String result;
//			
//			if(input <= 13 && input > 5) {
//				result = "어린이";
//				
//			} else if(input > 13 && input <= 19 ) {
//				result = "청소년";
//						
//			} else if(input <= 5) {
//				result = "유아";
//
//			} else if(input >= 70) {
//				result = "노인";
//				
//			} else {
//				result = "성인";
//			}
//			System.out.println(result);
			
			
			// home_ex8 조건문 실습문제2 놀이기구 탑승 제한
//			Scanner sc = new Scanner(System.in);
//			System.out.print("나이를 입력 해주세요 : ");
//			int age = sc.nextInt();
//		
//			System.out.print("키 를 입력 해주세요 : ");
//			double height = sc.nextDouble();
//		
//			String result;
//			
//			if(age <= 0 || age >= 100) {
//				result = "잘못 입력 하셨습니다.";
//				
//			} else if (age < 12){ 
//					result = "적정 연령이 아닙니다.";
//					
//			}else if(height < 140.0){
//					result = "적정 키가 아닙니다.";
//						
//			} else {
//						result = "탑승 가능";
//			}
//					System.out.print(result);
		

		// home_ex9 Switch문 실습문제1 메뉴 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("김밥3000 / 라면 4000 / 샌드위치 5000 / 짬뽕 9000");
//		System.out.print("메뉴 입력 : ");
//		String input = sc.next();
//		
//		int result;
//		switch(input){
//		case "김밥" : result = 3000; break;
//		case "라면" : result = 4000; break;
//		case "샌드위치" : result = 5000; break;
//		case "짬뽕" : result = 9000; break;
//		default : result = -1; break;
//		}
//		if(result == -1) {
//			System.out.println("잘못 입력하셨습니다.");
//			
//		} else {
//			System.out.printf("%s은/는 %d원 입니다." , input, result );
//		}
//			
			
			// home_ex9 Switch문 실습문제
	
			
		}	
}	


			