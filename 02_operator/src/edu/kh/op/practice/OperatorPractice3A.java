package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
				
		// 양수 / 음수 / 0
		String result = input == 0 ? "0" : input < 0 ? "음수" : "양수";
		
		String result2 = input > 0 ? "양수" : input < 0 ? "음수" : "0";
		
		String result3 = input < 0 ? "음수" : input > 0 ? "양수" : "0";
		
		
		System.out.println(result + "입니다.");
		
	}
}
