package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P9 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\lesson08\\전국무료와이파이표준데이터.txt");	// File 클래스를 생성해서 file경로를 생성자로 전달한다.
		BufferedReader br = new BufferedReader(new FileReader(f));							// BufferedReader클래스는 fileReader클래스를 생성자로 받는다.

		String readtxt;																		// 파일의 각 라인을 읽어서 할당할 변수를 선언한다
																							// 파일에서 먼저 한 줄을 읽어와서 readtxt에 넣는다.
		if ((readtxt = br.readLine()) == null) {											// 파일의 라인이 null일 때는 파일에 내용물이 없는 경우다
			System.out.printf("빈 파일입니다\n");												// 파일이 비었을 때는 메세지를 출력해준다.
			return;																			// return할 값이 없으므로 return뒤에 아무것도 쓰지 않는다
		}																					// 읽어온 파일의 첫 번째 줄에는 필드명 정보가 있다.
		String[] field_name = readtxt.split("\t");											// 각 필드이름이 , 단위로 구분되어 있고, 각 항목을 받는 배열을 선언한다
		
		double lat = 37.3860521;															// 위도값
		double lng = 127.1214038;															// 경도값
		
		int LineCnt = 0;																	// 몇 번째 라인인지 세는 변수를 선언한다
		while ((readtxt = br.readLine()) != null) {											// 라인이 없을 때(null값을 가질 때)까지 반복하도록 반복문을 쓴다.
			
			String[] field = readtxt.split("\t");											// 받은 라인을 ,로 구분해서 각 항목을 배열에 넣는다
			System.out.printf("**[%d번째항목]*******************\n", LineCnt);				// lineCnt는 각 라인이 몇 번째 라인인지 세는 것이다.
			System.out.printf(" %s : %s\n", field_name[9], field[9]);						// 지번주소
			System.out.printf(" %s : %s\n", field_name[12], field[12]);						// 위도 주소
			System.out.printf(" %s : %s\n", field_name[13], field[13]);						// 경도 주소
			
			double dist;																	// 거리를 계산할 변수를 더블로 선언한다.
			try {																			// 불완전한 데이터를 예외처리하기 위해 try-catch문을 쓴다
				dist = Math.sqrt(															// Math.sqrt(num)는 num의 절댓값을 구해주는 메소드다.
						Math.pow(Double.parseDouble(field[12]) - lat, 2) 					// Math.pow(a, b)는 a의 b제곱 값을 반환해주는 메소드다.
						+ Math.pow(Double.parseDouble(field[13]) - lng, 2));				// 직선거리로 데이터의 위도 경도 값에서 lat, lng변수의 위도 경도 값을 뺀 뒤
			} catch (NumberFormatException e) {												// 제곱을 더한 값에서 제곱근을 구해 거리를 구한다
				dist = -1;																	// 위도 경도 값이 없는 데이터는 거리를 -1으로 처리했다.
			}

			System.out.printf(" 현재 지점과 거리 : %f\n", dist);
			System.out.printf("******************************\n");							// 다음 라인과의 구분을 위해 구분선을 만든다
			if(LineCnt == 100) break;														// line이 0~100번째 일 때까지만 반복하고 break로 while문을 빠져나간다
			LineCnt++;																		// 반복문을 돌 때 lineCnt를 하나씩 올려주어 라인을 센다.
		}
		br.close();																			// bufferedReader를 close한다.
	}
}