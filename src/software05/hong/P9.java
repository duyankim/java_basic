package software05.hong;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static String[] k03_itemName = { "애호박", "시금치",
			"느타리버섯", "파프리카", "국산마늘쫑", "단호박", "미역줄기", "상주오이", "국산햇양파", "국산바지락", "왕새우", "건조코다리", "가평맷돌순두부",
			"표고버섯", "가래떡", "떡국떡", "아귀채", "꽃보다오징어", "각종진미채", "남해볶음용멸치", "국물용다시멸치", "국산참기름", "국산들기름", "김천통살호두",
			"최고급뿌리다시마", "피코크 파주장단콩순두부", "CJ 유자샐러드소스250g", "(990)팽이버섯(봉)", "롯데 ABC초콜릿 밀크165G", "대추방울토마토", "아보카도",
			"깐마늘(500g/봉)", "햇곱창김", "예천찰기장", "제천찰수수", "강원도서리태", "델몬트바나나", "부산대저토마토", "딸기" }; // 구매한 상품 목록

	public static int[] k03_price = { 31800, 1000, 1000, 2000, 2000, 2500, 2000, 2000, 5000, 4000, 8000,
			10000, 10000, 3000, 3000, 9990, 5000, 8000, 13000, 8000, 8000, 12000, 18000, 15000, 20000, 10000, 20000,
			10000, 10000, 10000, 3000, 26000, 10000, 5000, 100, 5000, 4500, 3400, 900 }; // 구매한 상품 가격 목록

	public static int[] k03_count = { 1, 3, 1, 1, 10, 1, 1, 2, 1, 1, 1, 5, 1, 8, 1, 6, 2, 1, 4, 1, 1, 1, 2,
			1, 3, 1, 1, 1, 1, 1, 7, 8, 1, 20, 1, 1, 1, 1, 1 }; // 수량

	public static boolean[] k03_taxfree = { true, false, false, false, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true }; // 면세유무

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 영수증 출력3 2021-04-12 kopo03 김도연

		/* 필요한 클래스 불러오기 */
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###");					// 3자리마다 콤마 찍도록 형식 지정
		Calendar k03_cal = Calendar.getInstance();											// calendar클래스에서 인스턴스 생성함

		/* 영수증 상단 정보 출력 */
		String k03_store, k03_address, k03_pos, k03_manager;								// 변수 선언
		k03_pos = "POS:0011-9861";															// 포스기 번호
		k03_store = "이마트 죽전점 (031)888-1234";											// 지점명 및 전화번호
		k03_manager = "206-86-50913 강희석";												// 매니저 성명
		k03_address = "용인 수지구 포은대로 552";											// 가게 주소
		
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");				// 날짜 출력 형식 지정
		String k03_currentDateMin = k03_sdf.format(k03_cal.getTime());						// 현재 날짜 불러옴
		System.out.printf("%12s%s\n", " ", k03_store);										// 지점명 프린트
		System.out.printf("%8s%4s%s\n", "emart", " ", k03_manager);							// 매니저 성명 프린트
		System.out.printf("%12s%s\n", " ", k03_address);									// 주소 출력
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");						// 안내사항 출력
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)"); 					// 안내사항 출력
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");					// 안내사항 출력
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");				// 안내사항 출력
		System.out.println();																// 줄바꿈
		System.out.printf("%s%s%18s\n", "[구 매]", k03_currentDateMin, k03_pos);			// 현재 날짜, 포스기 번호 프린트

		/* 구매 물품 리스트 출력 */
		System.out.println("-----------------------------------------"); 								// 구분선 출력
		System.out.printf("%1s%-13.13s%6.6s%3.3s%9.9s\n", " ", "상 품 명", "단 가", "수량", "금 액"); 	// 표의 상단을 작성
		System.out.println("-----------------------------------------"); 								// 구분선 출력

		String k03_taxFreeOrNot;																		// 세금 변수 선언
		int k03_lineCount = 0;																			// 5줄마다 라인 만들기위한 변수 선언

		/* 상품 목록 한 줄씩 프린트한다 */
		for (int k03_i = 0; k03_i < k03_itemName.length; k03_i++) {							// 상품 목록 반복 순회
			String k03_item = k03_itemName[k03_i] + "              ";						// 각 상품 이름을 변수에 저장
			k03_taxFreeOrNot = k03_taxfree[k03_i] == true ? "*" : " ";						// 면세상품에 *을 붙임
			String eachWord;																// 각 글자를 넣어줄 변수를 선언한다
			int bytes, widthCount = 0, cutIndex = 14;										// byte합계를 저장할 변수를 선언한다
			for (int j = 0; j < k03_item.length(); j++) {
				eachWord = Character.toString(k03_item.charAt(j));							// 상품 이름의 각 글자를 eachWord라는 변수에 할당한다.
				bytes = eachWord.getBytes("MS949").length;									// 각 글자가 몇 바이트인지 구해서 bytes라는 변수에 할당한다
	
				if (bytes == 2) {
					widthCount += 2;
				} else if (bytes == 1) {
					widthCount += 1;														// 물품 이름의 각 문자 바이트를 합계한다.
				}
				if (widthCount >= 14) {														// 만약 상품의 바이트 합계가 18바이트를 넘어간다면
					cutIndex = j;															// 상품 이름의 몇 번째 글자에서 18바이트를 넘어갔는지 변수에 할당하고
					break;																	// if문을 빠져나온다
				}

			}
			k03_item = k03_item.substring(0, cutIndex+1);
			int width = widthChecker(k03_item);
			if (width < 16) {
				for (int j = 0; j < 16 - width; j++) {
					k03_item = k03_item + " ";
				}
			}

			System.out.printf("%-1s%s%10.10s%3.3s%11s\n", k03_taxFreeOrNot, k03_item, k03_df.format(k03_price[k03_i]),
					k03_df.format(k03_count[k03_i]), k03_df.format(k03_price[k03_i] * k03_count[k03_i]));// 형식에 맞게 세금, 상품이름, 가격, 수량, 총 가격 프린트

			k03_lineCount++; 																			// 상품 5개를 갯수를 셈
			if (k03_lineCount % 5 == 0) { 																// 상품 갯수가 5의 배수일 때 조건 true
				System.out.println("-----------------------------------------"); 						// 구분선 출력하기
			}
		}

		/* 결제 관련 변수 선언 */
		String k03_cardName, k03_payment;
		k03_cardName = "0012 KEB 하나";																	 // 카드 이름
		k03_payment = "일시불";																			 // 결제 방식
		int k03_taxfreeSum = 0, k03_taxItemSum = 0, k03_tax = 0, k03_priceSum = 0, k03_paymentPrice = 0; // 계산할 변수를 저장

		for (int k03_i = 0; k03_i < k03_itemName.length; k03_i++) {										// 면세유무 배열을 순회함
			if (k03_taxfree[k03_i] == true) {															// 면세 아이템이면
				k03_taxfreeSum += k03_price[k03_i] * k03_count[k03_i];									// 면세 아이템 총계에 더함
			} else if (k03_taxfree[k03_i] == false) {													// 과세 아이템이면
				k03_taxItemSum += k03_price[k03_i] * k03_count[k03_i];									// 과세 아이템 총계에 더함
			}
		}
		double k03_tax_double = k03_taxItemSum * 1.0 / 11;

		if (k03_tax_double - (int) k03_tax_double > 0) {												// 세금에 소수점이 있으면
			k03_tax = (int) k03_tax_double + 1;															// 세금을 올려주고
		} else {
			k03_tax = (int) k03_tax_double;																// 소수점이 없으면 세금은 일반적으로 10프로 세액
		}

		k03_priceSum = k03_tax + (int) (k03_tax_double * 10) + k03_taxfreeSum;							// 총계는 면세물품, 과세물품, 부가세 합계

		if (k03_payment.equals("일시불")) {																// 할부가 일시불이면
			k03_paymentPrice = k03_priceSum;															// 총계가 적힘
		} else if (k03_payment.equals("3개월")) {														// 할부가 3개월이면
			k03_paymentPrice = k03_priceSum / 3;														// 1/3가격이 적힘
		} else if (k03_payment.equals("6개월")) {														// 할부가 6개월이면
			k03_paymentPrice = k03_priceSum / 6;														// 1/6가격이 적힘
		}

		System.out.println();
		System.out.printf("%15s%-8s%13s\n", " ", "총 품목 수량", k03_df.format(k03_itemName.length));		// 물건 갯수
		System.out.printf("%12s%-11s%14s\n", " ", "(*)면 세  물 품", k03_df.format(k03_taxfreeSum));		// 면세 물품 가격 총계
		System.out.printf("%15s%-8s%14s\n", " ", "과 세  물 품", k03_df.format(k03_taxItemSum - k03_tax));	// 과세 물품 세전 가격 총계
		System.out.printf("%15s%-8s%14s\n", " ", "부   가   세", k03_df.format(k03_tax));					// 과세 물품 부가세 총계
		System.out.printf("%15s%-8s%14s\n", " ", "합        계", k03_df.format(k03_priceSum));				// 위의 모든 값을 더한 가격
		System.out.printf("%s%24s\n", "결 제 대 상 금 액", k03_df.format(k03_priceSum));					// 합계와 동일
		System.out.println("-----------------------------------------");
		System.out.printf("%s%28s\n", k03_cardName, "541707**0484/35860658");								// 카드 이름 인자로 받음
		System.out.printf("%s%7s%19s\n", "카드결제(IC)", " ", k03_payment + "/ " + k03_df.format(k03_paymentPrice));// 결제방식과 가격
		System.out.println("-----------------------------------------");

		/* 영수증 하단 영역 */
		String k03_customerName, k03_carNumber, k03_casher;													// 필요한 변수 선언
		k03_customerName = "홍길동"; 																		// 고객 이름
		k03_carNumber = "123로9759"; 																		// 차 번호
		k03_casher = "084599 양양양"; 																		// 캐셔 이름
		int havePoint = 5473; 																				// 기존 포인트
		String k03_nameFront, k03_nameBack; 																// 이름을 가리기 위한 변수 선언
		int k03_point = 164, k03_newPoint = 0; 																// 포인트 계산 변수 선언
		k03_nameFront = k03_customerName.substring(0, 1); 													// 이름의 첫 글자
		k03_nameBack = k03_customerName.substring(2); 														// 이름의 마지막 글자
		k03_customerName = k03_nameFront + "*" + k03_nameBack; 												// 첫 글자와 마지막 글자 사이에는 별을 넣어 가린다.

		k03_newPoint = k03_point + havePoint; 																			// 기존 포인트에 새로 쌓은 포인트가 추가된다.
		System.out.printf("%22s\n", "[신세계포인트 적립]");
		System.out.printf("%s%s\n", k03_customerName, " 고객님의 포인트 현황입니다.");									// 고객 이름
		System.out.printf("%s%7s%12s%8s\n", "금회발생포인트", " ", "9350**9995", k03_df.format(164));					// 새로 쌓은 포인트
		System.out.printf("%s%16s(%7s)\n", "누계(가용)포인트", k03_df.format(k03_newPoint), k03_df.format(havePoint));	// 기존 포인트와 새 포인트가 더해진 금액
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");

		SimpleDateFormat k03_sds = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");											// 날짜 출력 포멧 지정
		String k03_currentDateSecond = k03_sds.format(k03_cal.getTime());												// 초까지 출력하는 날짜 형식
		SimpleDateFormat k03_sdd = new SimpleDateFormat("YYYYMMdd");													// 일까지만 출력하는 날짜 형식
		String k03_currentDate = k03_sdd.format(k03_cal.getTime());													ㅁ	// 현재 날짜를 불러옴
		k03_carNumber = k03_carNumber.substring(0, k03_carNumber.length() - 4) + "****";								// 차번호 뒷자리를 가려줌
		k03_casher = k03_casher.substring(0, k03_casher.length() - 2) + "OO";											// 캐셔 이름을 가려줌
		System.out.println("-----------------------------------------");
		System.out.printf("%3s%-30s\n", " ", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s :%30s\n", "차량번호", k03_carNumber);														// 차번호
		System.out.printf("%s :%31s\n", "입차시간", k03_currentDateSecond);												// 입차 시간은 현재 시스템시간으로 출력
		System.out.println("-----------------------------------------");
		System.out.printf("%s:%s%25s\n", "캐셔", k03_casher, 1150);														// 캐셔 이름
		System.out.printf("%6s%s%s\n", " ", k03_currentDate, "/00119861/00164980/31");									// 현재 날짜
	}

	public static int widthChecker(String eachWord) throws UnsupportedEncodingException {

		String[] wordArr = eachWord.split("");
		int bytes, widthCount = 0;

		for (String word : wordArr) {
			
			bytes = word.getBytes("MS949").length;												// 각 글자가 몇 바이트인지 구해서 bytes라는 변수에 할당한다

			if (bytes == 2) {
				widthCount += 2;
			} else if (bytes == 1) {
				widthCount += 1;																// 물품 이름의 각 문자 바이트를 합계한다.
			}
		}
		return widthCount;
	}

}