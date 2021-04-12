package software04.hong;

public class P21 {

	public static void main(String[] args) {
		// array 이용 비교 2021-04-02 kopo03 김도연
		int[] k03_LMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 매 달 마지막 날을 배열로 만듦

		for (int k03_i = 1; k03_i < 13; k03_i++) { // 1월부터 12까지 반복한다.
			System.out.printf(" %d월 =>", k03_i); // 월을 출력하는 printf문이다.

			for (int k03_j = 1; k03_j < 32; k03_j++) {// 1일부터 31일까지 반복한다.
				System.out.printf("%d", k03_j); // 일 출력하는 printf문이다.

				if (k03_LMD[k03_i - 1] == k03_j)
					break; // 배열은 0부터 인덱스가 시작하기 때문에 해당 월에서 1을 뺀 인덱스가
				// 배열에서 가진 달의 마지막일자를 구해서 반복문의 변수와 일치하면 반복 멈춤

				System.out.printf(","); // 콤마 출력을 break이후에 넣어서 마지막 일에는 콤마를 안 찍기
			}
			System.out.printf("\n"); // 줄 바꾸기하는 printf문이다.
		}
	}
}
