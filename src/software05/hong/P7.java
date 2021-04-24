package temp2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kimchi {

	public static void main(String[] args) {
		// 영수증 출력1 2021-04-12 kopo03 김도연

		int k03_Price = 33000; // 토탈 가격

		DecimalFormat df = new DecimalFormat("###,###,###,###,###");									 // 3자리마다 콤마를 찍는 형식
		Calendar cal = Calendar.getInstance(); 															// 캘린더 클래스에서 인스턴스를 불러옴
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); 							// 날짜 형식 중 HH는 24시간으로,
																										// hh는 12시간으로 나온다
		int netPrice = 0;
		int tax = 0;
		
		if (k03_Price / 11.0 - (int)(k03_Price / 11.0) > 0) {
			tax = (int)(k03_Price / 11.0) + 1;
		} else {
			tax = (int)(k03_Price / 11.0);
		}
		
		netPrice = k03_Price - tax;
		
		System.out.println("신용승인"); 																// 신용승인 출력
		System.out.printf("%-3s : %s", "단말기", "2N68665898"); 										// 단말기 정보 출력
		System.out.printf("%9.4s : %s\n", "전표번호", "041218"); 										// 전표번호 출력
		System.out.printf("%-3s : %s\n", "가맹점", "한양김치찌개"); 									// 점포명 출력
		System.out.printf("%-3s : %s\n", "주  소", "경기 성남시 분당구 황새울로351번\n길 10 .1층");		// 가게 주소 출력
		System.out.printf("%-3s : %s\n", "대표자", "유창신"); 											// 사업자 명의 출력
		System.out.printf("%-3s : %s", "사업자", "752-53-00558"); 										// 사업자 번호 출력
		System.out.printf("%11.4s : %s\n", "TEL", "7055695"); 											// 사업장 전화번호 출력
		System.out.println("- - - - - - - - - - - - - - - - - - - - -"); 								// 구분선출력

		System.out.printf("%-3s   %31s원\n", "금  액", df.format(netPrice)); 				// 금액은 세금 0.1프로를 더하기 전 금액
		System.out.printf("%-3s   %31s원\n", "부가세", df.format(tax)); 					// 부가세는 금액의 세금 0.1프로
		System.out.printf("%-3s   %31s원\n", "합  계", df.format(k03_Price)); 							// 실제 금액 출력
		System.out.println("- - - - - - - - - - - - - - - - - - - - -"); 								// 구분선 출력

		System.out.println("우리카드"); // 카드사 출력
		System.out.printf("%-4s : %s%6s\n", "카드번호", "5387-20**-****-4613(S)", "일시불"); 			// 카드 번호 출력
		System.out.printf("%-4s : %s\n", "거래일시", sdf.format(cal.getTime())); 						// 거래 일시 출력
		System.out.printf("%-4s : %s\n", "승인번호", "70404427"); 										// 승인 번호 출력
		System.out.printf("%-4s : %s\n", "거래번호", "357734873739"); 									// 거래 번호 출력

		System.out.printf("%-2s : %s", "매입", "비씨카드사"); 											// 카드사 출력
		System.out.printf("%8.2s : %s\n", "가맹", "720068568"); 										// 가맹점 번호 출력
		System.out.printf("%-2s : %s\n", "알림", "EDC매출표"); 											// 기타 정보 출력
		System.out.printf("%-2s : %s\n", "문의", "TEL)1544-4700"); 										// 결제 정보 문의 출력
		System.out.println("- - - - - - - - - - - - - - - - - - - - -"); 								// 구분선 출력

		System.out.printf("%13s%s\n", " ", "* 감사합니다 *"); 											// 감사합니다 출력
		System.out.printf("%40s\n", "표준V2. 08_20200212"); 											// 영수증 버전 출력
	}

}