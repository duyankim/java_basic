package software05.hong;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// 영수증 출력3 2021-04-12 kopo03 김도연

		String[] itemName = { "애호박", "시금치", "느타리버섯", "파프리카", "국산마늘쫑", "단호박", "미역줄기", "상주오이", "국산햇양파", "국산바지락",
				"(왕특대)자반고등어", "왕새우", "건조코다리", "가평맷돌순두부", "칼국수", "가래떡", "떡국떡", "아귀채", "꽃보다오징어", "각종진미채", "남해볶음용멸치",
				"국물용다시멸치", "국산참기름", "국산들기름", "김천통살호두", "최고급뿌리다시마", "햇곱창김", "예천찰기장", "제천찰수수", "강원도서리태", "델몬트바나나",
				"부산대저토마토", "딸기", "대추방울토마토", "아보카도" };
		int[] price = { 1000, 1000, 1000, 2000, 2000, 2500, 2000, 2000, 5000, 4000, 8000, 10000, 10000, 3000, 3000,
				3000, 5000, 8000, 13000, 8000, 8000, 12000, 18000, 15000, 20000, 10000, 20000, 10000, 10000, 10000,
				3000, 26000, 10000, 5000, 10000 };
		int[] count = { 1, 3, 1, 1, 10, 1, 1, 2, 1, 1, 1, 5, 1, 8, 1, 6, 1, 2, 1, 4, 1, 1, 1, 2, 1, 3, 1, 1, 1, 1, 1, 7,
				8, 1, 20 }; // 수량
		boolean[] taxfree = { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true }; // 면세유무

		int priceSum;
		/* 영수증 출력 */
		printTop();
		printList(itemName, count, price, taxfree);
		priceSum = printPrice(count, price, taxfree, "일시불");
		printPoint("곽두팔", 5473, priceSum);
		printBottom();
	}

	public static void printList(String[] itemName, int[] count, int[] price, boolean[] taxfree) {
		System.out.println("----------------------------------------------");
		System.out.printf("%3s%-15.15s%6.6s%4.4s%8.8s\n", " ", "상 품 명", "단 가", "수량", "금 액");
		System.out.println("----------------------------------------------");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		String tax;
		
		for (int i = 0; i < itemName.length; i++) {
			int bytes = 0;
			String item = itemName[i];
			tax = taxfree[i] == true ? "*" : " ";

			try {
				bytes = item.getBytes("EUC-KR").length;
				//EUC-KR 기준으로 문자열의 byte값을 구한다.
				//UTF-8의 한글 byte 는 1글자당 3byte이므로 강제로 2byte로 설정한다.
				item = itemName[i].substring(0, 14);
				//문자열을 14자리까지만 잘라준다. 
			} catch(Exception e) {
				//문자열이 14자리가 되지 않아 에러가 생길 때 에러 메세지를 출력하지 않고 진행한다.
			}
			for(int j = 0; j <= 20 - bytes; j++) {
				//빈칸을 20칸으로 설정했고, 한글 바이트 기준 10자이기 때문에 아래 printf에서 10칸까지 허용한다.

	            item = item + " ";
	            //20바이트가 안되면 반복문을 돌며 공백을 채운다.
			}
			System.out.printf("%-3s%10s%7s%4s%11s\n", tax, item, df.format(price[i]), df.format(count[i]), df.format(price[i] * count[i]));
		}
	}
	
	public static int printPrice(int[] count, int[] price, boolean[] taxfree, String payment) {
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		
		int taxfreeSum = 0, taxItemSum = 0, tax = 0, priceSum = 0, paymentPrice=0;
		for (int i=0; i<taxfree.length; i++) {
			if (taxfree[i] == true) {
				taxfreeSum += price[i] * count[i];
			} else if (taxfree[i] == false) {
				taxItemSum += price[i] * count[i];
			}
		}
		if (taxItemSum /100 - (int)taxItemSum /100 > 0) {
			tax = taxItemSum /100 + 1;
		} else {
			tax = taxItemSum /100 ;
		}
		priceSum = tax + taxItemSum + taxfreeSum;
		
		if (payment.equals("일시불")) {
			paymentPrice = priceSum;
		} else if (payment.equals("3개월")) {
			paymentPrice = priceSum / 3;
		} else if (payment.equals("6개월")) {
			paymentPrice = priceSum / 6;
		}
		System.out.println();
		System.out.printf("%15s%-11s%15s\n", " ", "총 품목 수량", df.format(count.length));
		System.out.printf("%12s%-14s%16s\n", " ", "(*)면 세  물 품", df.format(taxfreeSum));
		System.out.printf("%15s%-11s%16s\n", " ", "과 세  물 품", df.format(taxItemSum));
		System.out.printf("%15s%-11s%17s\n", " ", "부   가   세", df.format(tax));
		System.out.printf("%15s%-11s%18s\n", " ", "합        계", df.format(priceSum));
		System.out.printf("%s%29s\n", "결 제 대 상 금 액", df.format(priceSum));
		System.out.println("----------------------------------------------");
		System.out.printf("%s%33s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s%21s%s%7s\n", "카드결제(IC)", payment, " / ", df.format(paymentPrice));
		System.out.println("----------------------------------------------");
		return priceSum;
	}
	
	public static void printPoint(String name, int havePoint, int priceSum) {
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		String nameFront, nameBack;
		int point=0, newPoint=0;
		
		nameFront = name.substring(0,1);
		nameBack = name.substring(2);
		name = nameFront + "*" + nameBack;
		point = (int)(priceSum / 1000);
		newPoint = point + havePoint;
		
		System.out.printf("%27s\n", "[신세계포인트 적립]");
		System.out.printf("%s%s\n", name," 고객님의 포인트 현황입니다.");
		System.out.printf("%s%22s%10s\n", "금회발생포인트", "9350**9995", df.format(point));
		System.out.printf("%s%19s(%9s)\n", "누계(가용)포인트", df.format(newPoint), df.format(havePoint));
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다");
	}

	public static void printTop() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		String currentDateMin = sdf.format(cal.getTime());
		
		System.out.printf("%18s%s\n", " ", "이마트 죽전점 (031)888-1234");
		System.out.printf("%18s%s\n", " ", "206-86-50913 강희석");
		System.out.printf("%18s%s\n", " ", "용인 수지구 포은대로 552");

		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
		System.out.printf("%s%s%23s\n", "[구 매]", currentDateMin, "POS:0011-9861");
	}
	
	public static void printBottom() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sds = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String currentDateSecond = sds.format(cal.getTime());
		SimpleDateFormat sdd = new SimpleDateFormat("YYYYMMdd");
		String currentDate = sdd.format(cal.getTime());
		
		System.out.println("----------------------------------------------");
		System.out.printf("%10s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s :%35s\n", "차량번호", "12로****");
		System.out.printf("%s :%36s\n", "입차시간", currentDateSecond);
		System.out.println("----------------------------------------------");
		System.out.printf("%s:%s%30s\n", "캐셔", "084599 양00", 1150);
		System.out.printf("%s%s\n", currentDate, "/00119861/00164980/31");
	}
}