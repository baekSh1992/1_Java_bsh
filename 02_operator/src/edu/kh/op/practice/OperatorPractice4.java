package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		
//	System.out.println("국어 : ");
//	int kor = sc.nextInt();
//	
//	System.out.println("영어 : ");
//	int eng = sc.nextInt();
//	
//	System.out.println("수학 : ");
//	int math = sc.nextInt();
//	
//	// 합계를 저장하기 위한 변수
//	int sum = kor + eng + math;
//	
//	// 평균을 저장하기 위한 변수
//	double avg = sum / 3.0;
//	
//	System.out.println("합계 : " + sum );
//	System.out.println("평균 : " + avg );
//	
//	String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" :"불합격";
//	
//	System.out.println(result);
//	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어 점수 : ");
	int kor = sc.nextInt();
	
	System.out.print("수학 점수 : ");
	int math = sc.nextInt();
	
	System.out.print("영어 점수 : ");
	int eng = sc.nextInt();
	
	int sum = kor + math + eng;
	int avg = sum/3;
	
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + avg);

	String result = kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ? "합격" : "불합격";
	System.out.println(result + " 입니다.");
	
	}
}
