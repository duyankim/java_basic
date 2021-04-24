package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P8 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\lesson08\\전국무료와이파이표준데이터.csv");	// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader br = new BufferedReader(new FileReader(f));							// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		String readtxt;																		// 파일의 각 라인을 읽어서 할당할 변수를 선언한다
																							// 파일에서 먼저 한 줄을 읽어와서 readtxt에 넣는다.
		if ((readtxt = br.readLine()) == null) {											// 파일의 라인이 null일 때는 파일에 내용물이 없는 경우다
			System.out.printf("빈 파일입니다\n");												// 파일이 비었을 때는 메세지를 출력해준다.
			return;																			// return할 값이 없으므로 return뒤에 아무것도 쓰지 않는다
		}																					// 읽어온 파일의 첫 번째 줄에는 필드명 정보가 있다.
		String[] field_name = readtxt.split(",");											// 각 필드이름이 , 단위로 구분되어 있고, 각 항목을 받는 배열을 선언한다
		
		int LineCnt = 0;																	// 몇 번째 라인인지 세는 변수를 선언한다
		while ((readtxt = br.readLine()) != null) {											// 라인이 없을 때(null값을 가질 때)까지 반복하도록 반복문을 쓴다.
			String[] field = readtxt.split(",");											// 받은 라인을 ,로 구분해서 각 항목을 배열에 넣는다
			System.out.printf("**[%d번째항목]*******************\n", LineCnt);				// lineCnt는 각 라인이 몇 번째 라인인지 세는 것이다.
			
			for (int j=0; j < field_name.length; j++) {										// 필드 이름의 길이 만큼 반복문을 돌면서
				System.out.printf(" %s : %s\n", field_name[j], field[j]);					// 필드 이름 : 필드의 값 포멧으로 각 항목을 출력한다.
			}
			
			System.out.printf("******************************\n");							// 다음 라인과의 구분을 위해 구분선을 만든다
			if(LineCnt == 100) break;														// line이 0~100번째 일 때까지만 반복하고 break로 while문을 빠져나간다
			LineCnt++;																		// 반복문을 돌 때 lineCnt를 하나씩 올려주어 라인을 센다.
		}
		br.close();																			// bufferedReader를 close한다.
	}
}
