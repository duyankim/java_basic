package software07;

public class OneRec2 {
	/* 클래스의 ArrayList 2021-04-28 kopo03 김도연 */
	private int student_id;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public OneRec2(int student_id, String name, int kor, int eng, int mat) {
		this.student_id = student_id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int student_id() {
		return this.student_id;
	}
	
	public String name() {
		return this.name;
	}
	
	public int kor() {
		return this.kor;
	}
	
	public int eng() {
		return this.eng;
	}
	
	public int mat() {
		return this.mat;
	}
	
	public int sum() {
		return this.kor + this.eng + this.mat;
	}
	
	public double ave() {
		return this.sum() / 3.0;
	}
	// 메인부
	
	dataSet();
	HeaderPrint();
	for (int i = 0; i < arrayOneRec.size(); i++) {
		ItemPrint(i);
	}
	TailPrint;
}