package software05.hong;

public class P4 {

	public static void main(String[] args) {
		// 구구단인쇄 2021-04-12 kopo03 김도연

		int[] k03_num = { 1, 4, 7 }; //각 줄을 시작할 단을 배열에 넣었다.

		for (int k03_n = 1; k03_n < 4; k03_n++) {// 1, 2, 3까지 반복하기 위한 반복문이다.
			int k03_i = k03_num[k03_n - 1]; //각 반복문이 1, 2, 3일때 배열의 0, 1, 2번째 수를 몇 단을 출력할 건지 제목에 넣는다. 
			System.out.printf("************ ************ ************\n", k03_i); // 구분선을 printf한다.
			System.out.printf(" 구구단 %d단  구구단 %d단  구구단 %d단\n", k03_i, k03_i + 1, k03_i + 2); 
			// 구구단 n단 제목을 printf한다.
			System.out.printf("************ ************ ************\n", k03_i); // 구분선을 printf한다.
			for (int k03_j = 1; k03_j < 10; k03_j++) { // 곱해질 1부터 9까지의 수를 반복문으로 나타낸다.
				System.out.printf("%2d * %d = %-2d   %d * %d = %-2d   %d * %d = %-2d\n", k03_i, k03_j, k03_i * k03_j,
						k03_i + 1, k03_j, (k03_i + 1) * k03_j, k03_i + 2, k03_j, (k03_i + 2) * k03_j); 
				// 구구단 계산을 printf한다.
			}
		}
	}
}
