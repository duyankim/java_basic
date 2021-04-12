package software05.hong;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {

	public static void main(String[] args) {
		// 영수증 출력2 2021-04-12 kopo03 김도연

		String itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String itemcode1 = "1031615";
		int price1 = 3000;
		int amount1 = 1;

		String itemname2 = "슬라이드식명찰(가로형)(100호)";
		String itemcode2 = "11008152";
		int price2 = 1000;
		int amount2 = 1;

		String itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String itemcode3 = "1020800";
		int price3 = 1000;
		int amount3 = 1;
		
		double priceAll = price1 * amount1 + price2 * amount2 + price3 * amount3;
		int tax = (int) Math.round(priceAll / 11);
		int priceBeforeTax = (int)(priceAll - tax);

		DecimalFormat df = new DecimalFormat("###,###,###,###,###");

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String currentDate = sdf.format(cal.getTime());

		cal.add(Calendar.DAY_OF_MONTH, 14);
		SimpleDateFormat monthAndDate = new SimpleDateFormat("MM월 dd일");
		String twoWeeksLater = monthAndDate.format(cal.getTime());

		System.out.printf("%26s\n", "\"국민가게, 다이소\"");
		System.out.printf("%s\n", "(주)아성다이소_분당서현점");
		System.out.printf("%s:%s\n", "전화", "031-702-6016");
		System.out.printf("%s:%s\n", "본사", "서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("%s:%s\n", "매장", "경기 성남시 분당구 분당로53번길 11 (서현\n동)");
		System.out.println("================================================");
		System.out.printf("%27s\n", "소비자중심경영(CCM) 인증기업");
		System.out.printf("%29s\n", "ISO 9001 품질경영시스템 인증기업");
		System.out.println("================================================");
		System.out.printf("%18s (%s)이내,\n", "교환/환불 14일", twoWeeksLater);
		System.out.printf("%s\n", "(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.printf("%27s\n", "포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%27s\n", "체크카드 취소 시 최대 7일 소요");
		System.out.println("================================================");
		System.out.printf("%s%35s\n", "[POS 1058231]", currentDate);
		System.out.println("================================================");
		System.out.printf("%-14.14s%10d%3d%9d\n[%s]\n", itemname1, price1, amount1, price1 * amount1, itemcode1);
		System.out.printf("%-14.14s%12d%3d%9d\n[%s]\n", itemname2, price2, amount2, price2 * amount2, itemcode2);
		System.out.printf("%-14.14s%10d%3d%9d\n[%s]\n", itemname3, price3, amount3, price3 * amount3, itemcode3);
		System.out.printf("%18s%26s\n", "과세합계", df.format(priceBeforeTax));
		System.out.printf("%19s%26s\n", "부가세", df.format(tax));
		
		System.out.println("------------------------------------------------");
		System.out.printf("%-4s%40s\n", "판매합계", df.format(priceAll));
		System.out.println("================================================");
		System.out.printf("%-4s%40s\n", "신용카드", df.format(priceAll));
		System.out.println("------------------------------------------------");
		System.out.printf("%-4s%40s\n", "우리카드", "538720**********");
		System.out.printf("%-4s %s%18s %s\n", "승인번호", "77982843(0)", "승인금액", df.format(priceAll));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", currentDate, "분당서현점");
		System.out.printf("%s : %s\n", "상품 및 기타 문의", "1522-4400");
		System.out.printf("%s : %s\n", "멤버십 및 샵다이소 관련 문의", "1599-2211");


	}

}
















