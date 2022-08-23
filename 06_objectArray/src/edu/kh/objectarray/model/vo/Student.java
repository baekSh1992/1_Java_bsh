package edu.kh.objectarray.model.vo;

// 값 저장용 클래스(클래스 : 객체의 기능과 속성을 정리한 문서 -> 설계도)
// -> 객체로 만들어진 후 값을 저장하는 용도의 객체로 사용(데이터 관리)ㅉ
public class Student { // 학생 인적사항 클래스
	
	// 필드
	private int grade; 		// 학년
	private int classRoom;  // 반
	private int number;  	// 번호
	private String name;    // 번호
	
	private int kor;  		// 국어
	private int eng;  		// 영어
	private int math;  		// 수학
	
	
	// 기본 생성자
	public Student() { }
	
	// 매개변수 생성자 (오버로딩 적용)
	public Student(int grade,int classRoom, int number, String name) { 
		
		// this 참조변수
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
	}
	
	// 매개변수 생성자 (오버로딩 적용)
	public Student(int grade,int classRoom, int number, String name, 
			int kor, int eng, int math) { 
		
		// this 생성자
		this(grade, classRoom, number, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	
	
	
	// getter / setter
	public int getGrade() { // 외부에서 얻어가는 grade자료형이 int라서 int 사용
		return grade;
	}
	
	public void setGrade(int grade) { // 반환할게 없어서 void 사용
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// alt + (shift) + s || 상단 Source메뉴
	// -> r(Generate Gettets and Setters... 선택)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
