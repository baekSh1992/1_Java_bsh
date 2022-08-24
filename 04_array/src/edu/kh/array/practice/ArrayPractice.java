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
	
		int[]arr=new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
			sum+=arr[i];
			
		}
	}
		System.out.println("\n짝수 번째 입덱스 합 : " + sum);
		
		
		
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
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
					
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
			System.out.println("\n홀수 번째 인덱스 합 : " + sum);
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
		int[] arr = new int[sc.nextInt()];
		
				
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
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
		
		for(int i=0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
			
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i]==search){
				System.out.println("인덱스 : " + i);
				flag = false;
				break;
			}
		}
			if(flag) System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	public void practice5() {
//		문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
//		검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
//		[실행 화면]
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i =0; i<arr.length; i++) {
				arr[i]=str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int  count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ch) {
				System.out.print(i + " ");
				
				count++;
			}
		}
		System.out.println();
		
		System.out.println(ch + "개수 : " + count);
		
	}
	
	
		public void practice6() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//		[실행 화면]
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
			
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
		 System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println(); // 줄바꿈
		System.out.println("총 합 : " + sum);
	}
		
		public void practice7() {
//		주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//		단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
//
//		[실행 화면]
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******

		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i=0; i<arr.length; i++) {
			if(i<=7) { // 7번 인덱스 이하 (생년월일, - , 성별)
				arr[i] = input.charAt(i);
			} else { // 8번 인덱스 이상부터는
				arr[i]='*';
			}
			System.out.print(arr[i]);
		}
	}
		
		public void practice8() {
//		3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
//
//		[실행 화면]
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
			
		Scanner sc = new Scanner(System.in);
		while(true) { // 3이상의 수가 입력 될 때까지 무한 반복
			// -> 3 이상이 입력되면 break;문으로 종료
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input % 2 == 0) { // 3미만 또는 짝수인 경우 -> 반복
				System.out.println("다시 입력하세요.");
				
			} else {
				// 입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];
				
				int num = 0; // arr 배열에 대입될 값
				
				for(int i=0; i< arr.length; i++) {
					if(i <= arr.length /2) { // 중간 이전까지 -> 증가
						arr[i] = ++num;
						
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}
					
					// 출력 시, 추가 (단, 마지막 제외)
					if (i == arr.length -1) { // 마지막바퀴
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}
				}
				break; // while 반복 멈춤
			}
		}
	}
		
		public void practice9() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//
//		[실행 화면]
//		발생한 난수 : 9 7 6 2 5 10 7 2 9 6
			
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
			
		System.out.print("발생한 난수 : ");	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		public void practice10() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//		[실행 화면]
//		발생한 난수 : 5 3 2 7 4 8 6 10 9 10
//		최대값 : 10
//		최소값 : 2	
			
	// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당 
		int[] arr = new int[10];
		
	// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // 개행
		
		// 3. 반복문을 통한 최대값 최소값 알아내기
		int max = 1; // 최소값을 담아줄 변수
		int min = 10; // 최대값을 담아줄 변수
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) { // 해당 인덱스의 값이 max보다 큰 경우
				max = arr[i]; // 해당 값을 max변수에 담아줌
			}
			
			if(arr[i] < min) { // 해당 인덱스의 값이 min보다 작은 경우
				min = arr[i]; // 해당 값을 min 변수에 담아줌
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		}
		
		public void practice11() {
//			10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//
//			[실행 화면]
//			4 1 3 6 9 5 8 10 7 2	
			
		int[] arr = new int[10];
			
		// 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()* 10 + 1);
			
			for(int x=0; x<i; x++) { // 중복 제거
				if(arr[i] == arr[x]) {
					i --;
					break;
				}
			}
		}
			// 3. 출력
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " "); 
			}
		}
		
		public void practice12() {
//			로또 번호 자동 생성기 프로그램을 만들기.
//			(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
//
//			[실행 화면]
//			3 4 15 17 28 40
			
//		1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
//		2. 배열에 중복값 없이 1부터 45 사이의 난수 초기화
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 +1 );
			
			for( int x = 1; x < i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		
//		3. 오름차순 정렬 (선택정렬)
		for(int i=0; i<lotto.length; i++) { // 비교주체
			for(int x=i+1; x<lotto.length; x++) { // 비교 대상
				if(lotto[i] > lotto[x]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

					int temp = lotto[i];
					lotto[i] = lotto[x];
					lotto[x] = temp;	
				}
			}
		}
		
//		4. 출력
		for(int i=0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
		
		public void practice13() {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	