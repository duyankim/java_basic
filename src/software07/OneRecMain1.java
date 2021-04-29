package software07;

public class OneRecMain1 {

	public static void main(String[] args) {
		/* 클래스의 배열 2021-04-28 kopo03 김도연 */
		int k03_Person = 5;									// 배열 크기를 설정한다
		OneRec[] k03_inData = new OneRec[k03_Person];		// 각 칸의 내용물이 OneRec클래스인
		k03_inData[0] = new OneRec("홍길01", 100, 100, 90);	// 배열을 선언하고
		k03_inData[1] = new OneRec("홍길02", 90, 90, 90);	// 각 배열의 인덱스에
		k03_inData[2] = new OneRec("홍길03", 80, 70, 90);	// 새로 생성한 인스턴스를 넣어준다
		k03_inData[3] = new OneRec("홍길04", 700, 60, 90);	// 인자로 전달한 값들은
		k03_inData[4] = new OneRec("홍길05", 60, 100, 90);	// 생성자에서 기본 값으로 설정된다.
	}

}
