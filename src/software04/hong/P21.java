package software04;

public class P21 {

	public static void main(String[] args) {
		// array 이용 비교 2021-04-02 kopo03 김도연
		int[] LMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //매 달 마지막 날을 배열로 만듦
		
		for(int i=1; i<13; i++) { //1월부터 12까지 반복
			System.out.printf(" %d월 =>", i); //월 출력
			
			for (int j=1; j<32; j++) {//1일부터 31일까지
				System.out.printf("%d", j); //일 출력
				
				if(LMD[i-1] == j) break; //배열은 0부터 인덱스가 시작하기 때문에 해당 월에서 1을 뺀 인덱스가
				//배열에서 가진 달의 마지막일자를 구해서 반복문의 변수와 일치하면 반복 멈춤
				
				System.out.printf(","); // 콤마 출력을 break이후에 넣어서 마지막 일에는 콤마를 안 찍기
			}
			System.out.printf("\n"); //줄 바꾸기
		}
	}
}
