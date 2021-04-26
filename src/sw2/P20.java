package sw2;

public class P20 {

	public static void main(String[] args) {
		/* StringEx 2021-04-26 kopo03 김도연 */
		String name = "Ja" + "va";		// String 변수에 Java를 선언
		String str = name + 8.0;		// name 변수에 8.0을 이어붙임
		
		System.out.println(name);		// name출력
		System.out.println(str);		// str출력
		System.out.println(7 + " ");	// 7과 공백 출력
		System.out.println(" " + 7);	// 공백과 7 출력
		System.out.println(7 + "");		// 7만 출력
		System.out.println("" + 7);		// 7만 출력
		System.out.println("" + "");	// 아무것도 출력하지 않음
		System.out.println(7 + 7 + "");	// 14 출력
		System.out.println("" + 7 + 7);	// 따옴표가 앞으로 가서 문자열로 인식함.
	}
}
