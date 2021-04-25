package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P10 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\THTSKS010H00.dat");// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader br = new BufferedReader(new FileReader(f));							// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		String readtxt;																		// 파일의 각 라인을 읽어서 할당할 변수를 선언한다
		int LineCnt = 0;																	// 라인을 셀 변수를 선언한다
		int n = -1;																			// -1이 되면 더 이상 읽어들일 라인이 없는 것이다.
		StringBuffer s = new StringBuffer();												// StringBuffer를 만들고 변수 s에 할당한다
		while(true) {																		// break문을 만날 때까지 반복한다.
			char[] ch = new char[1000];														// 크기가 1000인 char배열을 선언한다.
			n = br.read(ch);																// 파일 전체를 읽어올 것이다. 각 라인을 읽어들인 것을 n에 할당한다.
			if (n == -1) break;																// 라인이 -1이 되면 while문을 빠져나간다
			for (char c : ch) {																// ch배열의 각 인덱스c를 순회한다
				if (c == '\n') {															// 만약 c가 개행문자일 경우,
					System.out.printf("[%s]***\n", s.toString());							// s를 프린트한다.
					s.delete(0, s.length());												// StringBuffer s의 처음부터 끝까지 내용물을 삭제한다.(초기화)
				} else {																	// c가 개행문자가 아닌 경우
					s.append(c);															// stringBuffer s에 읽어들인 한글자 한글자를 넣는다.
				}
			}
			LineCnt++;																		// 라인 갯수를 하나씩 올려준다.
		}
		System.out.printf("[%s]***\n", s.toString());										// StringBuffer에 남은 것이 있는지 프린트해본다.
		br.close();																			// BufferedReader를 닫는다.
	}
}
