package software05.hong;

public class P6 {

	public static void main(String[] args) {
		// 달력인쇄 2021-04-12 kopo03 김도연

		int k03_weekday = 5; 													// 1일 전날이 무슨 요일인지 나타내는 변수를 선언하고 할당한다.
																				// 1월 1일은 금요일이기 때문에 일, 월, 화, 수, 목 => 5다.
		int k03_firstday = k03_weekday; 										// 매월 1일이 시작하는 날을 달을 반복할 때 이어서 사용하기 위해 
																				// weekday를 따로 변수에 할당해둔다.

		int[] k03_end = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 	// 매 달의 마지막 날짜를 길이가 12인 배열로 표현

		/*
		 * 첫 번째 for문 <달을 나누는 for문>
		 */
		for (int k03_month = 0; k03_month < 12; k03_month++) { 					// 0부터 11까지 12번 반복하는 반복문이다.
			System.out.printf("\n\n%10d월\n", k03_month + 1);	 				// 두 줄을 줄바꿈한 뒤 프린트하는 달 제목 줄
			System.out.printf("======================\n"); 						// 구분선을 printf한다.
			System.out.printf(" 일 월 화 수 목 금 토\n"); 						// 요일을 printf로 출력한다.

			/*
			 * 이중 for문 1 <1일까지의 공백을 프린트하는 for문>
			 */
			for (k03_weekday = 1; k03_weekday <= k03_firstday; k03_weekday++) { // 1일이 시작하는 요일까지 반복
																				// 예를들어 1일이 금요일이면 weekday == 5이고, 
																				// 일, 월, 화, 수, 목까지 공백만 출력
				System.out.printf("   "); 										// 반복해서 공백을 출력하기
			}

			/*
			 * 이중 for문 2 <해당 월의 날짜를 프린트하는 for문>
			 */
			for (int k03_i = 1; k03_i <= k03_end[k03_month]; k03_i++) { 		// 바깥 반복문이 해당 월을 가리킨다면, 
																				// 이 반복문은 해당 월의 마지막 날짜에서 종료한다.
				if (k03_weekday == 7) { 										// weekday는 1부터 7까지고, 7이 되면 줄바꿈을 해야된다.
					System.out.printf("%3d", k03_i); 							// 2자리 수와 공백 1칸을 더해 총 3칸을 지정한다.
					System.out.print("\n"); 									// 일주일이 다 찼으니 줄바꿈을 해준다.
					k03_weekday = 1; 											// 줄바꿈 후 다시 일요일부터 출력할 수 있도록 weekday를 1로 만들어준다.
				} else { 														// weekday가 1,2,3,4,5,6일 때
					System.out.printf("%3d", k03_i); 							// 위와 같이 공백 1개와 날짜 2칸을 출력하도록 한다.
					k03_weekday++; 												// 날짜 하나를 출력했으니 요일도 하나 더해준다.
				}
			}
			k03_firstday = k03_weekday - 1; 									// 마지막 날짜 출력시에 weekday에 1을 더해주었으니
																				// 다시 바깥 for문으로 올라가 다음 달을 출력할 때는 1을 빼주어야 시작 요일이 맞다
		}
	}
}
