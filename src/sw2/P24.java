package sw2;

public class P24 {

	public static void main(String[] args) {
		/* PrintfEx2 2021-04-26 kopo03 김도연 */
		String url = "www.codechobo.com";				// String 변수를 선언하고 초기화함
		float f1 = .10f;								// 실수형으로는 0.1, 지수 표현식으로는 1.0e-1
		float f2 = 1e1f;								// 실수형으로는 10.0, 지수 표현식으로는 1.0e+1
		float f3 = 3.14e3f;								// 지수 표현식으로 3.14e+3
		double d = 1.23456789;							// 더블 변수 선언 및 초기화

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);	// 실수형, 지수형, f와 g형식 중 짧은 형식으로 출력
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);	// 지수형식은 (d.dddd e + ddd)형식
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);	// f는 고정형식 (dddd.dddddd)로 실수를 출력
		System.out.printf("d%f%n", d);						// double은 f로 출력할 수 있음
		System.out.printf("d=%14.10f%n", d);				// 14칸 중에서 10칸만 채우면서 우정렬로 출력
		System.out.printf("[1234567890]%n");				// [ ]는 \가 없어도 출력 가능
		System.out.printf("[%s]%n", url);					// [ ]안에 string출력
		System.out.printf("[%20s]%n", url);					// 20s는 20칸을 할애하면서 우측 정렬이라는 뜻
		System.out.printf("[%-20s]%n", url);				// -20s는 20칸을 할애하면서 죄측정렬이라는 뜻
		System.out.printf("[%.8s]%n", url); 				//.8s는 9글자까지만 나타내고 나머지는 출력하지 않음.
	}

}
