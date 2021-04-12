package software04.hong;

public class P19 {

	public static void main(String[] args) {
		// 비정형비교2 2021-04-02 kopo03 김도연
		for (int k03_i = 1; k03_i < 13; k03_i++) {// 1부터 12까지 반복하는 달
			System.out.printf(" %d =>", k03_i); // 월 출력하기

			for (int k03_j = 1; k03_j < 32; k03_j++) {// 1부터 31일까지 반복하는 일
				System.out.printf("%d", k03_j); // 일 출력하기

				if (k03_i == 4 || k03_i == 6 || k03_i == 9 || k03_i == 11) {// 4,6,9,11월은 30일까지만 존재
					if (k03_j == 30) break; // 30일까지만 출력하면 break
				} else if (k03_i == 2) { // 2월은 특수하니까 and나 or를 쓰지 않음
					if (k03_j == 28) break; // 28일까지 출력시 break
				} else { // 31일까지 있는 나머지 달을 else문에 출력
					if (k03_j == 31) break;// 31이 됐을 때 break
				}
				System.out.print(", "); // break된 뒤에 넣어서 마지막 break될 때는 콤마 안 찍힘
			}
			System.out.printf("\n"); // 줄나눔은 for문 안에 있어야 한다
		}
		
		// 비정형비교3 2021-04-02 kopo03 김도연
		for (int k03_i = 1; k03_i < 13; k03_i++) {// 1부터 12까지 반복하는 달
			System.out.printf(" %d =>", k03_i); // 월 출력하기

			for (int k03_j = 1; k03_j < 32; k03_j++) {// 1부터 31일까지 반복하는 일
				System.out.printf("%d", k03_j); // 일 출력하기

				if ((k03_i == 4 || k03_i == 6 || k03_i == 9 || k03_i == 11) && k03_j == 30)
					break; // 일이 30일인 때를 and조건으로 연결
				// 30일까지만 출력하면 break

				else if (k03_i == 2 && k03_j == 28)
					break; // 2월이면서 28일일 경우 반복문 break;
				// 28일까지 출력시 break

				else if (k03_j == 31)
					break; // 31일에 끝나는 달도 else if 조건으로 넣어 break후 콤마가 찍히지 않게 함

				System.out.print(", "); // break된 뒤에 넣어서 마지막 break될 때는 콤마 안 찍힘
			}
			System.out.printf("\n"); // 줄나눔은 for문 안에 있어야한다
		}
	}

}
