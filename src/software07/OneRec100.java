package software07;

public class OneRec100 {
	/* 클래스의 배열 2021-04-28 kopo03 김도연 */
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public OneRec100(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
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
}