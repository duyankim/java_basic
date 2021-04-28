package software06;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P6 {
	/* 변수와 메소드-영수증 2021-04-27 kopo03 김도연 */
	
	public static String[] k03_itemName = { "애호박", "시금치",
			"느타리버섯", "파프리카", "국산마늘쫑", "단호박", "미역줄기", "상주오이", "국산햇양파", "국산바지락", "왕새우", "건조코다리", "가평맷돌순두부",
			"표고버섯", "가래떡", "떡국떡", "아귀채", "꽃보다오징어", "각종진미채", "남해볶음용멸치", "국물용다시멸치", "국산참기름", "국산들기름", "김천통살호두",
			"최고급뿌리다시마", "피코크 파주장단콩순두부", "CJ 유자샐러드소스250g", "(990)팽이버섯(봉)", "롯데 ABC초콜릿 밀크165G", "대추방울토마토", "아보카도",
			"깐마늘(500g/봉)", "햇곱창김", "예천찰기장", "제천찰수수", "강원도서리태", "델몬트바나나", "부산대저토마토", "딸기" }; 

	public static int[] k03_price = { 3000, 1000, 1000, 2000, 2000, 2500, 2000, 2000, 5000, 4000, 8000,
			10000, 10000, 3000, 3000, 9990, 5000, 8000, 13000, 8000, 8000, 12000, 18000, 15000, 20000, 10000, 20000,
			10000, 10000, 10000, 3000, 26000, 10000, 5000, 100, 5000, 4500, 3400, 900 }; 

	public static int[] k03_count = { 1, 3, 1, 1, 10, 1, 1, 2, 1, 1, 1, 5, 1, 8, 1, 6, 2, 1, 4, 1, 1, 1, 2,
			1, 3, 1, 1, 1, 1, 1, 7, 8, 1, 20, 1, 1, 1, 1, 1 }; 

	public static boolean[] k03_taxfree = { true, false, false, false, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true };
	
	public static void main(String[] args) {
		int k03_itemCount = k03_itemName.length;
		k03_TitlePrint();
		k03_TimeStamp();
		k03_HeaderPrint();
		
		for (int k03_i = 0; k03_i < k03_itemCount; k03_i++) {
			try {
				k03_ItemPrint(k03_i);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		TotalPrint();
	}
	
	public static void k03_TitlePrint() {
		String k03_store, k03_address, k03_manager;	
		k03_store = "이마트 죽전점 (031)888-1234";	
		k03_manager = "206-86-50913 강희석";		
		k03_address = "용인 수지구 포은대로 552";		

		System.out.printf("%12s%s\n", " ", k03_store);	
		System.out.printf("%8s%4s%s\n", "emart", " ", k03_manager);	
		System.out.printf("%12s%s\n", " ", k03_address);		
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");		
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)"); 	
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");	
		System.out.println();	
	}

	public static void k03_TimeStamp() {
		String k03_pos = "POS:0011-9861";
		Calendar k03_cal = Calendar.getInstance();
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		String k03_currentDateMin = k03_sdf.format(k03_cal.getTime());
		System.out.printf("%s%s%18s\n", "[구 매]", k03_currentDateMin, k03_pos);
	}
	
	public static void k03_HeaderPrint() {
		System.out.println("-----------------------------------------"); 							
		System.out.printf("%1s%-13.13s%6.6s%3.3s%9.9s\n", " ", "상 품 명", "단 가", "수량", "금 액"); 
		System.out.println("-----------------------------------------"); 			
	}
	
	public static void k03_ItemPrint(int k03_i) throws UnsupportedEncodingException {
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###");
		String k03_taxFreeOrNot;
		int k03_lineCount = 0;	
		String k03_item = k03_itemName[k03_i] + "              ";													
		k03_taxFreeOrNot = k03_taxfree[k03_i] == true ? "*" : " ";													
		k03_item = cutItem(k03_item);
		System.out.printf("%-1s%s%10.10s%3.3s%11s\n", k03_taxFreeOrNot, k03_item, k03_df.format(k03_price[k03_i]),
				k03_df.format(k03_count[k03_i]), k03_df.format(k03_price[k03_i] * k03_count[k03_i]));				
		k03_lineCount++; 																							
		if (k03_lineCount % 5 == 0) { 																				
			System.out.println("-----------------------------------------"); 										
		}
	}
	
	public static String cutItem(String k03_item) throws UnsupportedEncodingException {
		String k03_eachWord;															
		int k03_bytes, k03_widthCount = 0, k03_cutIndex = 14;							
		for (int k03_j = 0; k03_j < k03_item.length(); k03_j++) { 								
			k03_eachWord = Character.toString(k03_item.charAt(k03_j));	
			k03_bytes = k03_eachWord.getBytes("MS949").length;			
			if (k03_bytes == 2) {														// 한글일 경우 1글자가 2바이트다. 해당 조건은 한글일 때를 걸러내는 것이다.
				k03_widthCount += 2;													// 칸을 셀 때 2칸을 차지하기 때문에 한글은 2자를 더해준다.
			} else if (k03_bytes == 1) {												// 한글이 아닌 글자는 1바이트다. 한글이 아닐 때를 걸러준다.
				k03_widthCount += 1;													// 칸을 셀 때 한글이 아닐 경우 1칸을 차지한다.
			}
			if (k03_widthCount >= 14) {													// 만약 상품의 바이트 합계가 18바이트를 넘어간다면
				k03_cutIndex = k03_j;													// 상품 이름의 몇 번째 글자에서 18바이트를 넘어갔는지 변수에 할당하고
				break;																	// if문을 빠져나온다
			}
		}
		k03_item = k03_item.substring(0, k03_cutIndex+1);								// 0번째 문자부터 18바이트 문자 까지로 아이템 이름을 자른다.
		int k03_width = widthChecker(k03_item);											// 자른 아이템명을 다시 칸 수를 체크하는 함수에 넣고
		if (k03_width < 16) {															// 18칸에 공백을 모두 채우기 위해 칸 수가 19칸이 안 될 경우에는
			for (int k03_i = 0; k03_i < 16 - k03_width; k03_i++) {						// 다시 순회하면서 공백을 채운다.
				k03_item = k03_item + " ";												// 마지막 글자가 한글이어서 공백이 부족한 경우가 있기 때문에
			}																			// 이 과정이 필요하다.
		}
		return k03_item;																// cutItem함수는 아이템명을 반환한다.
	}
	
	public static int widthChecker(String k03_eachWord) throws UnsupportedEncodingException {
		String[] k03_wordArr = k03_eachWord.split("");									// 인자로 받은 문자열을 각 글자로 쪼개어 배열에 넣는다.
		int k03_bytes, k03_widthCount = 0;												// 바이트를 체크할 변수와 칸수를 셀 변수를 선언한다.
		for (String k03_word : k03_wordArr) {											// 단어 배열에서 각 단어를 순회한다.		
			k03_bytes = k03_word.getBytes("MS949").length;								// 각 글자가 몇 바이트인지 구해서 bytes라는 변수에 할당한다
			if (k03_bytes == 2) {														// 각 단어가 2바이트라면 한글이다.
				k03_widthCount += 2;													// 한글일 경우 2칸을 차지한다.
			} else if (k03_bytes == 1) {												// 각 단어가 1바이트라면 한글 이외의 문자다.
				k03_widthCount += 1;													// 한글 외의 문자는 1칸을 더해준다.
			}
		}
		return k03_widthCount;															// 해당 문자열이 몇 칸을 차지하는지 반환하는 함수다.
	}
	
	public static int tax(int k03_price) {												// 세금을 계산하는 함수다.
		int k03_tax = 0;																// 세금을 0원으로 초기화한다.
		if (k03_price / 11.0 - (int)(k03_price / 11.0) > 0) {							// 세금은 소비자가를 11로 나누었을 때 소수점이 존재하면
			k03_tax = (int)(k03_price / 11.0) + 1;										// 올림하여 1원을 올려 받는다.
		} else {																		// 세금 계산시 소수점이 없는 금액이 나온다면
			k03_tax = (int)(k03_price / 11.0);											// 소비자가를 11로 나눈 금액이 세금이다.
		}
		return k03_tax;																	// 세금을 결과값으로 반환한다.
	}
	
	public static void TotalPrint() {
		/* 결제 금액 영역 */
		String k03_cardName, k03_payment;
		k03_cardName = "0012 KEB 하나";																					// 카드 이름
		k03_payment = "일시불";																							// 결제 방식
		int k03_taxfreeSum = 0, k03_taxItemSum = 0, k03_tax = 0, k03_priceSum = 0, k03_paymentPrice = 0;				// 계산할 변수를 저장
		for (int k03_i = 0; k03_i < k03_itemName.length; k03_i++) {														// 면세유무 배열을 순회함
			if (k03_taxfree[k03_i] == true) {																			// 면세 아이템이면
				k03_taxfreeSum += k03_price[k03_i] * k03_count[k03_i];													// 면세 아이템 총계에 더함
			} else if (k03_taxfree[k03_i] == false) {																	// 과세 아이템이면
				k03_taxItemSum += k03_price[k03_i] * k03_count[k03_i];													// 과세 아이템 총계에 더함
			}
		}

		k03_tax = tax(k03_taxItemSum);																					// tax함수에 과세물품 합계를 넣어서 세금을 구함
		k03_priceSum = k03_taxItemSum + k03_taxfreeSum;																	// 총계는 면세물품, 과세물품, 부가세 합계
		if (k03_payment.equals("일시불")) {																				// 할부가 일시불이면
			k03_paymentPrice = k03_priceSum;																			// 총계가 적힘
		} else if (k03_payment.equals("3개월")) {																		// 할부가 3개월이면
			k03_paymentPrice = k03_priceSum / 3;																		// 1/3가격이 적힘
		} else if (k03_payment.equals("6개월")) {																		// 할부가 6개월이면
			k03_paymentPrice = k03_priceSum / 6;																		// 1/6가격이 적힘
		}

		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###");
		Calendar k03_cal = Calendar.getInstance();
		System.out.println();
		System.out.printf("%15s%-8s%13s\n", " ", "총 품목 수량", k03_df.format(k03_itemName.length));						// 물건 갯수
		System.out.printf("%12s%-11s%14s\n", " ", "(*)면 세  물 품", k03_df.format(k03_taxfreeSum));						// 면세 물품 가격 총계
		System.out.printf("%15s%-8s%14s\n", " ", "과 세  물 품", k03_df.format(k03_taxItemSum - k03_tax));				// 과세 물품 세전 가격 총계
		System.out.printf("%15s%-8s%14s\n", " ", "부   가   세", k03_df.format(k03_tax));									// 과세 물품 부가세 총계
		System.out.printf("%15s%-8s%14s\n", " ", "합        계", k03_df.format(k03_priceSum));							// 위의 모든 값을 더한 가격
		System.out.printf("%s%24s\n", "결 제 대 상 금 액", k03_df.format(k03_priceSum));									// 합계와 동일
		System.out.println("-----------------------------------------");
		System.out.printf("%s%28s\n", k03_cardName, "541707**0484/35860658");											// 카드 이름 인자로 받음
		System.out.printf("%s%7s%19s\n", "카드결제(IC)", " ", k03_payment + " / " + k03_df.format(k03_paymentPrice));		// 결제방식과 가격
		System.out.println("-----------------------------------------");

		/* 영수증 하단 영역 */
		String k03_customerName, k03_carNumber, k03_casher;																// 필요한 변수 선언
		k03_customerName = "홍길동"; 																						// 고객 이름
		k03_carNumber = "123로9759"; 																					// 차 번호
		k03_casher = "084599 양양양"; 																					// 캐셔 이름
		int havePoint = 5473; 																							// 기존 포인트
		String k03_nameFront, k03_nameBack; 																			// 이름을 가리기 위한 변수 선언
		int k03_point = 164, k03_newPoint = 0; 																			// 포인트 계산 변수 선언
		k03_nameFront = k03_customerName.substring(0, 1); 																// 이름의 첫 글자
		k03_nameBack = k03_customerName.substring(2); 																	// 이름의 마지막 글자
		k03_customerName = k03_nameFront + "*" + k03_nameBack; 															// 첫 글자와 마지막 글자 사이에는 별을 넣어 가린다.

		k03_newPoint = k03_point + havePoint; 																			// 기존 포인트에 새로 쌓은 포인트가 추가된다.
		System.out.printf("%22s\n", "[신세계포인트 적립]");
		System.out.printf("%s%s\n", k03_customerName, " 고객님의 포인트 현황입니다.");										// 고객 이름
		System.out.printf("%s%7s%12s%8s\n", "금회발생포인트", " ", "9350**9995", k03_df.format(164));						// 새로 쌓은 포인트
		System.out.printf("%s%16s(%7s)\n", "누계(가용)포인트", k03_df.format(k03_newPoint), k03_df.format(havePoint));		// 기존 포인트와 새 포인트가 더해진 금액
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");

		SimpleDateFormat k03_sds = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");											// 날짜 출력 포멧 지정
		String k03_currentDateSecond = k03_sds.format(k03_cal.getTime());												// 초까지 출력하는 날짜 형식
		SimpleDateFormat k03_sdd = new SimpleDateFormat("YYYYMMdd");													// 일까지만 출력하는 날짜 형식
		String k03_currentDate = k03_sdd.format(k03_cal.getTime());														// 현재 날짜를 불러옴
		k03_carNumber = k03_carNumber.substring(0, k03_carNumber.length() - 4) + "****";								// 차번호 뒷자리를 가려줌
		k03_casher = k03_casher.substring(0, k03_casher.length() - 2) + "OO";											// 캐셔 이름을 가려줌
		System.out.println("-----------------------------------------");												// 구분선 출력
		System.out.printf("%3s%-30s\n", " ", "구매금액기준 무료주차시간 자동부여");												// 안내문 출력
		System.out.printf("%s :%30s\n", "차량번호", k03_carNumber);														// 차번호
		System.out.printf("%s :%31s\n", "입차시간", k03_currentDateSecond);												// 입차 시간은 현재 시스템시간으로 출력
		System.out.println("-----------------------------------------");												// 구분선 출력
		System.out.printf("%s:%s%25s\n", "캐셔", k03_casher, 1150);														// 캐셔 이름
		System.out.printf("%6s%s%s\n", " ", k03_currentDate, "/00119861/00164980/31");	
	}
}
