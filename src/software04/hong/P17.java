package software04;

public class P17 {

	public static void main(String[] args) {
		// 범위를 주어서 찾기 2021-04-02 kopo03 김도연
		int Val; // 변수 선언
		for(int i=0; i<300; i++) { // 0~299까지 반복
			Val = 5 * i; // 반복문을 도는 i를 5로 곱해서 변수에 할당
			
			if(Val >= 0 && Val < 10) System.out.printf("일 %d\n", Val); // 변수가 0,1,2,3,4,5,6,7,8,9일 때
			else if (Val >= 10 && Val < 100) System.out.printf("십 %d\n", Val); // 변수가 10이상 100 미만일 때
			else if (Val >= 100 && Val < 1000) System.out.printf("백 %d\n", Val); // 변수가 100이상 1000미만일 때
			else System.out.printf("천 %d\n", Val); //변수가 1000이상일 때
		}
	}

}
