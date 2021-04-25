package software08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P11Q1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\StockDailyPrice.csv");	// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader br = new BufferedReader(new FileReader(f));								// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		File f1 = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\A005930.csv");		// 작성할 csv파일을 경로로 설정함
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));							// BufferedWriter클래스는 fileWriter클래스를 생성자로 받는다.
		
		String readtxt;																			// 파일의 각 라인을 읽어서 할당할 변수를 선언한다

		int cnt = 0; int wcnt = 0;																// reader를 위한 cnt, writer를 위한 wcnt를 선언한다.
		while ((readtxt = br.readLine()) != null) {												// BufferedReader가 읽어온 라인이 null이 아닐 때까지 반복한다.
			StringBuffer s = new StringBuffer();												// StringBuffer클래스를 가져와서 변수 s에 할당한다.
			String[] field = readtxt.split(",");												// ^%_%^중에서 %_%를 구분자로 field 배열을 만든다.
			
			if (field.length > 2 && field[2].equals("A005930")) { 								// 필드의 길이가 2 이상일 때, 종목코드가 A로 시작할 때
				s.append(field[0]);																// 첫 번째 field의 ^를 공백으로 대체하고 공백을 trim해서
																								// StringBuffer s에 추가한다.
				for (int j=1; j<field.length; j++) {											// 두 번째 field부터 마지막 field까지 반복해서  
					s.append("," + field[j]);													// 콤마를 넣은 뒤 ^를 제거한다.
				}
				bw1.write(s.toString());														// 파일에 StringBuffer s를 쓴다.
				bw1.newLine();																	// 다음 라인으로 이동시킨다.
				wcnt++; 																		// 쓰는 라인 카운트를 하나씩 올려준다.
				System.out.printf("[%s]***\n", s.toString());
			}
			cnt++;																				// 읽는 라인 카운트를 하나씩 올려준다.
		}
		br.close();																				// BufferedReader를 닫는다.
		bw1.close();																			// BufferedWriter를 닫는다.

		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);							// 프로그램이 종료되었다는 메세지를 띄운다.
	}

}
