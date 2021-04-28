package software06;

public class ReportSheet {

	public static void main(String[] args) {
		/* 클래스 만들기 2021-04-27 kopo03 김도연 */

		int k03_person = 10;										// 이 값을 주는만큼 저장소 생성
		InputData inData = new InputData(k03_person);				// 생성자에 숫자를 준 만큼 배열을 만든다.
		
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {			// 인원수만큼 배열을 돌면서 배열을 채워줌
			String name = String.format("홍길%02d", k03_i);			// 이름 만들기
			int k03_kor = (int)(Math.random() * 100);				// 국어점수 만들기
			int k03_eng = (int) (Math.random() * 100);				// 영어점수 만들기
			int k03_mat = (int) (Math.random() * 100); 				// 수학점수 만들기
			inData.SetData(k03_i, name, k03_kor, k03_eng, k03_mat); // 클래스 내 값 입력
		}

		for (int k03_i = 0; k03_i < k03_person; k03_i++) {			// 인원수만큼 배열을 돈다
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d 평균:%f\n", 	// 만든 데이터를 프린트함
					k03_i, inData.k03_name[k03_i], inData.k03_kor[k03_i], inData.k03_eng[k03_i], 
					inData.k03_mat[k03_i], inData.k03_sum[k03_i],inData.k03_ave[k03_i]);
		}
	}
}
