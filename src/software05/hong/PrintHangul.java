package software05.hong;

public class PrintHangul {

	public static void main(String[] args) {

	}

	public static int hangulCount(String str) {

		int hangul = 0, i;
		// 한글 글자수를 셀 변수 선언

		for (i = 0; i < str.length(); i++) {
			// for문을 입력받은 글자 수 만큼 반복하기

			char eachWord = str.charAt(i);
			// str의 각 글자를 eachWord라는 변수에 넣는다

			if (Character.getType(eachWord) == Character.OTHER_LETTER) {
				// public static final byte OTHER_LETTER = 5;이다
				// getType메소드를 사용했을 때 ascii코드인 영어소문자는 2, 영어대문자는 1이 나오고
				// 그 외의 한국어, 한자 등은 ascii코드가 아니기 때문에 OTHER_LETTER인 5가 반환된다.

				// OTHER_LETTER인 경우에만 한국어인지 판별한다.
				if (Character.toString(eachWord).matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
					// 각 글자가 한글 정규표현식에 부합하는지 확인 후
					hangul++;
					// 한글이라면 갯수를 센다
				}
			}
		}
		return hangul;
		// 한글 글자 수를 반환한다.
	}

	public static int blankCount(String str) {
		
		String hangul = "ㅎ";
		//한글 한 글자를 변수에 넣고
		int hangulBytes = hangul.getBytes().length;
		//한글 한 글자를 바이트로 변환한 뒤 몇 바이트인지 구한다
		
		int strBytes = str.getBytes().length;
		//입력 받은 문장이 전체 몇 바이트인지 구한다
		
		int hangulCount = hangulCount(str);
		//문장에서 한글 글자 수는 몇 개인지 구한다
		
		int blank = 0;
		//공백 갯수를 정하기 위해 변수를 만든다.
		
		if (hangulBytes == 2) {
			//EUC-KR인 경우 한글이 2 바이트로 처리된다.
			
			blank = strBytes;
			//한글1글자 == 2bytes니까 문장 전체 바이트가 공백 크기가 된다
			//예를 들어, "가나abcd"인 경우 한글 2*2byte + 영어 1*4byte = 8byte
		} else if (hangulBytes == 3) {
			//UTF-8인 경우 한글이 3 바이트로 처리된다.
			
			//예를 들어, "가나abcd"인 경우 한글 2*3byte + 영어 1*4byte인데
		}
	}
	
	
	
	
	
	
	
	
}
