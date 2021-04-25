package software09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ScoreJsonParsing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(new FileReader("C:\\Users\\USER\\Desktop\\lesson08\\test.json"));
		
		JSONArray array = (JSONArray)obj;
		
		System.out.println("*******************************");
		for (int i = 0; i < array.size(); i++) {
			JSONObject result = (JSONObject) array.get(i);
			System.out.println("이름 : " + result.get("name"));
			System.out.println("학번 : " + result.get("studentid"));
			
			JSONArray score = (JSONArray) result.get("score");
			long kor = (long)score.get(0);
			long eng = (long)score.get(1);
			long mat = (long)score.get(2);
			
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("총점 : " + (kor+eng+mat));
			System.out.println("평균 : " + ((kor+eng+mat) / 3.0));
			System.out.println("*******************************");
		}
	}

}
