package edu.kh.control.condition.practice;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in); 

	public void practice1() { // 입력받은 정수가 양수이면서 짝수일때만 짝수입니다 출력
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
	
		if(input > 0) { // 양수 
			
		
			if(input % 2 == 0) { // 짝수
				System.out.println("짝수 입니다.");
			} else { // 홀수
				System.out.println("홀수 입니다.");
			}
			
			
		} else {
			System.out.println("양수만 입력해주세요");
		}
	
//		
//		String result;
//		
//		if(input <= 0) {
//			result = "양수만 입력해주세요.";
//		} else if (input % 2 == 0) {
//			result = "짝수 입니다.";
//		} else { 
//			result = "홀수 입니다.";
//		}
//		
//		System.out.println(result);
	}
	
	
	
	
	public void practice2() { // 과목 평균
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		// 합계를 저장하기 위한 변수
		int sum = kor + math + eng;
		
		// 평균을 저장하기 위한 변수
		double avg = sum / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			System.out.println("축하합니다. 합격입니다.");
		} else { // 불합격
		
			
			System.out.println("불합격입니다."); 
		}
	}
	public void practice3() { // 1~12사이 입력해서 해당 달의 일수 출력 (2월 윤달 생략)
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("1~12 사이 정수 입력 : ");
		int month = sc.nextInt();
		
		// 30일 : 4 6 9 11
		// 31일 : 1 3 5 7 8 10 12
		// 28일 : 2
		switch(month) { 
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
			
		case 4 : case 6 : case 9 : case 11 : 
			System.out.println(month + "월은 30일 까지 있습니다.");
			break;
			
		case 2 : 
			System.out.println(month + "월은 28일 까지 있습니다.");
			break;
			
		default : System.out.println(month + "월은 잘못 입력된 달 입니다.");
		}
		
	}
	
	public void practice4() {
//		키(m)를 입력해 주세요 : 1.65
//		몸무게(kg)를 입력해 주세요 : 58.4
//		BMI 지수 : 21.45087235996327
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
			
		} else if(bmi <23) {
			result = "정상체중";
			
		} else if(bmi <25) {
			result = "과체중";
			
		} else if(bmi <30) {
			result = "비만";
			
		} else {
			result = "고도비만";
			
		}
		System.out.println(result);
		
		
		
	}
	
//		중간 고사 점수 : 80
//		기말 고사 점수 : 30
//		과제 점수 : 60
//		출석 횟수 : 18
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		// 변수의 장점 : 재사용성
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextInt(); // int로 입력 받아도 대입 연산 시 double 자동 형변환
		
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextInt(); 
		
		System.out.print("과제 점수 : ");
		double report = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		
		// 각각의 점수를 비율에 맞게 변경 
		midTerm *= 0.2; //		midTerm = midTerm * 0.2; 
		finalTerm *= 0.2; //		finalTerm = finalTerm * 0.2;
		report *= 0.3;
//		attendance *= 0.3;
		
		System.out.println("============ 결과 =============");
		
		
		
		if(attendance <= 20 * (1 - 0.3) ) { // 14번 보다 적게 출석 했을 경우
			System.out.println("Fail [출석 횟수 부족](" + (int)attendance + "/20)");
			
		}else { // 출석만족
			
		System.out.printf("중간 고사 점수(20) : %.1f \n" , midTerm);
		System.out.printf("기말 고사 점수(30) : %.1f \n" , finalTerm);
		System.out.printf("과제 점수     (30) : %.1f \n" , report);
		System.out.printf("출석 점수     (20) : %.1f \n" , attendance);
		
		double sum = midTerm + finalTerm + report + attendance;
		
		System.out.printf("총점 : %.1f \n" , sum);
		
		if(sum >= 70.0) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail [점수 미달]");
		}
		}
			
	}
	
}