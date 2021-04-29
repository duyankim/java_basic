package software07;

public class OneRec {

	/* 클래스의 배열 2021-04-28 kopo03 김도연 */
	private String k03_name;										// 이름을 넣을 private 변수 선언
	private int k03_student_id;										// 학번을 넣을 private 변수 선언
	private int k03_kor;											// 국어 점수를 넣을 private 변수 선언
	private int k03_eng;											// 영어 점수를 넣을 private 변수 선언
	private int k03_mat;											// 수학 점수를 넣을 private 변수 선언

	public OneRec(int k03_student_id, String k03_name, int k03_kor, int k03_eng, int k03_mat) {
		this.k03_student_id = k03_student_id;
		this.k03_name = k03_name;									// 메인에서 값을 받는 생성자
		this.k03_kor = k03_kor;										// 이름, 국어점수, 영어점수, 수학점수를
		this.k03_eng = k03_eng;										// 필수로 받아서 객체를 부를 때
		this.k03_mat = k03_mat;										// 해당 데이터로 인스턴스를 생성한다
	}

	public String name() {											// 이름을 리턴하는 메소드
		return this.k03_name;
	}
	
	public int studentId() {										// 학번을 리턴하는 메소드
		return this.k03_student_id;
	}
	
	public int kor() {												// 국어점수를 리턴하는 메소드
		return this.k03_kor;
	}
	
	public int eng() {												// 영어점수를 리턴하는 메소드
		return this.k03_eng;
	}
	
	public int mat() {												// 수학점수를 리턴하는 메소드
		return this.k03_mat;
	}
	
	public int sum() {												// 점수 합계를 리턴하는 메소드
		return this.k03_kor + this.k03_eng + this.k03_mat;			// 점수 합계는 따로 변수를 선언하지 않음
	}

	public double ave() {											// 합계 메소드를 불러서 바로 평균 계산
		return this.sum() / 3.0;
	}

}
