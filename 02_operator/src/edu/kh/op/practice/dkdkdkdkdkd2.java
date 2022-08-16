package edu.kh.op.practice;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class dkdkdkdkdkd2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("사는곳 : ");
			String area = sc.next();
			
			System.out.print("나 이 : ");
			int age = sc.nextInt();
			
			System.out.print(" : ");
			double lovepower = sc.nextDouble();
			
 			System.out.print(" : ");
 			String exp = sc.next();
 						
			System.out.printf("%s에 사는 %d살 %s에 대한 는 %.4f이고, 은 %s 입니다." , area, age, name, lovepower, exp);
			
		
		}
}
