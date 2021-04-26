package sw2;

public class P23 {

	public static void main(String[] args) {
		/* PrintfEx 2021-04-26 kopo03 김도연 */
		byte b = 1;											// byte변수를 선언하고 1로 초기화
		short s = 2;										// short변수를 선언하고 2로 초기화
		char c = 'A';										// char변수를 선언하고 'A'로 초기화		
		int finger = 10;									// int변수를 선언하고 10으로 초기화
		long big = 100000000000L;							// long변수를 선언하고 초기화
		long hex = 0xFFFFFFFFFFFFFFFL;						// long변수를 선언하고 초기화
		int octNum = 010;									// 8진수 10
		int hexNum = 0x10;									// 16진수 10
		int binNum = 0b10;									// 2진수 10
		
		System.out.printf("b=%d%n", b);						// 1 출력
		System.out.printf("s=%d%n", s);						// 2 출력
		System.out.printf("c=%c, %d %n", c, (int)c);		// A출력, int로 캐스팅한 A는 아스키코드 65
		System.out.printf("finger=[%5d]%n", finger);		// 10 출력하는데, %5d라서 5칸 차지, 우정렬
		System.out.printf("finger=[%-5d]%n", finger);		// 10 출력하는데, %-5d라서 5칸차지 좌정렬
		System.out.printf("finger=[%05d]%n", finger);		// 10 출력하는데, %05d라서 우정렬에 남는자리는 0으로 채움
		System.out.printf("big=%d%n", big);					// long변수 출력하는데 L은 사라지고 출력
		System.out.printf("hex=%#x%n", hex);				// #은 접두사이고, L은 사라지고 출력된다.
		System.out.printf("octNum=%o, %d%n", octNum, octNum);	// %o는 8진수인 정수로 출력. %d는 10진수
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);	// %x는 16진수인 정수로 출력
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);	// 2진수로 변환해서 출력	
	}
}
