package software08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P6 {

	public static void main(String[] args) {
		
		/* 무식하게 읽고 쓰기 2021-04-25 kopo03 김도연 */
		try {											// 예외처리를 위해 try-catch문을 사용한다.
			File k03_f = new File("C:\\test.txt"); 		// file클래스의 생성자로 파일경로를 전달하고 File클래스를 생성한다.
			FileWriter k03_fw = new FileWriter(k03_f); 	// FileWriter 클래스에 File클래스를 생성자로 전달하고 filewriter를 생성한다.

			k03_fw.write("안녕 파일\n");					// 파일에 내용을 쓴다. write()가 대표적인 메소드다.
			k03_fw.write("hello 헬로\n");				// 파일에 영어와 한국어를 쓸 수 있다.

			k03_fw.close();								// fileWriter를 close() 메소드로 닫아주어야 파일에 정상적으로 텍스트가 적힌다.

			FileReader k03_fr = new FileReader(k03_f);	// 파일의 콘텐츠를 읽어들이는 FileReader클래스를 생성하고 파일 경로를 생성자로 전달한다.

			int k03_n = -1;								// 파일에 내용이 없을 경우 라인의 종료가 0이 아닌 -1으로 표시 되기 때문에, -1을 변수에 넣어준다.
			char[] k03_ch;								// 파일의 각 char를 읽어서 ch배열에 넣을 것이기 때문에 배열을 선언한다.

			while (true) {								// 파일의 모든 문장을 읽을 때까지 반복할 것이기 때문에 while(true)로 횟수 지정없는 반복문을 만든다.
				k03_ch = new char[100];					// char배열을 만든다. 넉넉하게 배열의 크기 100으로 선언한다.
				k03_n = k03_fr.read(k03_ch);			// 파일 리더의 read()메소드로 파일을 읽어들인다. char배열을 인자로 전달해 파일 전체를 읽는다.

				if (k03_n == -1) break;					// 파일에 더 이상 라인이 없을 때, n은 int -1을 반환한다.

				for (char c : k03_ch) {					// char배열 ch를 순회하는 반복문을 만든다.
					System.out.printf("%c", c);			// 배열의 각 글자를 printf한다.
				}
			}
			k03_fr.close();								// fileReader를 close() 메소드로 닫아주어야 한다.

			System.out.printf("\n FILE READ END");		// 파일을 모두 읽었다는 메세지를 써준다.
		} catch (Exception e) {							// 예외처리를 위해 Exception e 에러를 써준다.
			System.out.printf("에러 발생\n", e);			// 에러가 발생할 경우 출력될 메세지를 써준다.
		}
	}
}
