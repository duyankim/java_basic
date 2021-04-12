package software04.hong;

import java.text.DecimalFormat;

public class P28 {

	public static void main(String[] args) {
		// 칸 맞춰 인쇄 2021-04-02 kopo03 김도연

		String k03_item = "사과"; // string 변수 선언하는 선언부이다.
		int k03_unit_price = 5000; // 단가를 변수에 할당하면서 선언하는 선언부이다.
		int k03_num = 500; // 변수에 할당하면서 선언하는 선언부이다.
		int k03_total = 0; // 변수에 할당하면서 선언하는 선언부이다.

		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // 3자리마다 콤마 찍는 형식 지정하는 DecimalFormat이다.

		// 헤더 찍기
		System.out.printf("=======================================================\n"); // 구분선을 프린트한다.
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");
		// %8 : 8칸을 할애하라 .8s : 8글자까지만 출력해라 10글자가 넘어도 8글자까지만 보여달라.
		System.out.printf("=======================================================\n");// 구분선을 프린트한다.

		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", // 제목은 8칸이었던 것을 여기선 10칸으로 한다. 수량은 우측정렬이 된다.
				k03_item, df.format(k03_unit_price), df.format(k03_num), df.format(k03_unit_price * k03_num));
		System.out.printf("=======================================================\n"); // 구분선을 프린트한다.
	}

}
