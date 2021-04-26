package sw09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ScoreJsonParsing {

	/* JSON 파싱 2021-04-25 kopo03 김도연 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		JSONParser k03_parser = new JSONParser();							// JSONParser를 생성한다.

		Object k03_obj = k03_parser.parse(new FileReader("C:\\Users\\USER\\Desktop\\lesson08\\test.json")); // parser가 해당 파일을 파싱한다.

		JSONArray k03_array = (JSONArray)k03_obj;							// 파싱한 객체를 JSONArray로 캐스팅해서 변수에 할당한다.

		System.out.println("*******************************");				// 구분선 출력
		for (int k03_i = 0; k03_i < k03_array.size(); k03_i++) {			// array만큼 반복한다.
			JSONObject result = (JSONObject) k03_array.get(k03_i);			// array에서 하나를 빼온다. JSONObject로 캐스팅해서 array가 아니라 object로 인식한다.
			System.out.println("이름 : " + result.get("name"));				// array의 key name에서 value를 빼온다.
			System.out.println("학번 : " + result.get("studentid"));			// array의 key studentid에서 value를 빼온다.

			JSONArray k03_score = (JSONArray) result.get("score");			// array에서 score array를 JSONArray로 캐스팅해서 받는다.
			long k03_kor = (long)k03_score.get(0);							// 점수 배열의 0번째를 국어 점수로 받는다.
			long k03_eng = (long)k03_score.get(1);							// 점수 배열의 1번째를 영어 점수로 받는다.
			long k03_mat = (long)k03_score.get(2);							// 점수 배열의 2번째를 수학 점수로 받는다.

			System.out.println("국어 : " + k03_kor);							// 국어 점수를 프린트한다.
			System.out.println("영어 : " + k03_eng);							// 영어 점수를 프린트한다.
			System.out.println("수학 : " + k03_mat);							// 수학 점수를 프린트한다.
			System.out.println("총점 : " + (k03_kor+k03_eng+k03_mat));		// 국영수 총점을 프린트한다.
			System.out.println("평균 : " + ((k03_kor+k03_eng+k03_mat) / 3.0));	// 국영수 총점의 평균을 프린트한다.
			System.out.println("*******************************");			// 구분선을 출력한다.
		}
	}
}