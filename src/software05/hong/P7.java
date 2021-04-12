package software05.hong;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7 {

	public static void main(String[] args) {
		// 영수증 출력1 2021-04-12 kopo03 김도연
		
		int k03_Price = 33000;
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		System.out.println("신용승인");
		System.out.printf("%-3s : %s", "단말기", "2N68665898");
		System.out.printf("%16.4s : %s\n", "전표번호", "041218");
		System.out.printf("%-3s : %s\n", "가맹점", "한양김치찌개");
		System.out.printf("%-3s : %s\n", "주  소", "경기 성남시 분당구 황새울로351번길 10 .\n1층");
		System.out.printf("%-3s : %s\n", "대표자", "유창신");
		System.out.printf("%-3s : %s", "사업자", "752-53-00558");
		System.out.printf("%17.4s : %s\n", "TEL", "7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
		
		System.out.printf("%-3s : %37s원\n", "금  액", df.format(k03_Price/11*10));
		System.out.printf("%-3s : %37s원\n", "부가세", df.format((k03_Price/11)));
		System.out.printf("%-3s : %37s원\n", "합  계", df.format(k03_Price));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
		
		System.out.println("우리카드");
		System.out.printf("%-4s : %s%12s\n", "카드번호", "5387-20**-****-4613(S)", "일시불");
		System.out.printf("%-4s : %s\n", "거래일시", sdf.format(cal.getTime()));
		System.out.printf("%-4s : %s\n", "승인번호", "70404427");
		System.out.printf("%-4s : %s\n", "거래번호", "357734873739");
		
		System.out.printf("%-2s : %s", "매입", "비씨카드사");
		System.out.printf("%8.2s : %s\n", "가맹", "720068568");
		System.out.printf("%-2s : %s\n", "알림", "EDC매출표");
		System.out.printf("%-2s : %s\n", "문의", "TEL)1544-4700");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
		
		System.out.printf("%26s\n", "* 감사합니다 *");
		System.out.printf("%46s\n", "표준V2. 08_20200212");
	}

}
