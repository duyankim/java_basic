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

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document doc = docBuilder.parse("C:\\Users\\USER\\Desktop\\lesson08\\score.xml");
		
		Element root = doc.getDocumentElement();
		
		NodeList tag_name = doc.getElementsByTagName("name");
		NodeList tag_studentid = doc.getElementsByTagName("studentid");
		NodeList tag_kor = doc.getElementsByTagName("kor");
		NodeList tag_eng = doc.getElementsByTagName("eng");
		NodeList tag_mat = doc.getElementsByTagName("mat");
		
		System.out.printf("****************************************\n");
		for (int i = 0; i < tag_name.getLength(); i++) {
			System.out.printf("이름 : %s\n", tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.printf("****************************************\n");
		}
	}

}
