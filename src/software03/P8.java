package software03;

public class P8 {

	public static void main(String[] args) {
		//4. 정수형 연산 (버림) 2021-04-01 kopo03 김도연
		int K03_i; //할당
		
		K03_i = 1000/3; //정수로 333만 도출
		System.out.printf("#3-1 : %d\n", K03_i); //출력
		
		K03_i = 1000%3; //나머지 계산 1나옴
		System.out.printf("#3-2 : %d\n", K03_i); //출력
		
		//5. 나머지 연산자 응용
		for (int k03_i=0; k03_i<20; k03_i++) { //0 ~ 19 반복
			System.out.printf("#3-3 : %d\t", k03_i); //출력
			
			if (((k03_i+1) % 5) == 0) { //5행씩 프린트
				System.out.printf("\n"); //줄 나눔
			}
		}
	}

}
