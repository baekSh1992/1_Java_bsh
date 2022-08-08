package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 삼항 연산자 :      조건식      ?  true인 경우    : false인 경우
		String result = (input % 2 == 0)  ?  "양수 입니다." : "음수 입니다." ;
		System.out.println(result);
		
		
		String result2 = (input / 0 == 0)  ?  "0 입니다." : "0 입니다." ;
		System.out.println(result2);
		
		
	}
}
