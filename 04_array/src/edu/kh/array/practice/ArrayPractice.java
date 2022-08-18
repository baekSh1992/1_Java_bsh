package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
		
			
		
	public void practice1() {
			
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25
		
		int[] arr = new int[9];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		 
		int sum = 0; 
		for(int i = 0; i < 9; i++) {
			System.out.print(arr[i]+ " ");
			
			if(i % 2 == 0)
			sum += arr[i];
			
		}
			System.out.println("\n짝수 번째 인덱스 합 : " + sum);
		}
	
	public void practice2() {

//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//		[실행 화면]
//		9 8 7 6 5 4 3 2 1
//		홀수 번째 인덱스 합 : 20
			
int[] arr = new int[9];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		 
		int sum = 0; 
		for(int i = 9; i >= arr.length-8; i--) {
			System.out.print(i + " ");
			
			if(i % 2 == 0)
			sum += i;
			
		}
			System.out.println("\n짝수 번째 인덱스 합 : " + sum);
		}
	
		
	public void practice3() {

//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		[실행 화면]
//		양의 정수 : 5
//		1 2 3 4 5
//
//		[실행 화면]
//		양의 정수 : 8
//		1 2 3 4 5 6 7 8	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
//		[실행 화면 1]   [실행 화면 2]
//		입력 0 : 5	  입력 0 : 5
//		입력 1 : 8	  입력 1 : 8
//		입력 2 : 9	  입력 2 : 9
//		입력 3 : 10	  입력 3 : 10
//		입력 4 : 4	  입력 4 : 4
//		검색할 값 : 8	  검색할 값 : 1
//		인덱스 : 1 	  일치하는 값이 존재하지 않습니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		boolean flag = true;
		for(int i=0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			int num = sc.nextInt();
			
			if() {
				
			
//			System.out.print("검색할 값 : ");
//			
//			
//			int search = sc.nextInt();
//			
//			if(arr[i] == search ) { // arr[i] 값이 입력 받은 값과 같다면
//				System.out.println("인덱스 : " + i);
//				
//				flag = false; // flag 값을 변경
//				break; // 중복 데이터가 없으면 추가 검색을 하지 않아도 됨 (break;를 쓰는 이유)
//			}
//			if(flag) {
//				System.out.println("일치하는 값이 존재하지 않습니다.");
//				
//			}
		}
	}
}