package software04;

import java.text.DecimalFormat;

public class P28 {

	public static void main(String[] args) {
		// 칸 맞춰 인쇄 2021-04-02
		
		String item = "사과"; // string 변수 선언
		int unit_price = 5000; // 단가
		int num = 500; //변수 초기화 및 선언
		int total = 0; //변수 추기화 및 선언
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); //3자리마다 콤마 찍는 형식 지정
		
		//헤더 찍기
		System.out.printf("=======================================================\n"); //구분선
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계"); 
		// %8 : 8칸을 할애하라 .8s : 8글자까지만 출력해라 10글자가 넘어도 8글자까지만 보여달라.
		System.out.printf("=======================================================\n"); //구분선

		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", //제목은 8칸이었던 것을 여기선 10칸으로 한다. 수량은 우측정렬이 된다.
				item, df.format(unit_price), df.format(num), df.format(unit_price * num));
		System.out.printf("=======================================================\n"); //구분선
	}

}
