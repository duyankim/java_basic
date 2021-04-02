package software04;

public class P27 {

	public static void main(String[] args) {
		// sin함수 그래프 2021-04-02 kopo03 김도연
		
		int n, m; //n과 m을 선언
		m = 20; n = 1; //m과 n에 각각 30, 1할당
		
		while(true) { // true일 때 반복하는 while문 작성
			
			for (int i=0; i<m; i++) System.out.printf(" "); //m보다 작을 때 반복해서 공백 출력
			for (int i=0; i<n; i++) System.out.printf("*"); //n보다 작을 때 반복해서 *찍기
			System.out.printf("\n"); //줄바꿈
			
			m = m-1; //m은 1씩 감소함
			n = n+2; //n은 2씩 증가해서 대칭이 맞는 별트리가 됨
			
			if (m < 0) break; //m이 0보다 작아지면 break
		}
	}

}
