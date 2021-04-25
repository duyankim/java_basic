package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P11Q3 {

	/* 스스로 실습3 2021-04-25 kopo03 김도연 */
	public static void main(String[] args) throws IOException {
		File k03_f = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\A005930.csv");	// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader k03_br = new BufferedReader(new FileReader(k03_f));					// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		String k03_readtxt;																	// 파일의 각 라인을 읽어서 할당할 변수를 선언한다
		int k03_max=0, k03_min=9999999;
		int k03_cnt = 0; 																	// reader를 위한 cnt를 선언한다.
		while ((k03_readtxt = k03_br.readLine()) != null) {									// BufferedReader가 읽어온 라인이 null이 아닐 때까지 반복한다.
			String[] k03_field = k03_readtxt.split(",");									// ^%_%^중에서 %_%를 구분자로 field 배열을 만든다.
			int k03_closingPrice;															// 종가를 할당할 변수를 선언한다.
			if (k03_field[1].substring(0, 4).equals("2015")) { 								// 필드의 길이가 2 이상일 때, 종목코드가 A로 시작할 때
																							// StringBuffer s에 추가한다.
				k03_closingPrice = Integer.parseInt(k03_field[3]);							// 종가에 field[3]의 스트링값을 int로 변환해 할당한다		
				k03_max = k03_max < k03_closingPrice ? k03_closingPrice : k03_max;			// 최대값보다 closingPrice가 더 클경우 최대값에 할당한다.
				k03_min = k03_min < k03_closingPrice ? k03_min : k03_closingPrice;			// 최소값보다 closingPrice가 더 작을 경우 최소값에 할당한다.
			}
			k03_cnt++;																		// 읽는 라인 카운트를 하나씩 올려준다.
		}
		k03_br.close();																		// BufferedReader를 닫는다.

		System.out.printf("Program End[%d]records\n", k03_cnt);								// 프로그램이 종료되었다는 메세지를 띄운다.
		System.out.printf("2015년 삼성전자 주가 최대값 : %d\n", k03_max);						// 2015년 삼성전자의 최대값을 프린트한다.
		System.out.printf("2015년 삼성전자 주가 최소값 : %d", k03_min);							// 2015년 삼성전자의 최소값을 프린트한다.
	}
}
