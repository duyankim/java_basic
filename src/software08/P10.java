package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P10 {

	/* 파일 훑어보고 감잡기 2021-04-25 kopo03 김도연 */
	public static void main(String[] args) throws IOException {
		File k03_f = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\THTSKS010H00.dat");// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader k03_br = new BufferedReader(new FileReader(k03_f));			// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		int k03_n = -1;																// -1이 되면 더 이상 읽어들일 라인이 없는 것이다.
		StringBuffer k03_s = new StringBuffer();									// StringBuffer를 만들고 변수 s에 할당한다
		while(true) {																// break문을 만날 때까지 반복한다.
			char[] k03_ch = new char[1000];											// 크기가 1000인 char배열을 선언한다.
			k03_n = k03_br.read(k03_ch);											// 파일 전체를 읽어올 것이다. 각 라인을 읽어들인 것을 n에 할당한다.
			if (k03_n == -1) break;													// 라인이 -1이 되면 while문을 빠져나간다
			for (char c : k03_ch) {													// ch배열의 각 인덱스c를 순회한다
				if (c == '\n') {													// 만약 c가 개행문자일 경우,
					System.out.printf("[%s]***\n", k03_s.toString());				// s를 프린트한다.
					k03_s.delete(0, k03_s.length());								// StringBuffer s의 처음부터 끝까지 내용물을 삭제한다.(초기화)
				} else {															// c가 개행문자가 아닌 경우
					k03_s.append(c);												// stringBuffer s에 읽어들인 한글자 한글자를 넣는다.
				}
			}																
		}
		System.out.printf("[%s]***\n", k03_s.toString());							// StringBuffer에 남은 것이 있는지 프린트해본다.
		k03_br.close();																// BufferedReader를 닫는다.
	}
}
