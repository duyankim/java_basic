package software05.hong;

public class Test {

	public static void main(String[] args) {
		/*
		String[] str = new String[] { "abcde", "abc!@#", "abc가나다def", "한글이다", "abc!@#한글이다", "special characters ★○",
				"chinese characters 甲", "japanese characters キーワード" };

		for (int i = 0; i < str.length; i++) {
			boolean found = false;

			for (int j = 0; str[i] != null && j < str[i].length(); j++) {
				if (Character.getType(str[i].charAt(j)) == Character.OTHER_LETTER) {
					found = true;
					break;
				}
			}

			if (found)
				System.out.println(str[i] + " -> including other letters");
			else
				System.out.println(str[i] + " -> only ascii");

		}

		String korean = "한";
		int koreanByte = korean.getBytes().length;
		System.out.println(koreanByte);
		*/

		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글테스트12", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글만일곱글자", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글테스트12", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글만일곱글자", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한キ甲a")); // = 1

	}

	public static String HanBlankForeword(String str, int i) {

		String korean = "한";
		int koreanByte = korean.getBytes().length;
		// 한글 한글자의 byte 수를 파악한다.

		int totalBytes = str.getBytes().length;
		// 문자열의 byte 수를 받는다.

		int hanCount = HanCount(str);
		// 한글의 글자수를 받는다.

		int blank = 0;
		// 전체 정해진 byte 만큼의 칸에서 공백을 얼마나 줄 것인가
		if (koreanByte == 2) {
			blank = totalBytes;
			// 한글 1글자가 2byte이면 전체 byte 수에서 문자열의 byte 수 만큼 빼주면 된다.
			// 한글abcd = 8byte (한글 4byte abcd 4byte)
			// 15 - 8 = 7 만큼 공백이 필요하다.
		} else if (koreanByte == 3) {
			blank = totalBytes - hanCount;
			// 한글 1글자가 3byte인 경우 전체 byte 수에서 한글 글자수 만큼 1씩 뺀 값을 빼주어야 한다.
			// 한글abcd = 10byte (한글 6byte abcd 4byte)
			// 한글 글자수 2
			// 15 - (10 - 2) = 7 만큼 공백이 필요하다.
		} else {
			System.out.println("프로그램을 다시 생각해볼 필요가 있다.");
			// 한글이 4byte 일 경우 한글 글자수 만큼 2씩 빼면 될 것으로 생각된다.
		}
		String result = "";
		// 결과를 담을 문자열을 준비하고
		for (int j = 0; j < i - blank; j++) {
			result += " ";
		}
		// 공백을 먼저 붙여준다.
		result += str;
		// 입력받은 문자열을 붙여준다.
		return result; // 결과값 리턴
	}

	public static String HanBlankBackword(String str, int i) {

		String korean = "한";
		int koreanByte = korean.getBytes().length;
		// 한글 한글자의 byte 수를 파악한다.

		int totalBytes = str.getBytes().length;
		// 문자열의 byte 수를 받는다.

		int hanCount = HanCount(str);
		// 한글의 글자수를 받는다.

		int blank = 0;
		// 전체 정해진 byte 만큼의 칸에서 공백을 얼마나 줄 것인가
		if (koreanByte == 2) {
			blank = totalBytes;
			// 한글 1글자가 2byte이면 전체 byte 수에서 문자열의 byte 수 만큼 빼주면 된다.
			// 한글abcd = 8byte (한글 4byte abcd 4byte)
			// 15 - 8 = 7 만큼 공백이 필요하다.
		} else if (koreanByte == 3) {
			blank = totalBytes - hanCount;
			// 한글 1글자가 3byte인 경우 전체 byte 수에서 한글 글자수 만큼 1씩 뺀 값을 빼주어야 한다.
			// 한글abcd = 10byte (한글 6byte abcd 4byte)
			// 한글 글자수 2
			// 15 - (10 - 2) = 7 만큼 공백이 필요하다.
		} else {
			System.out.println("프로그램을 다시 생각해볼 필요가 있다.");
			// 한글이 4byte 일 경우 한글 글자수 만큼 2씩 빼면 될 것으로 생각된다.
		}
		String result = "";
		// 결과를 담을 문자열을 준비하고

		result += str;
		// 입력받은 문자열을 먼저 붙여준다.

		for (int j = 0; j < i - blank; j++) {
			result += " ";
		}
		// 공백을 뒤에 붙여준다.

		return result; // 결과값 리턴
	}

	public static int HanCount(String str) {

		int sum = 0;
		// 한글 글자수를 셀 변수를 준비한다.
		for (int i = 0; i < str.length(); i++) {
			// for문을 글자수만큼 돌린다.
			if (Character.getType(str.charAt(i)) == Character.OTHER_LETTER) {
				// 문자열의 한 글자를 문자화 하여 type 을 조사하자.
				// ascii 코드 안의 문자는 2, 그 외의 문자는 5를 리턴한다.
				// public static final byte OTHER_LETTER = 5; 이미 지정되어 있다.
				// 5인 경우에만 한글인지 남의 나라 언어인지 판별하자.
				
				if (str.substring(i, i + 1).matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
					// i번째 글자를 잘라서 한글 정규식에 부합할 경우에만 글자수를 카운트 해주자.
					sum++;
				}
			}
		}
		return sum; // 결과값 리턴
	}
 
}
