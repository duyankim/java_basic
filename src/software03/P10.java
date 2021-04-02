package software03;

public class P10 {

	public static void main(String[] args) {
		//5. 소수점 자리의 반올림 버림 처리 2021-04-01 kopo03 김도연
		
		int K03_i = 14/5; // 결과값은 2.8 -> 소수점 이하 버림 : 2, 반올림 : 3
		
		System.out.printf("#5-1 : %d\n", K03_i); //자동으로 소수점 이하 버려짐
		
		double K03_d; //할당
		
		K03_d = 14/5; //연산
		System.out.printf("#5-2 : %f\n", K03_d); //소수형 연산이 아닌 2.000000
		
		K03_d = 14.0/5; //나누거나 나눠지는 수 중 하나라도 실수 형태로 써야 실수로 계산된다
		System.out.printf("#5-3 : %f\n", K03_d); //출력
		
		K03_d = (14.0)/5 + 0.5; //실수형 계산을 한 뒤 0.5를 더함
		System.out.printf("#5-4 : %f\n", K03_d); //출력
		
		K03_d = (int) ((14.0)/5 + 0.5); //실수형 계산 뒤 정수로 형변환
		System.out.printf("#5-2 : %f\n", K03_d); //출력
	}

}
