package software06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet3 {

	public static void main(String[] args) {
		/* 성적집계표 출력 - 다페이지 2021-04-27 kopo03 김도연 */
		
		int k03_person = 100;																				// 이 값을 주는만큼 저장소 생성
		int maxLines = 30;
		int pages = 0;
		pages = k03_person / maxLines == 0 ? 
				k03_person / maxLines : (int)(k03_person / maxLines) + 1;
		
		InputData2 inData = new InputData2(k03_person, maxLines, pages);									// 생성자에 숫자를 준 만큼 배열을 만든다.
		
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {													// 인원수만큼 배열을 돌면서 배열을 채워줌
			String name = String.format("홍길%02d", k03_i+1);												// 이름 만들기
			int k03_kor = (int)(Math.random() * 100);														// 국어점수 만들기
			int k03_eng = (int) (Math.random() * 100);														// 영어점수 만들기
			int k03_mat = (int) (Math.random() * 100); 														// 수학점수 만들기
			inData.SetData(k03_i, name, k03_kor, k03_eng, k03_mat); 										// 클래스 내 값 입력
		}

		for (int page = 0; page < pages; page++) {
			int restLines = k03_person - maxLines * page;
			int thisPageLines = restLines > maxLines ? maxLines : restLines;
			int start = page * maxLines;
			int end = start + thisPageLines;
			
			int allPageLines = k03_person - restLines + thisPageLines;
			
			fieldPrint(page + 1);
			listPrint(inData, start, end);
			inData.setSumArr(page, start, end);

			System.out.printf(" %s\n", "현재페이지");
			sumPrint(inData.korSum[page], inData.engSum[page], inData.matSum[page]);
			avgPrint(inData.korSum[page], inData.engSum[page], inData.matSum[page], thisPageLines);
			System.out.printf("======================================================\n");
			
			System.out.printf(" %s\n", "누적페이지");
			sumPrint(accSum(page, inData.korSum), accSum(page, inData.engSum), accSum(page, inData.matSum));
			avgPrint(accSum(page, inData.korSum), accSum(page, inData.engSum), accSum(page, inData.matSum), allPageLines);
			System.out.println();
		}

	}
	
	public static String timeStamp() {
		Calendar k03_cal = Calendar.getInstance();															// 캘린더 클래스 불러와서 인스턴스 생성
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");								// 날짜 출력 포멧 지정
		return k03_sdf.format(k03_cal.getTime());															// 초까지 출력하는 날짜 형식
	}
	
	public static void fieldPrint(int page) {
		String k03_Date = timeStamp();
		System.out.printf(" %26s\n\n", "성적집계표");															// 성적집계표 출력 시작
		System.out.printf(" PAGE: %d%42s\n", page, "출력일자 : " + k03_Date);									// 출력일자 프린트
		System.out.printf("======================================================\n");								// 구분선 출력
		System.out.printf(" %-4s %-4s%6s%6s%6s%6s%6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");	// 필드명 출력
		System.out.printf("======================================================\n");								// 구분선 출력
	}
	
	public static void listPrint(InputData2 inData, int start, int lines) {	
		inData.setSumAve(start, lines);
		for (int k03_i = start; k03_i < lines; k03_i++) {														// 인원수만큼 배열을 돈다
			System.out.printf(" %03d    %-5s%7d %7d %7d %7d %7.1f\n", 								// 만든 데이터를 프린트함
					k03_i+1, 
					inData.k03_name[k03_i], 
					inData.k03_kor[k03_i], 
					inData.k03_eng[k03_i], 				
					inData.k03_mat[k03_i], 
					inData.k03_sum[k03_i], 
					inData.k03_ave[k03_i]);					
		}
		System.out.printf("======================================================\n");								// 구분선 출력
	}
	
	public static void sumPrint(int kor, int eng, int mat) {
		int sum = kor + eng + mat;
		System.out.printf(" %-4s%7s  %6d  %6d  %6d  %6d  %6.1f\n", "합계", " ", 
				kor, eng, mat, sum, sum / 3.0);	
	}
	
	public static void avgPrint(int kor, int eng, int mat, int lines) {
		int sum = (kor + eng + mat)/lines;
		System.out.printf(" %-4s%7s  %6d  %6d  %6d  %6d  %6.1f\n", "평균", " ", 
				kor/lines, eng/lines, mat/lines, sum, sum / 3.0);	
	}
	
	public static int accSum (int page, int[] inputArr) {
		int accSum = 0;
		for (int i = 0; i < page+1; i++) {
			accSum += inputArr[i];
		}
		return accSum;
	}
}
