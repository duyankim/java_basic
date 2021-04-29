package software07;

import java.util.ArrayList;

public class OneRecMain2 {
	/* 클래스의 ArrayList 2021-04-28 kopo03 김도연 */
	static ArrayList<OneRec> ArrayOneRec = new ArrayList<OneRec>();			// static으로 어레이리스트를 만들고, 각 인덱스에는
	static int k03_sumKor = 0;												// OneRec을 넣는다.
	static int k03_sumEng = 0;												// 이 클래스에서는 sum을 구할 것이기 때문에
	static int k03_sumMat = 0;												// static으로 sum변수를 만들고
	static int k03_sumSum = 0;												// static 변수에 아래 반복문으로 각 항목을 더해 합계를 만든다
	static int k03_sumAve = 0;												// OneRec안에는 각 사람의 과목 점수만 있고 합계는 메소드에서 구한다
	static final int k03_person = 20;										// 몇 개의 인덱스를 만들지 설정한다.

	public static void main(String[] args) {
		
		dataSet(); 															// 데이터세팅
		HeaderPrint(); 														// 헤더인쇄
		for (int k03_i = 0; k03_i < ArrayOneRec.size(); k03_i++) { 			// 내용인쇄
			ItemPrint(k03_i);												// 반복문으로 어레이리스트의 크기만큼 루프
		}
		TailPrint(); 														// 꼬리인쇄
	}
	
	public static void dataSet() {
		for (int k03_i = 0; k03_i < k03_person; k03_i++) {					
			String name = String.format("홍길동%02d", k03_i);					// 이름 만들기
			int kor = (int)(Math.random() * 100);							// 국어 점수 만들기
			int eng = (int)(Math.random() * 100);							// 수학 점수 만들기
			int mat = (int)(Math.random() * 100);							// 영어 점수 만들기
			ArrayOneRec.add(new OneRec(k03_i, name, kor, eng, mat));		// 하나의 OneRec클래스 생성 후 ArrayList에 집어넣음
		}
	}
	
	public static void HeaderPrint() {										// 헤더를 출력하는 메소드
		System.out.printf("*****************************************\n");	// 구분선 출력
		System.out.printf(" %2s %4s %2s %2s %2s %2s  %2s\n",				// 필드 출력
				"번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("*****************************************\n");	// 구분선 출력
	}
	
	public static void ItemPrint(int i) {									// 각 아이템을 출력하는 메소드
		OneRec k03_rec;														// 어레이리스트에서 빼올 각 클래스를 넣을 변수
		k03_rec = ArrayOneRec.get(i);										// 인자로 받은 i로 어레이리스트의 각 인덱스 가져옴
		System.out.printf("%4d %4s %3d %3d %3d  %3d  %6.2f\n", 				// 각 항목 프린트
				k03_rec.studentId(), k03_rec.name(), k03_rec.kor(), k03_rec.eng(), 
				k03_rec.mat(), k03_rec.sum(), k03_rec.ave());
		k03_sumKor += k03_rec.kor();										// 배열을 돌 때 각 합계에 현재 배열의 과목 점수를
		k03_sumEng += k03_rec.eng();										// 더해주어서 누적 합계로
		k03_sumMat += k03_rec.mat();										// 루프를 돌면 합계를 따로 구하지 않아도 되게 만듦
		k03_sumSum += k03_rec.sum();										// 이전에 만들었던 inputData와는 달리
		k03_sumAve += k03_rec.ave();										// inData안에 sum이 있지 않고 출력할 때 만든다
	}
	
	public static void TailPrint() {										// 하단부를 출력하는 메소드
		System.out.printf("*****************************************\n");	// 구분선 출력
		System.out.printf("  국어합계 %d   국어평균: %6.2f\n", k03_sumKor, k03_sumKor / (double) ArrayOneRec.size()); // 국어평균 출력
		System.out.printf("  영어합계 %d   영어평균: %6.2f\n", k03_sumEng, k03_sumEng / (double) ArrayOneRec.size()); // 나누는 값을 더블로
		System.out.printf("  수학합계 %d   수학평균: %6.2f\n", k03_sumMat, k03_sumMat / (double) ArrayOneRec.size()); // 캐스팅해서 소수점까지
		System.out.printf("*****************************************\n");										
		System.out.printf("  반평균합계 %d  반평균: %6.2f\n", k03_sumAve, k03_sumAve / (double) ArrayOneRec.size()); // 출력할 수 있다.

	}
}
