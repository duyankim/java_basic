package software09;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ScoreJsonMake {

	/* JSON 만들기 2021-04-25 kopo03 김도연 */
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject k03_dataObject = new JSONObject();				// JSON Object 를 생성해서
		k03_dataObject.put("name", name);							// JSON Object에 name key값에 name value를 넣고
		k03_dataObject.put("studentid", studentid);					// JSON Object에 studentid key값에 studentid value를 넣는다
		JSONArray k03_score = new JSONArray(); 						// JSON Array 생성
		k03_score.add(kor);											// 생성한 JSON Array에는 한국어 점수를 넣고
		k03_score.add(eng);											// 영어 점수를 넣고
		k03_score.add(mat);											// 수학 점수를 넣는다.
		k03_dataObject.put("score", k03_score);						// 그리고 그 Array를 dataObject에 넣는다. score key값에 value도 score값으로.
		return k03_dataObject;										// 함수 선언부에 JSONObject를 반환하겠다고 선언했으니, object를 반환한다.
	}

	public static void main(String[] args) {
		JSONObject k03_jsonObject = new JSONObject();				// 최종 완성될 JSONObject를 선언한다.
		JSONArray k03_datasArray = new JSONArray();					// 한 사람의 성적 정보를 담을 JSONArray를 선언한다.

		JSONObject k03_dataObject = new JSONObject();				// 한 명 정보가 들어갈 JSONObject를 선언한다.
		k03_dataObject.put("name", "나연");							// JSONObject에 한 사람의 name에 들어갈 value를 넣어준다
		k03_dataObject.put("studentid", 209901);					// JSONObject에 한 사람의 studentid에 들어갈 value를 넣어준다.

		JSONArray k03_score = new JSONArray();						// 한 명의 성적 정보가 들어갈 JSONArray를 선언한다.
		k03_score.add(90);											// score array에 성적을 넣는다.
		k03_score.add(100);											// score array에 성적을 넣는다.
		k03_score.add(95);											// score array에 성적을 넣는다.
		k03_dataObject.put("score", k03_score);						// dataObject에 key는 score로, value는 score array를 넣는다.
		k03_datasArray.add(k03_dataObject);							// datasArray에 dataObject를 넣는다.

		k03_datasArray.add(oneRec("정연", 209902, 100, 85, 75));		// 함수로 해당 과정을 수행할 수 있다.
		k03_datasArray.add(oneRec("모모", 209903, 100, 100, 100));	// oneRec은 데이터 객체를 만드는 과정이다.
		k03_datasArray.add(oneRec("사나", 209904, 95, 95, 90));		// 인자로 name, studentid, kor, eng, mat을 전달하면
		k03_datasArray.add(oneRec("지효", 209905, 80, 100, 70));		// 해당 value들을 맞는 key값에 넣어 dataObject를 만들고
		k03_datasArray.add(oneRec("미나", 209906, 100, 100, 70));	// 그 반환된 dataObject를 다시 datasArray에 넣는 것이
		k03_datasArray.add(oneRec("다현", 209907, 70, 70, 70));		// 이 8명의 데이터를 넣는 과정이라 할 수 있다.
		k03_datasArray.add(oneRec("채영", 209908, 80, 75, 72));		// 이 과정을 완료하면 datasArray에는
		k03_datasArray.add(oneRec("쯔위", 209909, 78, 79, 82));		// 9명의 데이터가 들어가게 된다.

		try {														// 예외처리를 위해 try-catch문을 쓴다.
			FileWriter k03_file = new FileWriter("C:\\Users\\USER\\Desktop\\lesson08\\test.json");	// 작성할 파일을 불러온ㄴ다
			k03_file.write(k03_datasArray.toJSONString());			// 파일에 작성한 datasArray를 JSONString으로 쓴다.
			k03_file.flush();										// FileWriter 내부 버퍼의 내용을 파일에 write한다.
			k03_file.close();										// close()를 호출하여 스트림을 닫으면 그 스트림을 다시 이용하여 파일에 쓰는 것이 불가능해진다.
		} catch (IOException e) {									// 예외처리를 해준다.
			e.printStackTrace();									// 예외를 프린트한다.
		}
		System.out.println("JSON 만든거 : " + k03_datasArray);		// datasArray를 프린트해본다.
	}
}
