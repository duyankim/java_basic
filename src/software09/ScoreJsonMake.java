package software09;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ScoreJsonMake {

	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", name);
		dataObject.put("studentid", studentid);
		JSONArray score = new JSONArray();
		score.add(kor);
		score.add(eng);
		score.add(mat);
		dataObject.put("score", score);
		return dataObject;
	}
	
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		JSONArray datasArray = new JSONArray();
		
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", "나연");
		dataObject.put("studentid", 209901);
		
		JSONArray score = new JSONArray();
		score.add(90);
		score.add(100);
		score.add(95);
		dataObject.put("score", score);
		datasArray.add(dataObject);
		
		datasArray.add(oneRec("정연", 209902, 100, 85, 75));
		datasArray.add(oneRec("모모", 209903, 100, 100, 100));
		datasArray.add(oneRec("사나", 209904, 95, 95, 90));
		datasArray.add(oneRec("지효", 209905, 80, 100, 70));
		datasArray.add(oneRec("미나", 209906, 100, 100, 70));
		datasArray.add(oneRec("다현", 209907, 70, 70, 70));
		datasArray.add(oneRec("채영", 209908, 80, 75, 72));
		datasArray.add(oneRec("쯔위", 209909, 78, 79, 82));
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\USER\\Desktop\\lesson08\\test.json");
			file.write(datasArray.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON 만든거 : " +  datasArray);
	}

}
