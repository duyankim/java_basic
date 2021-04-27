package sw2;

public class P17 {

	public static void main(String[] args) {
		/* VarEx1 2021-04-26 kopo03 김도연 */
		int k03_year = 0;							// year라는 숫자형 변수를 선언하고 초기화
		int k03_age = 14;							// age라는 숫자형 변수를 선언하고 초기화
		System.out.println("결과1 : " + k03_year);	// year 변수를 콘솔에 출력
		System.out.println("결과2 : " + k03_age);	// age 변수를 콘솔에 출력
		
		k03_year = k03_age + 2000;					// age 변수에 2000 더하고 year에 할당
		k03_age = k03_age + 1;						// age 변수에 1 더하고 age에 할당
		System.out.println("결과3 : " + k03_year);	// year = 14 + 2000
		System.out.println("결과4 : " + k03_age);	// age = 14 + 1
	}
}
