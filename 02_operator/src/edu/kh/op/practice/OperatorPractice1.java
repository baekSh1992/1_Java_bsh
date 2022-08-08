package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 29;
		int b = 100;
		
		System.out.print("인원 수 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 갯수 입력 : ");
		int input2 = sc.nextInt();
		
		
		
		System.out.println("1인당 사탕 갯수 : " + b/a);
		System.out.println("남은 사탕 갯수 : " + b%a);
		
		
	}
}
