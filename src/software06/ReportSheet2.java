package software06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet2 {

	public static void main(String[] args) {
		/* 성적집계표 출력 2021-04-27 kopo03 김도연 */
		int k03_person = 20;																				// 이 값을 주는만큼 저장소 생성
		InputData2 inData = new InputData2(k03_person);														// 생성자에 숫자를 준 만큼 배열을 만든다.
		
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {													// 인원수만큼 배열을 돌면서 배열을 채워줌
			String name = String.format("홍길%02d", k03_i+1);												// 이름 만들기
			int k03_kor = (int)(Math.random() * 100);														// 국어점수 만들기
			int k03_eng = (int) (Math.random() * 100);														// 영어점수 만들기
			int k03_mat = (int) (Math.random() * 100); 														// 수학점수 만들기
			inData.SetData(k03_i, name, k03_kor, k03_eng, k03_mat); 										// 클래스 내 값 입력
		}
		
		Calendar k03_cal = Calendar.getInstance();															// 캘린더 클래스 불러와서 인스턴스 생성
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");								// 날짜 출력 포멧 지정
		String k03_Date = k03_sdf.format(k03_cal.getTime());												// 초까지 출력하는 날짜 형식
		
		System.out.printf(" %22s\n\n", "성적집계표");															// 성적집계표 출력 시작
		System.out.printf("%42s\n", "출력일자 : " + k03_Date);												// 출력일자 프린트
		System.out.printf("==============================================\n");								// 구분선 출력
		System.out.printf(" %-4s %-5s %s  %s  %s  %s  %s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");	// 필드명 출력
		System.out.printf("==============================================\n");								// 구분선 출력
		
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {													// 인원수만큼 배열을 돈다
			System.out.printf(" %03d    %-4s %5d  %4d  %4d  %4d   %3.0f\n", 								// 만든 데이터를 프린트함
					k03_i+1, inData.k03_name[k03_i], inData.k03_kor[k03_i], inData.k03_eng[k03_i], 			// 번호는 0부터 시작해서 1을 더해서 1부터 출력
					inData.k03_mat[k03_i], inData.k03_sum[k03_i],inData.k03_ave[k03_i]);					// 각 배열의 번호에 맞는 인덱스를 가져와서 출력
		}
		System.out.printf("==============================================\n");								// 구분선 출력
		System.out.printf(" %-4s%8s %4d  %4d  %4d  %4d  %4.0f\n", "합계", " ", 								// 합계 필드 출력
				inData.korSum[k03_person-1], inData.engSum[k03_person-1], 									// 모든 과목 합계 배열을 만들고
				inData.matSum[k03_person-1], inData.sumSum[k03_person-1], inData.aveSum[k03_person-1]);		// 배열의 29번째 인덱스를 가져오도록 했다
		System.out.printf(" %-4s%8s %4d  %4d  %4d  %4d  %4d\n\n", "평균", " ", 								// 평균 필드 출력
				inData.korSum[k03_person-1] / k03_person, inData.engSum[k03_person-1] / k03_person, 		// 예제와 같이 소수점은 표시하지 않고
				inData.matSum[k03_person-1] / k03_person, inData.sumSum[k03_person-1] / k03_person, 		// 내림으로 처리했다
				(int)(inData.aveSum[k03_person-1] / k03_person));
	}
}
