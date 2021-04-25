package software08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7 {

	/* Buffered 읽고 쓰기 2021-04-25 kopo03 김도연 */
	public static void FileWrite() throws IOException { 				// 파일을 작성하는 클래스. 에러 발생 시 IOException을 던져준다.
		File k03_f = new File("C:\\test.txt"); 							// File 클래스를 가져와서 file경로를 생성자로 전달한다.
		BufferedWriter k03_bw = new BufferedWriter(new FileWriter(k03_f));	// BufferedWriter클래스는 fileWriter클래스를 생성자로 받는다.

		k03_bw.write("안녕 파일");										// write()메소드로 파일에 출력할 수 있다.
		k03_bw.newLine();												// newLine()메소드로 다음 라인으로 이동할 수 있다.
		k03_bw.write("hello 헬로");										// write()메소드로 파일에 출력할 수 있다.
		k03_bw.newLine();												// newLine()메소드로 다음 라인으로 이동할 수 있다.

		k03_bw.close();													// bufferedWriter를 닫아주어야 파일을 올바르게 작성할 수 있다.
	}

	public static void FileRead() throws IOException {					// 파일을 읽어오는 클래스. 에러 발생시 IOException이 필요하다.
		File k03_f = new File("C:\\test.txt");							// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader k03_br = new BufferedReader(new FileReader(k03_f));	// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		String k03_readtxt;												// FileReader와 다르게 char단위가 아닌 라인 단위로 파일을 읽을 것이다.
																		// 따라서 char가 아닌 String으로 변수를 선언한다.
		while ((k03_readtxt = k03_br.readLine()) != null) {				// readLine()메소드는 파일을 라인 단위로 읽어온다. 라인이 없으면 null을 반환한다
			System.out.printf("%s\n", k03_readtxt);						// 읽어온 라인을 콘솔에 프린트한다.
		}
		k03_br.close();													// bufferedReader를 close해준다.
	}

	public static void main(String[] args) throws IOException {			// main클래스에서도 IOException처리를 해주어야 한다.
		FileWrite();													// FileWrite() 메소드로 file에 입력한다.
		FileRead();														// FileRead() 메소드로 파일의 내용을 읽는다.
	}
}
