package software04.hong;

public class P15 {

	public static void main(String[] args) {
		// 단순비교 2021-04-02 kopo03 김도연
		
		int k03_A, k03_B; // 변수 선언부는 상단에 써주는 것이 좋다.

		k03_A = 0; // 선언 후 할당을 한다.
		while (true) {// while문 선언. 라인 갯수 만들기
			k03_B = 0; // while문 안에 할당
			while (true) {// 이중 while문 선언. 별 갯수 정하기
				System.out.printf("*"); // 별 출력하기하는 printf문이다.

				if (k03_A == k03_B)
					break; // 라인 갯수와 별 갯수가 같아지면 break.
				k03_B++; // 변수의 반복적인 증가
			}

			System.out.printf("\n"); // 줄바꿈하는 printf문이다.
			k03_A++; // 무한루프가 되지 않으려면 변수가 변화해서 false인 상태를 만나도록 해야함
			if (k03_A == 30)
				break; // 라인이 30줄이 되면 반복문 중단함
		}

	}

}
