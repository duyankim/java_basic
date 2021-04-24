package software05.hong;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P8 {

	public static void main(String[] args) {
		// 영수증 출력2 2021-04-12 kopo03 김도연

		String k03_itemname1 = "퓨어에어 비말차단용마스크(최고급형)"; 						// 구매한 물품 이름 변수
		String k03_itemcode1 = "1031615"; 													// 구매한 물품 코드 변수
		int k03_price1 = 3000; 																// 구매한 물건 가격 변수
		int k03_amount1 = 1; 																// 구매한 물건 수량 변수

		String k03_itemname2 = "슬라이드식명찰(가로형)(100호)";								// 구매한 물품 이름 변수
		String k03_itemcode2 = "11008152";													// 구매한 물품 코드 변수
		int k03_price2 = 1000;																// 구매한 물건 가격 변수
		int k03_amount2 = 1;																// 구매한 물건 수량 변수

		String k03_itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; 						// 구매한 물품 이름 변수
		String k03_itemcode3 = "1020800";													// 구매한 물건 가격 변수
		int k03_price3 = 1000;																// 구매한 물건 가격 변수
		int k03_amount3 = 1;																// 구매한 물건 수량 변수

		double k03_priceAll = k03_price1 * k03_amount1 + k03_price2 * k03_amount2 + k03_price3 * k03_amount3; 		// 물품 가격을 전부 더함		
		int k03_tax = (int) Math.round(k03_priceAll / 11); 															// 세금은 물건 가격의 0.1프로이므로 11분의 1을 함
		int k03_priceBeforeTax = (int) (k03_priceAll - k03_tax); 													// 과세 전 물건 가격은 실제 가격에서 세금을 뺀 것임
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###"); 											// 3자리마다 콤마를 찍는 형식을 지정함
		Calendar k03_cal = Calendar.getInstance(); 																	// 캘린더 클래스에서 인스턴스를 생성함
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); 									// 앞으로 날짜를 이런 형식으로 보겠다고 선언함
		String k03_currentDate = k03_sdf.format(k03_cal.getTime()); 												// 현재 날짜를 포멧에 맞게 받아옴
		k03_cal.add(Calendar.DAY_OF_MONTH, 14); 																	// 구입 후 14일 이후 날짜를 구하기 위해 캘린더 함수에서 현재 날짜에 14일을 더함
		SimpleDateFormat monthAndDate = new SimpleDateFormat("MM월 dd일"); 											// 해당 날짜를 월, 일로 나타내는 형식을 만듦
		String k03_twoWeeksLater = monthAndDate.format(k03_cal.getTime()); 											// 현재 날짜가 아닌 2주 뒤 날짜를 구하는 변수를 만듦
		System.out.printf("%11s%-18s\n", " ", "\"국민가게, 다이소\""); 												// 가게 이름 출력
		System.out.printf("%s\n", "(주)아성다이소_분당서현점"); 													// 지점 이름 출력
		System.out.printf("%s:%s\n", "전화", "031-702-6016"); 														// 전화번호 출력
		System.out.printf("%s:%s\n", "본사", "서울 강남구 남부순환로 2748 (도곡동)");								// 본사 주소 출력
		System.out.printf("%s:%s\n", "매장", "경기 성남시 분당구 분당로53번길 11 \n(서현동)"); 						// 지점 주소 출력
		System.out.println("========================================="); 											// 구분선 출력
		System.out.printf("%6s%-28s\n", " ", "소비자중심경영(CCM) 인증기업"); 										// 안내사항 출력
		System.out.printf("%4s%-32s\n", " ", "ISO 9001 품질경영시스템 인증기업"); 									// 안내사항 출력
		System.out.println("========================================="); 											// 구분선 출력
		System.out.printf("%5s%s (%s)%s\n", " ", "교환/환불 14일", k03_twoWeeksLater, "이내,"); 					// 2주 뒤의 날짜를 명시해서 출력
		System.out.printf("%5s%-30s\n", " ", "(전자)영수증, 결제카드 지참 후"); 									// 안내사항 출력
		System.out.printf("%12s%-17s\n", " ", "구입매장에서 가능"); 												// 안내사항 출력
		System.out.printf("%4s%-34s\n", " ", "포장/가격 택 훼손시 교환/환불 불가"); 								// 안내사항 출력
		System.out.printf("%6s%-29s\n", " ", "체크카드 취소 시 최대 7일 소요"); 									// 안내사항 출력
		System.out.println("========================================="); 											// 구분선 출력
		System.out.printf("%s%28s\n", "[POS 1058231]", k03_currentDate); 											// 현재 날짜 출력
		System.out.println("========================================="); 											// 구분선 출력
		System.out.printf("%-12.10s%8s%3d%9s\n[%s]\n", k03_itemname1, k03_df.format(k03_price1), k03_amount1,
				k03_df.format(k03_price1 * k03_amount1), k03_itemcode1);											// 물건 이름, 가격, 수량, 수량*가격 출력
		System.out.printf("%-12.10s%8s%3d%9s\n[%s]\n", k03_itemname2, k03_df.format(k03_price2), k03_amount2,
				k03_df.format(k03_price2 * k03_amount2), k03_itemcode2); 											// 물건 이름, 가격, 수량, 수량*가격 출력
		System.out.printf("%-12.10s%8s%3d%9s\n[%s]\n", k03_itemname3, k03_df.format(k03_price3), k03_amount3,
				k03_df.format(k03_price3 * k03_amount3), k03_itemcode3); 											// 물건 이름, 가격, 수량, 수량*가격 출력
		System.out.printf("%18s%19s\n", "과세합계", k03_df.format(k03_priceBeforeTax)); 							// 과세 합계를 세전 금액으로 출력
		System.out.printf("%19s%19s\n", "부가세", k03_df.format(k03_tax)); 											// 물품 가격의 10프로는 부가세로 출력
		System.out.println("-----------------------------------------"); 											// 구분선 출력
		System.out.printf("%-4s%33s\n", "판매합계", k03_df.format(k03_priceAll)); 									// 판매 합계를 세 자리마다 콤마가 있는 형식에 출력
		System.out.println("========================================="); 											// 구분선 출력
		System.out.printf("%-4s%33s\n", "신용카드", k03_df.format(k03_priceAll)); 									// 결제 금액을 세 자리마다 콤마가 있는 형식에 출력
		System.out.println("-----------------------------------------"); 											// 구분선 출력
		System.out.printf("%-4s%33s\n", "우리카드", "538720**********"); 											// 카드 번호 출력
		System.out.printf("%-4s %s%11s %s\n", "승인번호", "77982843(0)", "승인금액", k03_df.format(k03_priceAll));	// 카드 결제 금액 출력
		System.out.println("========================================="); 											// 구분선 출력
		System.out.printf("%6s%19s %s\n", " ", k03_currentDate, "분당서현점"); 										// 현재 시간 출력
		System.out.printf("%s : %s\n", "상품 및 기타 문의", "1522-4400"); 											// 문의 전화 출력
		System.out.printf("%s : %s\n", "멤버십 및 샵다이소 관련 문의", "1599-2211"); 								// 문의 전화 출력
		System.out.printf("%12s%16s\n", " ", "2112820610158231"); 													// 영수증 번호 출력
		System.out.println("-----------------------------------------"); 											// 구분선 출력
		System.out.printf("%s\n", "🞛 다이소 멤버십 앱 또는 홈페이지에 접속하\n셔서 회원가입 후 다양한 혜택을 누려보세요\n! 🞛"); // 홍보 문구 출력
	}s
}