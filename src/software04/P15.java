package software04;

public class P15 {

	public static void main(String[] args) {
		// 단순비교 2021-04-02 kopo03 김도연
		
		int A, B; //선언
		
		A=0; //할당
		while(true) {//while문 선언. 라인 갯수 만들기
			B=0; //할당
			while(true) {//이중 while문 선언. 별 갯수 정하기
				System.out.printf("*"); //별 출력
				
				if(A==B) break; //라인 갯수와 별 갯수가 같아지면 break.
				B++; //변수의 반복적인 증가
			}
			
			System.out.printf("\n"); //줄바꿈
			A++; //무한루프가 되지 않으려면 변수가 변화해서 false인 상태를 만나도록 해야함
			if (A==30) break; //라인이 30줄이 되면 반복문 중단함
		}

	}

}
