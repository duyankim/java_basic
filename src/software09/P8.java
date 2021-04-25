package software09;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class P8 {

	/* XML파싱 기본 2021-04-25 kopo03 김도연 */
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		
		DocumentBuilder k03_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// XML문서 파싱을 위한 준비하기
		Document k03_doc = k03_docBuilder.parse("C:\\Users\\USER\\Desktop\\lesson08\\score.xml");	// org.w3c.dom.Document interface 상속
																									// XML파일을 처리하는 파싱의 시작
		Element k03_root = k03_doc.getDocumentElement();											// DOM의 ROOT구하기
		
		NodeList k03_tag_name = k03_doc.getElementsByTagName("name");								// org.w3c.dom.NodeList 인터페이스를 상속해서
		NodeList k03_tag_studentid = k03_doc.getElementsByTagName("studentid");						// getElementsByTagName()메소드로 태그 element를
		NodeList k03_tag_kor = k03_doc.getElementsByTagName("kor");									// 가져올 수 있다. 이 과정은 document에서
		NodeList k03_tag_eng = k03_doc.getElementsByTagName("eng");									// nodeList 객체를 얻어서 각 태그의 객체를
		NodeList k03_tag_mat = k03_doc.getElementsByTagName("mat");									// 변수에 할당하는 과정이다.
		
		System.out.printf("****************************************\n");							// 구분선 출력
		for (int i = 0; i < k03_tag_name.getLength(); i++) {										// tag_name의 길이만큼=tag_name의 갯수만큼 반복한다.
			System.out.printf("이름 : %s\n", k03_tag_name.item(i).getFirstChild().getNodeValue());	// item(i)는 해당 태그들 중에서 i번째 name만 가져오는 것이다.
			System.out.printf("학번 : %s\n", k03_tag_studentid.item(i).getFirstChild().getNodeValue());	// getFirstChild()는 해당 node의 첫번째 자식만 가져오는 것이다.
			System.out.printf("국어 : %s\n", k03_tag_kor.item(i).getFirstChild().getNodeValue());	// 노드는 트리구조이기 때문에 자식이 여럿일 수도 있기 때문이다.
			System.out.printf("영어 : %s\n", k03_tag_eng.item(i).getFirstChild().getNodeValue());	// getNodeValue()는 해당 node의 text값을 가져오겠다는 것이다.
			System.out.printf("수학 : %s\n", k03_tag_mat.item(i).getFirstChild().getNodeValue());	// 따라서 이 반복문은 각 태그의 text를 가져오게 된다.
			System.out.printf("****************************************\n");						// 구분선 출력
		}
	}

}
