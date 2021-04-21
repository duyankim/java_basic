package software05.hong;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {

	public static void main(String[] args) {
		// 영수증 출력2 2021-04-12 kopo03 김도연

		String k03_itemname1 = "퓨어에어 비말차단용마스크(최고급형)"; 
		String k03_itemcode1 = "1031615";
		int k03_price1 = 3000;
		int k03_amount1 = 1;

		String k03_itemname2 = "슬라이드식명찰(가로형)(100호)";
		String k03_itemcode2 = "11008152";
		int k03_price2 = 1000;
		int k03_amount2 = 1;

		String k03_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k03_itemcode3 = "1020800";
		int k03_price3 = 1000;
		int k03_amount3 = 1;
		
		double k03_priceAll = k03_price1 * k03_amount1 + k03_price2 * k03_amount2 + k03_price3 * k03_amount3;
		int k03_tax = (int) Math.round(k03_priceAll / 11);
		int k03_priceBeforeTax = (int)(k03_priceAll - k03_tax);

		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###");

		Calendar k03_cal = Calendar.getInstance();
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k03_currentDate = k03_sdf.format(k03_cal.getTime());

		k03_cal.add(Calendar.DAY_OF_MONTH, 14);
		SimpleDateFormat monthAndDate = new SimpleDateFormat("MM월 dd일");
		String twoWeeksLater = monthAndDate.format(k03_cal.getTime());

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
		System.out.printf("%s%35s\n", "[POS 1058231]", k03_currentDate);
		System.out.println("================================================");
		System.out.printf("%-14.14s%10s%3d%9s\n[%s]\n", k03_itemname1, k03_df.format(k03_price1), k03_amount1, k03_df.format(k03_price1 * k03_amount1), k03_itemcode1);
		System.out.printf("%-14.14s%12s%3d%9s\n[%s]\n", k03_itemname2, k03_df.format(k03_price2), k03_amount2, k03_df.format(k03_price2 * k03_amount2), k03_itemcode2);
		System.out.printf("%-14.14s%10s%3d%9s\n[%s]\n", k03_itemname3, k03_df.format(k03_price3), k03_amount3, k03_df.format(k03_price3 * k03_amount3), k03_itemcode3);
		System.out.printf("%18s%26s\n", "과세합계", k03_df.format(k03_priceBeforeTax));
		System.out.printf("%19s%26s\n", "부가세", k03_df.format(k03_tax));
		
		System.out.println("------------------------------------------------");
		System.out.printf("%-4s%40s\n", "판매합계", k03_df.format(k03_priceAll));
		System.out.println("================================================");
		System.out.printf("%-4s%40s\n", "신용카드", k03_df.format(k03_priceAll));
		System.out.println("------------------------------------------------");
		System.out.printf("%-4s%40s\n", "우리카드", "538720**********");
		System.out.printf("%-4s %s%18s %s\n", "승인번호", "77982843(0)", "승인금액", k03_df.format(k03_priceAll));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", k03_currentDate, "분당서현점");
		System.out.printf("%s : %s\n", "상품 및 기타 문의", "1522-4400");
		System.out.printf("%s : %s\n", "멤버십 및 샵다이소 관련 문의", "1599-2211");

		System.out.printf("%32s\n", "2112820610158231");
		System.out.println("------------------------------------------------");
		System.out.printf("%28s\n", "🞛 다이소 멤버십 앱 또는 홈페이지에 접속하셔서");
		System.out.printf("%28s\n", "회원가입 후 다양한 혜택을 누려보세요! 🞛");
	}

}
















