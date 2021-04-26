package sw2;

public class P26 {

	public static void main(String[] args) {
		/* CastingEx 2021-04-26 kopo03 김도연 */
		double d = 85.4;					// 더블 변수를 선언하고 초기화
		int score = (int)d;					// int변수를 선언하고 int로 캐스팅한 더블을 할당
		
		System.out.println("score=" + score);	// score는 소수점 아랫자리를 내림한 더블변수의 int값
		System.out.println("d=" + d);			// d는 소수점을 가진 더블형
	}

}
