package sw2;

import java.util.Scanner;

public class P22 {

	public static void main(String[] args) {
		/* ScannerEx 2021-04-26 kopo03 김도연 */
		Scanner sc = new Scanner(System.in);			// 스캐너 클래스를 불러온다.
		System.out.print("두자리 정수를 하나 입력해주세요.>");	// 콘솔창에 출력할 문구다.
		String input = sc.nextLine();					// 스캐너로 String을 받는다.
		int num = Integer.parseInt(input);				// String변수를 int로 캐스팅한다.
		System.out.println("입력내용 :" + input);			// 입력받은 String input을 출력한다.
		System.out.printf("num=%d%n", num);				// int로 변환한 num을 출력하고 개행한다.
	}

}
