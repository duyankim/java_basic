package software04.hong;

public class P22 {

	public static void main(String[] args) {
		// 숫자 읽기 2021-04-02 kopo03 김도연
		String[] k03_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 한글로 숫자읽기 배열

		for (int k03_i = 0; k03_i < 101; k03_i++) { // 0부처 100까지 반복하는 반복문이다.

			if (k03_i >= 0 && k03_i < 10) { // 일의 자리는 영부터 구까지 있다
				System.out.printf("일의 자리 : %s\n", k03_units[k03_i]); // 일의 자리를 반복해서 출력해본다
			} else if (k03_i >= 10 && k03_i < 100) { // 십의 자리는 10이상 99보다 작을때 해당된다
				int k03_10, k03_0; // 변수 선언을 하는 선언부이다.

				k03_10 = k03_i / 10; // 10으로 나누어서 십의 자리만 몫으로 내기
				k03_0 = k03_i % 10; // 10으로 나누어서 일의 자리만 나머지로 받기

				if (k03_0 == 0) {// 만약 일의자리가 0이라면 일의자리를 읽을 필요가 없다
					System.out.printf("십의자리 : %s십\n", k03_units[k03_10]); // 십의자리만 읽는다
				} else { // 일의 자리가 0이 아닐 때
					System.out.printf("십의자리 : %s십%s\n", k03_units[k03_10], k03_units[k03_0]); // 십의자리와 일의자리를 읽는다.
				}
			} else
				System.out.printf("==> %d\n", k03_i); // 마지막으로 100을 출력
		}
	}

}