package edu.kh.oop.basic;

public class BasicRun {
	
		public static void main(String[]args){
			
			BSH 백승훈 = new BSH();
			// heap 영역에 BSH 클래스에 정의된 내용을 이용하여
			// BDH 객체 생성(할당)
			
			// 객체가 가지고 있는 속성 출력
			System.err.println("이름 : " + 백승훈.name);
			System.out.println("나이 : " + 백승훈.age);
			System.out.println("생년월일 : " + 백승훈.birthday);
			
//			System.out.println("비밀번호 : " + 백승훈.Password);

			// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
			백승훈.showPassword();
			
			// 기능 수행
			백승훈.eat();
			백승훈.studt();
			백승훈.plus(50, 100);
		}
}
