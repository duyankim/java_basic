package software08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P11 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\THTSKS010H00.dat");// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader br = new BufferedReader(new FileReader(f));							// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		File f1 = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\StockDailyPrice.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		
		String readtxt;																		// 파일의 각 라인을 읽어서 할당할 변수를 선언한다

		int cnt = 0; int wcnt = 0;
		while ((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();
			String[] field = readtxt.split("%_%");
			
			if (field.length > 2 && field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				s.append(field[0].replace("^", "").trim());
				
				for (int j=1; j<field.length; j++) {
					s.append("," + field[j].replace("^", "").trim());
				}
				bw1.write(s.toString());
				bw1.newLine();
				wcnt++;
				System.out.printf("write [%d][%d][%s]\n", cnt, wcnt, s.toString());
			}
			cnt++;
		}
		br.close();
		bw1.close();
		
		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);
	}

}
