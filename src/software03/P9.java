package software03;

public class P9 {

	public static void main(String[] args) {
		// 6. 반올림 버림 처리 2021-04-01 kopo03 김도연
		
		int K03_i = 12345; //할당
		// 12345원의 10원 이하를 버려서 처리
		// 10으로 나눈 몫 1234에 10을 곱해 12340원을 만든다
		int k03_j = (K03_i / 10) * 10;
		
		System.out.printf("#4-1 : %d\n", k03_j);//출력
		
		K03_i = 12345; //할당
		// 12345원의 10원 이하를 반올림 처리
		k03_j = ((K03_i + 5) / 10) * 10;
		
		System.out.printf("#4-2 : %d\n", k03_j); //출력
		
		K03_i = 12344; //일의 자리가 5이하인 수로 할당
		//12344원의 10원 이하를 반올림 처리
		k03_j = ((K03_i) / 10) * 10;
		
		System.out.printf("#4-2 : %d\n", k03_j); //출력
	}

}
