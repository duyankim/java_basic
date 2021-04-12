package software04.hong;

public class P17 {

	public static void main(String[] args) {
		// 범위를 주어서 찾기 2021-04-02 kopo03 김도연
		int k03_Val; // 변수 선언부는 상단에 놓는다
		for(int k03_i=0; k03_i<300; k03_i++) { // 0~299까지 반복
			k03_Val = 5 * k03_i; // 반복문을 도는 i를 5로 곱해서 변수에 할당
			
			if(k03_Val >= 0 && k03_Val < 10) System.out.printf("일 %d\n", k03_Val); // 변수가 0,1,2,3,4,5,6,7,8,9일 때
			else if (k03_Val >= 10 && k03_Val < 100) System.out.printf("십 %d\n", k03_Val); // 변수가 10이상 100 미만일 때
			else if (k03_Val >= 100 && k03_Val < 1000) System.out.printf("백 %d\n", k03_Val); // 변수가 100이상 1000미만일 때
			else System.out.printf("천 %d\n", k03_Val); //변수가 1000이상일 때 출력하는 printf문이다.
		}
	}

}
