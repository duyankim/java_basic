package sw09;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Weather {

	/* 날씨 xml 2021-04-26 kopo03 김도연 */
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// xml 문서 파싱을 위한 준비
		Document k03_doc = docBuilder.parse(new File("C:\\Users\\kim\\Desktop\\weather.xml"));	// xml파일에서 파싱 해옴
		
		Element k03_root = k03_doc.getDocumentElement();										// dom의 루트 구하기
		NodeList k03_tag_data = k03_doc.getElementsByTagName("data");							// data라는 이름의 태그를 가져오기

		String k03_seq = "", k03_hour = "", k03_day = "", k03_temp = "", k03_tmx = "", k03_tmn = "";				// 순서, 시각, 일시, 현재온도, 최고온도, 처저온도 선언
		String k03_sky = "", k03_pty = "", k03_wfKor = "", k03_wfEn = "", k03_pop = "", k03_r12 = "", k03_s12 = "";	// 하늘 상태, 강수 상태, 한국어 날씨, 영어 날씨, 강수 확률, 
																													// 12시간 예상 강수량, 12시간 예산 적설량 선언
		String k03_ws = "", k03_wd = "", k03_wdKor = "", k03_wdEn = "", k03_reh = "", k03_r06 = "", k03_s06 = "";	// 풍속, 풍향, 한국어 풍향, 영어 풍향, 습도, 6시간 예상 강수량, 6시간 예상 적설량 선언
		
		for (int k03_i = 0; k03_i < k03_tag_data.getLength(); k03_i++) {							// 태그 데이터의 수만큼 반복할 예정
			Element elmt = (Element)k03_tag_data.item(k03_i);										// 먼저 데이터 태그의 몇 번째 아이템인지 할당함.
			
			k03_seq = k03_tag_data.item(k03_i).getAttributes().getNamedItem("seq").getNodeValue();	// seq는 속성값이므로, 먼저 getAttributes()로 해당 data선택
			k03_hour = elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();	// <data>하위의 노드 리스트는 보통 태그를 불러오는 것처럼
			k03_day = elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();		// getElementsByTagName(태그이름)으로 태그이름에 해당하는
			k03_temp = elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();	// element를 가져온 뒤, 그 중 0번째 아이템 선택
			k03_tmx = elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();		// 아이템의 자식 노드들 중 getFirstChild()로 첫 번째 
			k03_tmn = elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();		// 자식 노드를 가져온다.
			k03_sky = elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();		// 자식 노드에서 text만 가지고 오고 싶다면
			k03_pty = elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();		// getNodeValue()로 해당 node의 textValue값을 가져온다.
			k03_wfKor = elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();	// wfKor의 textValue값을 가지고 옴
			k03_wfEn = elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();	// wfEn의 textValue값을 가지고 옴
			k03_pop = elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();		// pop의 textValue값을 가지고 옴
			k03_r12 = elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();		// r12의 textValue값을 가지고 옴
			k03_s12 = elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();		// s12의 textValue값을 가지고 옴
			k03_ws = elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();		// ws의 textValue값을 가지고 옴
			k03_wd = elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();		// wd의 textValue값을 가지고 옴
			k03_wdKor = elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();	// wdKor의 textValue값을 가지고 옴
			k03_wdEn = elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();	// wdEn의 textValue값을 가지고 옴
			k03_reh = elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();		// reh의 textValue값을 가지고 옴
			k03_r06 = elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();		// r06의 textValue값을 가지고 옴
			k03_s06 = elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();		// s06의 textValue값을 가지고 옴

			
			System.out.printf("48 시간 중: %s번째\n", k03_seq);										// seq는 48시간 데이터 중 몇 번째 값인지를 나타낸다.
			System.out.printf("시각: %s시\n", k03_hour);												// hour는 3시간마다 동네예보를 하기 때문에 3시간 단위로 나옴
			System.out.printf("일시: %s\n", getDay(Integer.parseInt(k03_day)));						// day는 0, 1, 2로 오늘, 내일, 모레를 나타내기 때문에 함수로 정보값 반환
			System.out.printf("현재 시각 온도: %s\n", k03_temp + "°C");								// temp는 현재온도로 끝에 °C를 붙여서 출력함
			System.out.printf("최고 온도: %s\n", k03_tmx + "°C");										// tmx는 최고온도로 끝에 °C를 붙여서 출력함
			System.out.printf("최저 온도: %s\n", k03_tmn + "°C");										// tmn는 최저온도로 끝에 °C를 붙여서 출력함
			System.out.printf("하늘 상태: %s\n", getSky(Integer.parseInt(k03_sky)));					// sky는 하늘 상태코드인데, 숫자로 받아서 정보값으로 변환함
			System.out.printf("강수 상태: %s\n", getPty(Integer.parseInt(k03_pty)));					// pty는 강수 상태코드로, 숫자로 받아서 정보값으로 변환함
			System.out.printf("날씨(한국어): %s\n", k03_wfKor);										// 한국어로 나오는 날씨 정보
			System.out.printf("날씨(영어): %s\n", k03_wfEn);											// 영어로 나오는 날씨 정보
			System.out.printf("강수 확률: %s\n", k03_pop + "%");										// 강수 확률을 나타내기 때문에 끝에 % 붙여서 출력함
			System.out.printf("12시간 예상 강수량: %smm\n", k03_r12);									// 강수량을 나타내기 때문에 끝에 mm붙여서 출력함
			System.out.printf("12시간 예상 적설량: %scm\n", k03_s12);									// 적설량은 끝에 cm를 붙여서 출력함
			System.out.printf("풍속: %sm/s\n", k03_ws);												// 풍속은 단위인 m/s을 붙여서 출력함
			System.out.printf("풍향: %s\n", getWd(Integer.parseInt(k03_wd)));						// wd는 숫자코드로 받아서 함수를 통해 문자열로 출력함
			System.out.printf("풍향(한국어): %s\n", k03_wdKor);										// 풍향 한국어를 출력함
			System.out.printf("풍향(영어): %s\n", k03_wdEn);											// 풍향 영어를 출력함
			System.out.printf("습도: %s\n", k03_reh + "%");											// 습도 끝에 단위를 붙여서 출력함
			System.out.printf("6시간 예상 강수량: %smm\n", k03_r06);									// 강수량에 단위 mm를 붙여서 출력함
			System.out.printf("6시간 예상 적설량: %scm\n", k03_s06);									// 적설량에 단위 cm를 붙여서 출력함
			System.out.printf("****************************************\n");						// 구분선 출력함
		}	
	}
	
	public static String getDay(int day) {							// 숫자로 받아지는 일시 데이터를 정보값으로 변환
		String k03_dayStr = "";										// 정보를 담을 문자열 변수 선언
		String[] k03_dayArr = {"오늘", "내일", "모레"};				// 0은 오늘, 1은 내일, 2는 모레다.
		k03_dayStr = k03_dayArr[day];								// 배열에 정보를 넣고, 해당 인덱스값을 받아서 반환한다.
		return k03_dayStr;											// String을 반환한다.
	}
	
	public static String getSky(int sky) {							// 숫자로 받아지는 하늘 상태 데이터를 정보로 변환
		String k03_skyStr = "";										// 정보를 담을 문자열 변수 선언
		if (sky == 1) {												// sky정보는 0부터 시작이 아니라
			k03_skyStr = "맑음";										// 1부터 시작하기 때문에
		} else if (sky == 2) {										// 배열이 아닌 if문으로 정보를 반환해주었다.
			k03_skyStr = "구름조금";									// 1을 받을 경우 맑음을, 2를 받을 경우 구름조금을,
		} else if (sky == 3) {										// 3을 받을 경우 구름 많음을,
			k03_skyStr = "구름많음";									// 4를 받을 경우 흐림을 반환한다.
		} else if (sky == 4) {										// openApi에서 보내주는 정보는 숫자이기 때문에
			k03_skyStr = "흐림";										// 이와 같이 정보로 값을 변환해주어야
		} 															// 유저가 보기에 편하다.
		return k03_skyStr;
	}

	public static String getPty(int pty) {							// 숫자로 받아지는 강수 상태코드를 정보로 변환
		String k03_ptyStr = "";										// 정보를 담을 문자열 변수 선언
		String[] k03_ptyArr = {"없음", "비", "비/눈", "비/눈", "눈"};	// 강수 상태 정보를 배열에 넣었다.
		k03_ptyStr = k03_ptyArr[pty];								// 해당 배열에 전달받은 인덱스를 넣으면 정보를 얻을 수 있다.
		return k03_ptyStr;											// 문자열을 반환한다.
	}

	public static String getWd(int wd) {							// 풍향 코드를 문자열 정보로 변환
		String k03_wdStr = "";										// 정보를 담을 문자열 변수 선언
		String[] k03_wdArr = {"북", "북동", "동", "남동", "남", "남서", "서", "북서"};	// 배열에 풍향 정보를 넣음
		k03_wdStr = k03_wdArr[wd];									// 배열에 해당 인덱스를 넣으면 문자열로 반환
		return k03_wdStr;											// string반환
	}
}
