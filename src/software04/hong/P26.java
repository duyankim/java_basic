package software04;

public class P26 {

	public static void main(String[] args) {
		// sin함수 그래프 2021-04-02 kopo03 김도연
		
		double fSin; //변수 선언
		
		for(int i=0; i<360; i++) {//0부터 360도 미만으로 반복
			/*
			 * 원을 그리기 위해서는 빗변의 길이와 대변의 비율을 알아야 한다.
			 * Math.sin()을 이용해서 구하려면 인자값에 각도를 라디안으로 변환해서 넣어야 한다.
			 * 각도를 라디안으로 변환하려면 30 * PI / 180으로 표현할 수 있다.
			 */
			fSin = Math.sin(i * 3.141592 / 180);  //각도 변수를 sin함수에 넣어주어 빗변과 대변의 비를 구한다.
			
			System.out.printf("%d sin ==> %f\n", i, fSin);
			//180도를 기준으로 대칭적인 값이 나온다. 181도부터는 음수값이 나온다.
		}

		for(int i=0; i<360; i++) {//0도부터 359도까지
			fSin = Math.sin(i * 3.141592 / 180); //빗변과 대변의 비를 fSin에 할당
			
			int iSpace = (int)((1.0- fSin) * 50); //1.0에서 fSin을 빼서 양수값을 만들고 0부터 99까지의 값을 만들기 위해 50을 곱한다
			//공백 갯수는 정수형이어야 하므로 int로 캐스팅한다. 
			
			for (int j=0; j<iSpace; j++) System.out.printf(" "); //iSpace값으로 공백을 만든다
			System.out.printf("*[%f][%d]\n", fSin, iSpace); //fSin이 음수 또는 0일때는 50이상의 iSpace가, 양수일때는 49이하의 iSpace가 생긴다.
		}
	}

}
