package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P10 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\lesson08\\day_data\\THTSKS010H00.dat");// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader br = new BufferedReader(new FileReader(f));							// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		String readtxt;
		int LineCnt = 0;
		int n = -1;
		StringBuffer s = new StringBuffer();
		while(true) {
			char[] ch = new char[1000];
			
			n = br.read(ch);
			
			if (n == -1) break;
			
			for (char c : ch) {
				if (c == '\n') {
					System.out.printf("[%s]***\n", s.toString());
					s.delete(0, s.length());
				} else {
					s.append(c);
				}
			}
			LineCnt++;
		}
		System.out.printf("[%s]***\n", s.toString());
		br.close();
	}

}
