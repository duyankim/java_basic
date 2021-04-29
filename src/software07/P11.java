package software07;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

public class P11 {

	public static void main(String[] args) {
		/* 고정길이에서 필드 추출 처리 2021-04-28 kopo03 김도연 */
		String[] k03_OneRec = {
				"01*   애호박               3,000  1      3,000",
				"02    시금치               1,000  3      3,000",
				"03    느타리버섯            1,000  1      1,000",
				"04    파프리카              2,000  1      2,000",
				"05*   국산마늘쫑            2,000 10     22,000",
				"06*   단호박               2,500  1      2,500",
				"07*   미역줄기             2,000  1      2,000",
				"08*   상주오이             2,000  2      4,000",
				"09   *국산햇양파            5,000  1      5,000",
				"10   *국산바지락            4,000  1      4,000",
				"11*   왕새우               8,000  1      8,000",
				"12*   코다리              10,000  5     50,000",
				"13*   순두부              10,000  1     10,000",
				"14*   표고버섯             3,000  8     24,000",
				"15*   가래떡               3,000  1      3,000",
				"16*   떡국떡               9,990  6     59,940",
				"17*   아귀채               5,000  2     10,000",
				"18*   꽃보다오징어           8,000  1      8,000",
				"19*   각종진미채           13,000  4     51,000",
				"20*   남해볶음용멸치         8,000  1      8,000",
				"21*   국물용다시멸치         8,000  1      8,000",
				"22*   국산참기름            12,000  1     12,000",
				"23*   국산들기름           18,000  2     36,000",
				"24*   김천통살호두         15,000  1     15,000",
				"25*   최고급뿌리다시        20,000  3     60,000",
				"26*   피코크 파주장단      10,000   1     10,000",
				"27*   CJ 유자샐러드소       20,000   1     20,000",
				"28*   (990)팽이버섯(       10,000  1     10,000",
				"29*   롯데 ABC초콜릿       10,000  2     10,000",
				"30*   대추방울토마토        10,000  1     10,000"
		};
		
		for (String k03_rec : k03_OneRec) {												// String배열에서 각각의 String한 줄씩 뽑기
			try {																		// 반복해서 함수에 넣음
				checkSum(k03_rec);														// Exception처리가 필요하기 때문에
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();													// try-catch문에 넣고 예외처리를 했다.
			}															
		}
		
	}
	
	static void checkSum (String rec) throws UnsupportedEncodingException {
		int k03_price, k03_count, k03_sum, k03_realSum;										// 가격, 갯수, 합계, 합계계산을 변수로 만듦

		k03_price = Integer.parseInt(rec.substring(16,29).replace(",", "").trim());			// 각 줄에서 가격 부분에서 ,를 없애고 공백을 줄임
		k03_count = Integer.parseInt(rec.substring(29,32).trim());							// 각 줄에서 갯수 부분을 substring으로 가져옴
		k03_sum = Integer.parseInt(rec.substring(32).replace(",", "").trim());				// 각 줄에서 합계를 ,를 없애고 가져옴
		k03_realSum = k03_price * k03_count;												// 합계를 계산해본다

		
		if (k03_realSum != k03_sum) {														// 합계 계산이 틀릴 경우에는
			System.out.printf("*****************************************************\n");
			System.out.printf("오류[%s]\n", rec);											// 오류를 수정한다.
			printResult(rec, k03_price, k03_count, k03_realSum);							// 수정된 결과를 프린트하는 메소드
		}
	}
	
	static void printResult(String rec, int price, int count, int realSum) throws UnsupportedEncodingException {
		String k03_itemName = rec.substring(0, 16).trim();									// 처음부터 아이템명까지 자름
		k03_itemName = HanBlankBackward(k03_itemName, 27);									// 한글 뒤에 공백을 붙일 수 있도록 메소드 사용
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###");					// 다시 콤마를 붙이기 위해 포맷 지정
		System.out.printf("수정[%s%6s%3.3s%11s]\n", k03_itemName, k03_df.format(price), count, k03_df.format(realSum));
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
	
	static String HanBlankBackward(String k03_han, int k03_blank) throws UnsupportedEncodingException {
		int k03_notBlank = 0;																		// blank가 아닌 문자가 몇 개인지 셀 변수다
		k03_notBlank = 2 * HanCount(k03_han) + k03_han.length() - HanCount(k03_han);				// 변수가 아닌 것은 두 칸을 차지하는 한글과
		for (int j = 0; j < k03_blank - k03_notBlank; j++) {										// 1칸을 차지하는 한글 이외의 다른 문자다
			k03_han += " ";																			// 반복문을 돌면서 입력받은 문장 뒤에 공백을
		}
		return k03_han;																				// 넣어주고 공백을 붙인 문자열을 반환한다.
	}

}
