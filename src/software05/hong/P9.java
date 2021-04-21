package software05.hong;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// 영수증 출력3 2021-04-12 kopo03 김도연

		String[] k03_itemName = { "애호박", "시금치", "느타리버섯", "파프리카", "국산마늘쫑", "단호박", 
				"미역줄기", "상주오이", "국산햇양파", "국산바지락", "(왕특대)자반고등어", "왕새우", 
				"건조코다리", "가평맷돌순두부", "칼국수", "가래떡", "떡국떡", "아귀채", "꽃보다오징어", 
				"각종진미채", "남해볶음용멸치", "국물용다시멸치", "국산참기름", "국산들기름", "김천통살호두", 
				"최고급뿌리다시마", "햇곱창김", "예천찰기장", "제천찰수수", "강원도서리태", "델몬트바나나",
				"부산대저토마토", "딸기", "대추방울토마토", "아보카도" }; //구매한 상품 목록
		int[] k03_price = { 1000, 1000, 1000, 2000, 2000, 2500, 2000, 2000, 5000, 4000, 8000, 10000, 10000, 3000, 3000,
				3000, 5000, 8000, 13000, 8000, 8000, 12000, 18000, 15000, 20000, 10000, 20000, 10000, 10000, 10000,
				3000, 26000, 10000, 5000, 10000 }; //구매한 상품 가격 목록
		int[] k03_count = { 1, 3, 1, 1, 10, 1, 1, 2, 1, 1, 1, 5, 1, 8, 1, 6, 1, 2, 1, 4, 1, 1, 1, 2, 1, 3, 1, 1, 1, 1, 1, 7,
				8, 1, 20 }; // 수량
		boolean[] k03_taxfree = { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true }; // 면세유무

		int k03_priceSum; // 가격 합계 변수에 선언
		String k03_store, k03_address, k03_pos, k03_manager, k03_customerName, k03_cardName, k03_payment, k03_carNumber, k03_casher; 
		// 함수에 파라미터로 전달할 변수 선언
		k03_pos = "POS:0011-9861"; //포스기 번호
		k03_store = "이마트 죽전점 (031)888-1234"; //지점명 및 전화번호
		k03_manager = "206-86-50913 황덕배"; //매니저 성명
		k03_address = "용인 수지구 포은대로 552"; //가게 주소
		k03_customerName = "곽두팔"; //고객 이름
		k03_cardName = "0012 KEB 하나"; //카드 이름
		k03_payment = "일시불"; //결제 방식
		k03_carNumber = "123로9759"; //차 번호
		k03_casher = "084599 김상배"; //캐셔 이름
		
		/* 영수증 출력 */
		printTop(k03_store, k03_manager, k03_address, k03_pos); //영수증 상단 정보 출력 클래스
		printList(k03_itemName, k03_count, k03_price, k03_taxfree); // 영수증 상품 목록 출력 클래스
		k03_priceSum = printPrice(k03_count, k03_price, k03_taxfree, k03_cardName, k03_payment); //가격 계산 및 출력 클래스
		printPoint(k03_customerName, 5473, k03_priceSum); //포인트 계산 클래스
		printBottom(k03_carNumber, k03_casher); //영수증 하단 정보 출력 클래스
	}

	public static void printTop(String store, String manager, String address, String pos) { //지점명, 매니저 이름, 주소, 포스기번호
		Calendar k03_cal = Calendar.getInstance(); //calendar클래스에서 인스턴스 생성함
		SimpleDateFormat k03_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm"); //날짜 출력 형식 지정
		String k03_currentDateMin = k03_sdf.format(k03_cal.getTime()); //현재 날짜 불러옴
		
		System.out.printf("%18s%s\n", " ", store); // 지점명 프린트
		System.out.printf("%11s%7s%s\n", "emart", " ", manager); //매니저 성명 프린트
		System.out.printf("%18s%s\n", " ", address);

		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
		System.out.printf("%s%s%23s\n", "[구 매]", k03_currentDateMin, pos); //현재 날짜, 포스기 번호 프린트
	}
	
	public static void printList(String[] itemName, int[] count, int[] price, boolean[] taxfree) {
		System.out.println("----------------------------------------------");
		System.out.printf("%3s%-15.15s%6.6s%4.4s%8.8s\n", " ", "상 품 명", "단 가", "수량", "금 액");
		System.out.println("----------------------------------------------");
		
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###"); //3자리마다 콤마 찍도록 형식 지정
		String k03_tax; //세금 변수 선언
		
		for (int k03_i = 0; k03_i < itemName.length; k03_i++) { //상품 목록 반복 순회
			int k03_bytes = 0; //바이트를 셀 변수를 선언
			String k03_item = itemName[k03_i]; //각 상품 이름을 변수에 저장
			k03_tax = taxfree[k03_i] == true ? "*" : " "; //면세물품에 *을 붙임

			try { 
				k03_bytes = k03_item.getBytes("EUC-KR").length;
				//EUC-KR 기준으로 문자열의 byte값을 구함
				//UTF-8의 한글 byte 는 1글자당 3byte이므로 강제로 2byte로 설정함
				k03_item = itemName[k03_i].substring(0, 14);
				//문자열을 14자리까지만 잘라줌
			} catch(Exception e) {
				//문자열이 14자리가 되지 않아 에러가 생길 때 에러 메세지를 출력하지 않고 진행
			}
			for(int k03_j = 0; k03_j <= 20 - k03_bytes; k03_j++) {
				//빈칸을 20칸으로 설정했고, 한글 바이트 기준 10자이기 때문에 아래 printf에서 10칸까지 허용

	            k03_item = k03_item + " ";
	            //20바이트가 안되면 반복문을 돌며 공백을 채움
			}
			System.out.printf("%-3s%10s%7s%4s%11s\n", k03_tax, k03_item, k03_df.format(price[k03_i]), k03_df.format(count[k03_i]), k03_df.format(price[k03_i] * count[k03_i]));
			//형식에 맞게 세금, 상품이름, 가격, 수량, 총 가격 프린트
		}
	}
	
	public static int printPrice(int[] count, int[] price, boolean[] taxfree, String cardName, String payment) { // 수량, 가격, 면세유무, 카드이름, 지불방식 인자 받음
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###"); //형식에 맞게 3자리마다 콤마
		
		int k03_taxfreeSum = 0, k03_taxItemSum = 0, k03_tax = 0, k03_priceSum = 0, k03_paymentPrice=0; //계산할 변수를 저장
		for (int k03_i=0; k03_i<taxfree.length; k03_i++) { //면세유무 배열을 순회함
			if (taxfree[k03_i] == true) { //면세 아이템이면
				k03_taxfreeSum += price[k03_i] * count[k03_i]; //면세 아이템 총계에 더함
			} else if (taxfree[k03_i] == false) { //과세 아이템이면
				k03_taxItemSum += price[k03_i] * count[k03_i]; //과세 아이템 총계에 더함
			}
		}
		if ((k03_taxItemSum /11) - (int)(k03_taxItemSum /11) > 0) { //과세 아이템 총계에 소수점이 있으면
			k03_tax = (int) Math.round(k03_taxItemSum /11); //세금을 올려주고
		} else {
			k03_tax = k03_taxItemSum /11 ; //소수점이 없으면 세금 일반적으로 10프로 세액
		}
		k03_priceSum = k03_tax + (int)(k03_taxItemSum / 11 * 10) + k03_taxfreeSum; //총계는 면세물품, 과세물품, 부가세 합계
		
		if (payment.equals("일시불")) { //할부가 일시불이면
			k03_paymentPrice = k03_priceSum; //총계가 적힘
		} else if (payment.equals("3개월")) { //할부가 3개월이면
			k03_paymentPrice = k03_priceSum / 3; // 1/3가격이 적힘
		} else if (payment.equals("6개월")) { //할부가 6개월이면
			k03_paymentPrice = k03_priceSum / 6; // 1/6가격이 적힘
		}
		System.out.println();
		System.out.printf("%15s%-11s%15s\n", " ", "총 품목 수량", k03_df.format(count.length)); //물건 갯수
		System.out.printf("%12s%-14s%16s\n", " ", "(*)면 세  물 품", k03_df.format(k03_taxfreeSum)); //면세 물품 가격 총계
		System.out.printf("%15s%-11s%16s\n", " ", "과 세  물 품", k03_df.format(k03_taxItemSum)); // 과세 물품 세전 가격 총계
		System.out.printf("%15s%-11s%17s\n", " ", "부   가   세", k03_df.format(k03_tax)); //과세 물품 부가세 총계
		System.out.printf("%15s%-11s%18s\n", " ", "합        계", k03_df.format(k03_priceSum)); //위의 모든 값을 더한 가격
		System.out.printf("%s%29s\n", "결 제 대 상 금 액", k03_df.format(k03_priceSum)); //합계와 동일
		System.out.println("----------------------------------------------");
		System.out.printf("%s%33s\n", cardName, "541707**0484/35860658"); //카드 이름 인자로 받음
		System.out.printf("%s%21s%s%7s\n", "카드결제(IC)", payment, " / ", k03_df.format(k03_paymentPrice)); //결제방식과 가격
		System.out.println("----------------------------------------------");
		return k03_priceSum;
	}
	
	public static void printPoint(String name, int havePoint, int priceSum) { //고객이름, 쌓은 포인트, 금회 발생된 포인트
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###"); //3자리마다 콤마 형식 지정
		String k03_nameFront, k03_nameBack; //이름을 가리기 위한 변수 선언
		int k03_point=0, k03_newPoint=0; //포인트 계산 변수 선언
		
		k03_nameFront = name.substring(0,1); //이름의 첫 글자
		k03_nameBack = name.substring(2); //이름의 마지막 글자
		name = k03_nameFront + "*" + k03_nameBack; //첫 글자와 마지막 글자 사이에는 별을 넣어 가린다.
		k03_point = (int)(priceSum / 1000); //가격의 0.01프로가 포인트로 적립된다.
		k03_newPoint = k03_point + havePoint; //기존 포인트에 새로 쌓은 포인트가 추가된다.
		
		System.out.printf("%25s\n", "[신세계포인트 적립]");
		System.out.printf("%s%s\n", name," 고객님의 포인트 현황입니다."); //고객 이름
		System.out.printf("%s%22s%10s\n", "금회발생포인트", "9350**9995", k03_df.format(k03_point)); // 새로 쌓은 포인트
		System.out.printf("%s%19s(%9s)\n", "누계(가용)포인트", k03_df.format(k03_newPoint), k03_df.format(havePoint)); //기존 포인트와 새 포인트가 더해진 금액
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다");
	}

	
	public static void printBottom(String carNum, String casher) { //차 번호와 캐셔 이름
		Calendar k03_cal = Calendar.getInstance(); //캘린더 클래스에서 인스턴스 받음
		SimpleDateFormat k03_sds = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //날짜 출력 포멧 지정
		String k03_currentDateSecond = k03_sds.format(k03_cal.getTime()); //초까지 출력하는 날짜 형식
		SimpleDateFormat k03_sdd = new SimpleDateFormat("YYYYMMdd"); //일까지만 출력하는 날짜 형식
		String k03_currentDate = k03_sdd.format(k03_cal.getTime());//현재 날짜를 불러옴
		
		carNum = carNum.substring(0, carNum.length()-4) + "****"; //차번호 뒷자리를 가려줌
		casher = casher.substring(0, casher.length()-2) + "OO"; //캐셔 이름을 가려줌
		
		System.out.println("----------------------------------------------");
		System.out.printf("%10s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s :%35s\n", "차량번호", carNum); //차번호
		System.out.printf("%s :%36s\n", "입차시간", k03_currentDateSecond); //입차 시간은 현재 시스템시간으로 출력
		System.out.println("----------------------------------------------");
		System.out.printf("%s:%s%30s\n", "캐셔", casher , 1150); //캐셔 이름
		System.out.printf("%s%s\n", k03_currentDate, "/00119861/00164980/31"); //현재 날짜
	}
}