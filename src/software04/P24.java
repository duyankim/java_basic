package software04;

public class P24 {

	public static void main(String[] args) {
		// 띄어쓰기 연습 2021-04-02 kopo03 김도연
		
		for (int i=0; i<10; i++) { //0줄부터 9줄까지
			for(int j=0; j<i; j++) System.out.printf(" "); //숫자 크기만큼 공백 출력
			System.out.printf("%d\n", i); //0부터 9까지 반복해서 출력
		}
	}
}
