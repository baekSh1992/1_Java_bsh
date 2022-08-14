package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 삼항 연산자 :      조건식      ?  true인 경우    : false인 경우
		String result = (input  >  0)  ?  "양수" : (input < 0) ? "음수" : "0"; // < 중첩 삼항 연산자
		System.out.println(result + "입니다.");
		
		
		
		
		
	}
}
