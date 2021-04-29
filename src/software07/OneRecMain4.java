package software07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class OneRecMain4 {
	/* ArrayList정렬 집계표 2021-04-28 kopo03 김도연 */
	static ArrayList<OneRec> ArrayOneRec = new ArrayList<OneRec>();											// static으로 어레이리스트를 만들고, 각 인덱스에는
	static int[] k03_sumKor;																				// OneRec을 넣는다.
	static int[] k03_sumEng;																				// 이 클래스에서는 sum을 구할 것이기 때문에
	static int[] k03_sumMat;																				// static으로 sum변수를 만들고
	static int[] k03_sumSum;																				// static 변수에 아래 반복문으로 각 항목을 더해 합계를 만든다
	static int[] k03_sumAve;																				// OneRec안에는 각 사람의 과목 점수만 있고 합계는 메소드에서 구한다
	static final int k03_person = 200;																		// 몇 개의 인덱스를 만들지 설정한다.
	
	public static void main(String[] args) {
		int maxLines = 30;																					// 한 페이지에 나올 라인 수를 넣을 변수 선언
		int pages = 0;																						// 총 몇 페이지가 나올건지 계산할 변수 선언
		pages = k03_person / maxLines == 0 ? 																// 만약 학생수가 라인수로 나누어떨어지지 않으면
				k03_person / maxLines : (int)(k03_person / maxLines) + 1;									// 나눈 값에 1을 더해서 페이지 수를 정해준다.
		
		dataSet(pages); 																					// 데이터세팅
		dataSort();
		for (int page = 0; page < pages; page++) {															// 페이지 수만큼 배열을 돈다
			int restLines = k03_person - maxLines * page;													// 앞으로 프린트해야 할 라인수를 계산한다.
			int thisPageLines = restLines > maxLines ? maxLines : restLines;								// 이번 페이지에 몇 라인이 들어가야하는지 계산한다.
			int start = page * maxLines;																	// 이번 페이지의 리스트가 시작할 배열 인덱스와
			int end = start + thisPageLines;																// 리스트의 마지막 배열 인덱스를 구한다.
			int allPageLines = k03_person - restLines + thisPageLines;										// 이 페이지를 포함해 지금까지 출력한 라인수 누적을 구한다.
			
			HeaderPrint(page+1); 																			// 헤더인쇄
			for (int k03_i = start; k03_i < end; k03_i++) { 												// 내용인쇄
				ItemPrint(k03_i, page);																		// 반복문으로 어레이리스트의 크기만큼 루프
			}
			TailPrint(page, thisPageLines, allPageLines); 													// 꼬리인쇄
		}
	}

	public static void dataSet(int pages) {
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {					
			String name = String.format("홍길동%02d", k03_i);													// 이름 만들기
			int kor = (int)(Math.random() * 100);															// 국어 점수 만들기
			int eng = (int)(Math.random() * 100);															// 수학 점수 만들기
			int mat = (int)(Math.random() * 100);															// 영어 점수 만들기
			ArrayOneRec.add(new OneRec(k03_i, name, kor, eng, mat));										// 하나의 OneRec클래스 생성 후 ArrayList에 집어넣음
		}
		k03_sumKor = new int[pages];
		k03_sumEng = new int[pages];
		k03_sumMat = new int[pages];
		k03_sumSum = new int[pages];
		k03_sumAve = new int[pages];
	}
	
	public static void dataSort() {
		Comparator<OneRec> bikyokijun = new Comparator<OneRec>() {			// 각각의 자료구조를 비교할 수 있는 Comparator클래스를 불러온다
			@Override														// Comparator클래스에는 compare메소드가 있다
			public int compare(OneRec a1, OneRec a2) {						// compare메소드에는 비교할 두 클래스를 넣고
				return (a2.sum() - a1.sum());								// 각각의 어떤 요소를 비교할 것인지 넣는다
			}
		};
		Collections.sort(ArrayOneRec, bikyokijun);							// 비교기준은 위와 같이 합계의 차이고, 첫번째 인자는 어레이리스트다.
	}
	
	public static String timeStamp() {																		// 현재 시간을 가져오는 메소드
		Calendar k03_cal = Calendar.getInstance();															// 캘린더 클래스 불러와서 인스턴스 생성
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");								// 날짜 출력 포멧 지정
		return k03_sdf.format(k03_cal.getTime());															// 초까지 출력하는 날짜 형식
	}
	
	public static void HeaderPrint(int page) {																// 헤더를 출력하는 메소드
		String k03_Date = timeStamp();																		// 현재시간을 string변수에 할당한다.
		System.out.printf(" %26s\n\n", "성적집계표");															// 성적집계표 출력 시작
		System.out.printf(" PAGE: %d%42s\n", page, "출력일자 : " + k03_Date);									// 출력일자 프린트
		System.out.printf("======================================================\n");						// 구분선 출력
		System.out.printf(" %-4s %-4s%6s%6s%6s%6s%6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");	// 필드명 출력
		System.out.printf("======================================================\n");						// 구분선 출력
	}
	
	public static void ItemPrint(int i, int page) {															// 각 아이템을 출력하는 메소드
		OneRec k03_rec;																						// 어레이리스트에서 빼올 각 클래스를 넣을 변수
		k03_rec = ArrayOneRec.get(i);																		// 인자로 받은 i로 어레이리스트의 각 인덱스 가져옴
		System.out.printf(" %03d   %-6s%6d %7d %7d %7d %7.1f\n", 											// 각 항목 프린트
				k03_rec.studentId(), k03_rec.name(), k03_rec.kor(), k03_rec.eng(), 
				k03_rec.mat(), k03_rec.sum(), k03_rec.ave());
		k03_sumKor[page] += k03_rec.kor();																	// 배열을 돌 때 각 합계에 현재 배열의 과목 점수를
		k03_sumEng[page] += k03_rec.eng();																	// 더해주어서 누적 합계로
		k03_sumMat[page] += k03_rec.mat();																	// 루프를 돌면 합계를 따로 구하지 않아도 되게 만듦
		k03_sumSum[page] += k03_rec.sum();																	// 이전에 만들었던 inputData와는 달리
		k03_sumAve[page] += k03_rec.ave();																	// inData안에 sum이 있지 않고 출력할 때 만든다
	}
	
	public static void TailPrint(int page, int thisPageLines, int allPageLines) {							// 하단부를 출력하는 메소드
		System.out.printf("======================================================\n");						// 구분선 출력
		System.out.printf(" %s\n", "현재페이지");																// 현재 페이지 부분을 프린트한다.
		sumPrint(k03_sumKor[page], k03_sumEng[page], k03_sumMat[page]);										// 합계와 평균을 형식에 맞춰 출력하는 부분으로
		avgPrint(k03_sumKor[page], k03_sumEng[page], k03_sumMat[page], thisPageLines);						// 각 과목 합계의 페이지번째 인덱스에 합계가 들어있다.
		System.out.printf("======================================================\n");						// 구분선을 프린트한다.
		System.out.printf(" %s\n", "누적페이지");																// 누적 페이지 부분을 프린트한다.
		sumPrint(accSum(page, k03_sumKor), accSum(page, k03_sumEng), accSum(page,k03_sumMat));				// 누적 메소드를 활용해서 지금까지 페이지까지의 
		avgPrint(accSum(page,k03_sumKor), accSum(page, k03_sumEng), accSum(page, k03_sumMat), allPageLines);//모든 합계의 합계를 구한다.
		System.out.println();
	}

	public static void sumPrint(int kor, int eng, int mat) {												// 합계를 출력하는 메소드다.
		int k03_sum = kor + eng + mat;																		// 먼저 국영수 점수를 더해 합계 변수를 만든다.
		System.out.printf(" %-4s%7s  %6d  %6d  %6d  %6d %7.1f\n", "합계", " ", 								// 정렬을 맞추어서 프린트 하면서
				kor, eng, mat, k03_sum, k03_sum / 3.0);														// 평균 부분에는 합계를 3으로 나누어 표현했다.
	}
	
	public static void avgPrint(int kor, int eng, int mat, int lines) {										// 평균을 출력하는 메소드다.
		int k03_ave = (kor + eng + mat)/lines;																// 먼저 국영수 점수합계값과 나눌 값을 인자로 받아
		System.out.printf(" %-4s%7s  %6d  %6d  %6d  %6d %7.1f\n", "평균", " ", 								// 국영수합계의 총점에 대한 평균을 계산하였다.
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
