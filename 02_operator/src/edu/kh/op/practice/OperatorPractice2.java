package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int level = 3;
		int classs = 4;
		int num = 15;
		char gender = '남';
		double score = 85.75;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("이름 : ");
		String name1 = sc.next();
		
		System.out.print("학년 : ");
		int input1 = sc.nextInt();
		
		System.out.print("반 : ");
		int input2 = sc.nextInt();
		
		System.out.print("번호 : ");
		int input3 = sc.nextInt();
		
		System.out.print("성별 : ");
		String input4 = sc.next();
		
		System.out.print("성적 : ");
		double input5 = sc.nextInt();
		
		
		
		// 3학년 4반 15번 홍길동 남학생의 성적은 85.75점 입니다.
		System.out.println( input1 + "학년 " + input2 + "반 " + input3 + "번 " + name1 + " " + input4 + "학생의 성적은 "
		+ input5 + "점 입니다.");
		System.out.printf( "%d학년 %d반 %d번 %s %c학생의 성적은 %.2fcm 입니다." , level, classs, num, name1, gender, score);
		
	}
}
