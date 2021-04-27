package sw2;

public class P19 {

	public static void main(String[] args) {
		/* VarEx2 2021-04-26 kopo03 김도연 */
		int k03_x = 10;										// 정수 x를 선언하고 10으로 초기화
		int k03_y = 20;										// 정수 y를 선언하고 20으로 초기화
		int k03_tmp = 0;									// 정수 tmp를 선언하고 0으로 초기화
		System.out.println("x : " + k03_x + " y : " + k03_y); // x와 y를 프린트
		
		k03_tmp = k03_x;									// tmp에 임시적으로ㅛ x를 옮겨넣음
		k03_x = k03_y;										// x에 y를 옮겨넣음
		k03_y = k03_tmp;									// tmp를 y에 옮김
		System.out.println("x : " + k03_x + " y : " + k03_y);	// x와 y의 값이 바뀌었음
	}

}
