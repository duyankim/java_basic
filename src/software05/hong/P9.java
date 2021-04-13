package software05.hong;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// 영수증 출력3 2021-04-12 kopo03 김도연
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm");
		String currentDate = sdf.format(cal.getTime());
		
		/*
		 * 영수증 출력
		 */
		System.out.printf("%30s%s\n", " ", "이마트 죽전점 (031)888-1234");
		System.out.printf("%30s%s\n", " ", "206-86-50913 강희석");
		System.out.printf("%30s%s\n", " ", "용인 수지고 포은대로 552");

		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");

		System.out.printf("%s%s%35s\n", "[구 매]", currentDate, "[POS:0011-9861]");
		System.out.printf("%-20.20s%8.8s%8.8s%8.8s\n", "상품명", "단 가", "수량", "금 액");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");

	}

}
