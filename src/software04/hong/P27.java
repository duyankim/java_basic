package software04.hong;

public class P27 {

	public static void main(String[] args) {
		// sin함수 그래프 2021-04-02 kopo03 김도연

		int k03_n, k03_m; // n과 m을 선언하는 선언부이다.
		k03_m = 20;	k03_n = 1; // m과 n에 각각 30, 1할당하는 변수 선언과 할당이다.

		while (true) { // true일 때 반복하는 while문 작성

			for (int k03_i = 0; k03_i < k03_m; k03_i++)
				System.out.printf(" "); // m보다 작을 때 반복해서 공백 출력
			for (int k03_i = 0; k03_i < k03_n; k03_i++)
				System.out.printf("*"); // n보다 작을 때 반복해서 *찍기
			System.out.printf("\n"); // 줄바꿈을 위해 printf문을 사용한다.

			k03_m = k03_m - 1; // m은 1씩 감소하도록 한다.
			k03_n = k03_n + 2; // n은 2씩 증가해서 대칭이 맞는 별트리가 된다.

			if (k03_m < 0) break; // m이 0보다 작아지면 break
		}
	}

}
ㄴ