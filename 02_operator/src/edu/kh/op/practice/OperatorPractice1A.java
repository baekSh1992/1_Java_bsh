package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1A {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("인원 수 : ");
	int people = sc.nextInt();

	System.out.print("사탕 개수 : ");
	int input = sc.nextInt();
	
	System.out.println("1인당 사탕 갯수 : " + (input / people));
	System.out.println("남은 사탕 갯수 : " + (input % people));

	}
}