package software08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class P9Q2 {

	public static void main(String[] args) throws Exception {
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
		
		double min = 100, max = 0;															// 가장 가까운 곳, 가장 먼 곳의 거리를 넣을 변수
		String minName = " ", maxName = " ";												// 가장 가까운 곳, 가장 먼 곳의 지번 주소를 넣을 변수
		
		while ((readtxt = br.readLine()) != null) {											// 라인이 없을 때(null값을 가질 때)까지 반복하도록 반복문을 쓴다.
			
			String[] field = readtxt.split("\t");											// 받은 라인을 ,로 구분해서 각 항목을 배열에 넣는다
			
			double dist;																	// 거리를 계산할 변수를 더블로 선언한다.
			try {																			// 불완전한 데이터를 예외처리하기 위해 try-catch문을 쓴다
				dist = Math.sqrt(Math.pow(Double.parseDouble(field[12]) - lat, 2)			// Math.sqrt(num)는 num의 절댓값을 구해주는 메소드다.
						+ Math.pow(Double.parseDouble(field[13]) - lng, 2)); 																	// Math.pow(a, b)는 a의 b제곱 값을 반환해주는 메소드다.
																							// 직선거리로 데이터의 위도 경도 값에서 lat, lng변수의 위도 경도 값을 뺀 뒤
			} catch (NumberFormatException e) {												// 제곱을 더한 값에서 제곱근을 구해 거리를 구한다
				dist = -1;																	// 위도 경도 값이 없는 데이터는 거리를 0.0으로 처리했다.
			}
			
			if (dist != -1 && field[9] != "") {																// -1로 처리한 null값은 계산되지 않게 양수일 때만 조건 만족
				if (dist < min) {															// 최소값을 구하기 위해 초기값을 100으로 설정하고, 최소값보다 dist가 작으면 dist를 min에 할당
					min =  dist;															// 지번 주소가 없는 경우엔 min값으로 할당하지 않음
					minName = field[9];														// min값의 지번주소를 minName에 할당함
				} 
				if (dist > max) {															// 최댓값의 초기값을 0으로 설정하고, 최댓값보다 큰 dist가 나오면 min에 dist를 할당
					max = dist;																// 지번 주소가 없는 경우엔 max값으로 할당하지 않음
					maxName = field[9];														// max값이 바뀌어서 dist와 값이 동일할 때 maxName에 지번 주소 할당
				}
			}
			
		}
		br.close();																			// bufferedReader를 close한다.
		
		System.out.printf(" 가장 가까운 곳 : %s\n 기준 위치와의 거리 : %f\n", minName, min);		// 가장 가까운 곳의 지번주소를 나타내는 minName과 최소거리인 min출력
		System.out.printf(" 가장 먼 곳 : %s\n 기준 위치와의 거리 : %f\n", maxName, max);			// 가장 먼 곳의 지번주소를 나타내는 maxName과 최대거리인 max출력
	}
}
