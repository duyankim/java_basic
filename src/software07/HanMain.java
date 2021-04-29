package software07;

import java.io.UnsupportedEncodingException;

public class HanMain {

	/* 한글계산 2021-04-28 kopo03 김도연 */
	public static void main(String[] args) throws UnsupportedEncodingException {					// 메인 메소드
		System.out.printf("HanBlankForeward[%s]\n", HanBlankForeward("한글abcd", 15));
		System.out.printf("HanBlankForeward[%s]\n", HanBlankForeward("한글한글aa", 15));
		System.out.printf("HanBlankBackward[%s]\n", HanBlankBackward("한글abcd", 15));
		System.out.printf("HanBlankBackward[%s]\n", HanBlankBackward("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
	}

	static int HanCount(String han) throws UnsupportedEncodingException {							// getBytes를 쓰려면 인코딩 예외처리 필수
		String[] k03_str = han.split("");															// 각 단어를 잘라서 한 글자씩 배열에 넣음
		int k03_bytes, k03_hangul = 0;																// 바이트 수와 한글 수를 셀 변수를 선언함
		for (String k03_s : k03_str) {																// 각 단어 한 글자를 반복문으로 돈다
			k03_bytes = k03_s.getBytes("MS949").length;												// 한글을 2바이트로 치는 MS949를 적용했을때
			if (k03_bytes == 2) k03_hangul += 1;													// 크키가 2바이트면 한글이 하나 있다고 인식
		}
		return k03_hangul;																			// 한글 글자 수를 반환한다.
	}
	
	static String HanBlankForeward(String k03_han, int k03_blank) throws UnsupportedEncodingException {
		int k03_notBlank = 0;																		// blank가 아닌 문자가 몇 개인지 셀 변수다
		k03_notBlank = 2 * HanCount(k03_han) + k03_han.length() - HanCount(k03_han);				// 변수가 아닌 것은 두 칸을 차지하는 한글과		
		for (int j = 0; j < k03_blank - k03_notBlank; j++) {										// 1칸을 차지하는 한글 이외의 다른 문자다
			k03_han = " " + k03_han;																// 반복문을 돌면서 입력받은 문장 앞에 공백을
		}																							// 넣어주고 공백을 붙인 문자열을 반환한다.
		return k03_han;
	}
	
	static String HanBlankBackward(String k03_han, int k03_blank) throws UnsupportedEncodingException {
		int k03_notBlank = 0;																		// blank가 아닌 문자가 몇 개인지 셀 변수다
		k03_notBlank = 2 * HanCount(k03_han) + k03_han.length() - HanCount(k03_han);				// 변수가 아닌 것은 두 칸을 차지하는 한글과
		for (int j = 0; j < k03_blank - k03_notBlank; j++) {										// 1칸을 차지하는 한글 이외의 다른 문자다
			k03_han += " ";																			// 반복문을 돌면서 입력받은 문장 뒤에 공백을
		}
		return k03_han;																				// 넣어주고 공백을 붙인 문자열을 반환한다.
	}
}
