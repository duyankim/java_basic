package software06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet3 {

	public static void main(String[] args) {
		/* 성적집계표 출력 - 다페이지 2021-04-27 kopo03 김도연 */
		
		int k03_person = 200;																				// 학생 수 넣는만큼 배열 크기 생성
		int maxLines = 30;																					// 한 페이지에 나올 라인 수를 넣을 변수 선언
		int pages = 0;																						// 총 몇 페이지가 나올건지 계산할 변수 선언
		pages = k03_person / maxLines == 0 ? 																// 만약 학생수가 라인수로 나누어떨어지지 않으면
				k03_person / maxLines : (int)(k03_person / maxLines) + 1;									// 나눈 값에 1을 더해서 페이지 수를 정해준다.
		
		InputData2 inData = new InputData2(k03_person, maxLines, pages);									// 생성자에 숫자를 준 만큼 배열을 만든다.
		
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {													// 인원수만큼 배열을 돌면서 배열을 채워줌
			String name = String.format("홍길%02d", k03_i+1);												// 이름 만들기
			int k03_kor = (int)(Math.random() * 100);														// 국어점수 만들기
			int k03_eng = (int) (Math.random() * 100);														// 영어점수 만들기
			int k03_mat = (int) (Math.random() * 100); 														// 수학점수 만들기
			inData.SetData(k03_i, name, k03_kor, k03_eng, k03_mat); 										// 클래스 내 값 입력
		}

		for (int page = 0; page < pages; page++) {															// 페이지 수만큼 배열을 돈다
			int restLines = k03_person - maxLines * page;													// 앞으로 프린트해야 할 라인수를 계산한다.
			int thisPageLines = restLines > maxLines ? maxLines : restLines;								// 이번 페이지에 몇 라인이 들어가야하는지 계산한다.
			int start = page * maxLines;																	// 이번 페이지의 리스트가 시작할 배열 인덱스와
			int end = start + thisPageLines;																// 리스트의 마지막 배열 인덱스를 구한다.
			int allPageLines = k03_person - restLines + thisPageLines;										// 이 페이지를 포함해 지금까지 출력한 라인수 누적을 구한다.
			
			fieldPrint(page + 1);																			// list의 상단 필드를 출력하는 메소드다.
			listPrint(inData, start, end);																	// list를 프린트하는 메소드다.
			inData.setSumArr(page, start, end);																// 지금까지의 리스트의 합계를 배열에 넣는다.

			System.out.printf(" %s\n", "현재페이지");															// 현재 페이지 부분을 프린트한다.
			sumPrint(inData.korSum[page], inData.engSum[page], inData.matSum[page]);						// 합계와 평균을 형식에 맞춰 출력하는 부분으로
			avgPrint(inData.korSum[page], inData.engSum[page], inData.matSum[page], thisPageLines);			// 각 과목 합계의 페이지번째 인덱스에 합계가 들어있다.
			System.out.printf("======================================================\n");					// 구분선을 프린트한다.
			
			System.out.printf(" %s\n", "누적페이지");															// 누적 페이지 부분을 프린트한다.
			sumPrint(accSum(page, inData.korSum), accSum(page, inData.engSum), accSum(page, inData.matSum));// 누적 메소드를 활용해서 지금까지 페이지까지의 
			avgPrint(accSum(page, inData.korSum), accSum(page, inData.engSum), accSum(page, inData.matSum), allPageLines);//모든 합계의 합계를 구한다.
			System.out.println();
		}
	}
	
	public static String timeStamp() {																		// 현재 시간을 가져오는 메소드
		Calendar k03_cal = Calendar.getInstance();															// 캘린더 클래스 불러와서 인스턴스 생성
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");								// 날짜 출력 포멧 지정
		return k03_sdf.format(k03_cal.getTime());															// 초까지 출력하는 날짜 형식
	}
	
	public static void fieldPrint(int page) {
		String k03_Date = timeStamp();																		// 현재시간을 string변수에 할당한다.
		System.out.printf(" %26s\n\n", "성적집계표");															// 성적집계표 출력 시작
		System.out.printf(" PAGE: %d%42s\n", page, "출력일자 : " + k03_Date);									// 출력일자 프린트
		System.out.printf("======================================================\n");						// 구분선 출력
		System.out.printf(" %-4s %-4s%6s%6s%6s%6s%6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");	// 필드명 출력
		System.out.printf("======================================================\n");						// 구분선 출력
	}
	
	public static void listPrint(InputData2 inData, int start, int lines) {	
		inData.setSumAve(start, lines);																		// 반복문을 적게 돌도록, 합계와 평균은 각 과목 배열이
		for (int k03_i = start; k03_i < lines; k03_i++) {													// 만들어진 후 프린트하기 바로 전 set하도록 했다.
			System.out.printf(" %03d    %-5s%7d %7d %7d %7d %7.1f\n", 										// 시작 인덱스와 종료 인덱스를 메인 메소드에서
					k03_i+1, 																				// 전달하여 리스트에서 각 인덱스 범위만 프린트 된다.
					inData.k03_name[k03_i], 																// 인덱스는 0부터 시작하는 반면,
					inData.k03_kor[k03_i], 																	// 리스트의 번호 부분은 1부터 시작하기 때문에
					inData.k03_eng[k03_i], 																	// 인덱스에 1을 더해 번호 부분을 출력했다.
					inData.k03_mat[k03_i], 																	// inData에서 만든 각 과목 배열의
					inData.k03_sum[k03_i], 																	// 인덱스에 접근해서 출력하도록 했다.
					inData.k03_ave[k03_i]);					
		}
		System.out.printf("======================================================\n");						// 구분선 출력
	}
	
	public static void sumPrint(int kor, int eng, int mat) {												// 합계를 출력하는 메소드다.
		int k03_sum = kor + eng + mat;																		// 먼저 국영수 점수를 더해 합계 변수를 만든다.
		System.out.printf(" %-4s%7s  %6d  %6d  %6d  %6d  %6.1f\n", "합계", " ", 								// 정렬을 맞추어서 프린트 하면서
				kor, eng, mat, k03_sum, k03_sum / 3.0);														// 평균 부분에는 합계를 3으로 나누어 표현했다.
	}
	
	public static void avgPrint(int kor, int eng, int mat, int lines) {										// 평균을 출력하는 메소드다.
		int k03_ave = (kor + eng + mat)/lines;																// 먼저 국영수 점수합계값과 나눌 값을 인자로 받아
		System.out.printf(" %-4s%7s  %6d  %6d  %6d  %6d  %6.1f\n", "평균", " ", 								// 국영수합계의 총점에 대한 평균을 계산하였다.
				kor/lines, eng/lines, mat/lines, k03_ave, k03_ave / 3.0);									// 총점에 대한 합계를 3으로 나누어 평균의 평균을 계산하였다.
	}
	
	public static int accSum (int page, int[] inputArr) {													// 누적 합계를 구하는 메소드다.
		int k03_accSum = 0;																					// 누적 합계는 합계의 배열과 몇 번째 페이지인지를 인자로 받는다.
		for (int k03_i = 0; k03_i < page + 1; k03_i++) {													// 페이지가 0부터 시작하므로 반복문에서는 1을 더해서 한계값을 설정한다.
			k03_accSum += inputArr[k03_i];																	// 누적 합계는 합계 배열의 페이지 인덱스까지 각 인덱스값을 더한 값이다.
		}
		return k03_accSum;																					// int값인 누적합계값을 반환한다.
	}
}
