package software05.hong;

public class P5 {

	public static void main(String[] args) {
		// 구구단인쇄2 2021-04-12 kopo03 김도연

		for (int k03_i = 1; k03_i < 4; k03_i++) {// 1, 2, 3까지 반복하기 위한 반복문이다.
			System.out.printf("************ ************ ************\n", k03_i); // 구분선을 printf한다.
			System.out.printf(" 구구단 %d단     구구단 %d단     구구단 %d단\n", k03_i, k03_i + 3, k03_i + 6);
			// 구구단 n단 제목을 printf한다.
			System.out.printf("************ ************ ************\n", k03_i); // 구분선을 printf한다.
			for (int k03_j = 1; k03_j < 10; k03_j++) { // 곱해질 1부터 9까지의 수를 반복문으로 나타낸다.
				System.out.printf("%2d * %d = %-2d   %d * %d = %-2d   %d * %d = %-2d\n", k03_i, k03_j, k03_i * k03_j,
						k03_i + 3, k03_j, (k03_i + 3) * k03_j, k03_i + 6, k03_j, (k03_i + 6) * k03_j);
						// 구구단 계산을 printf한다.
			}
		}
	}

}
