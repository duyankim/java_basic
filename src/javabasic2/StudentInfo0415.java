package javabasic2;

public class StudentInfo0415 {
	private String name;
	private int id;
	private int birth;
	private double score;

	public String address;
	public char bloodType;

	// name getter, setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// id getter, setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// birth getter, setter
	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	// score getter, setter
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		/* setter에서 조건을 만들면 외부에서 잘못 들어오는 데이터를 차단할 수 있다.
		 * 성적에 조건 범위를 만들어서 범위를 넘는 데이터는 들어오지 못한다.
		 */
		if (score > 5) {
			score = 0;
		} else {
			this.score = score;
		}
	}
}
