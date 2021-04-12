package software04.hong;

public class P24 {

	public static void main(String[] args) {
		// 띄어쓰기 연습 2021-04-02 kopo03 김도연
		
		for (int k03_i=0; k03_i<10; k03_i++) { //0줄부터 9줄까지 반복하는 반복문이다.
			for(int k03_j=0; k03_j<k03_i; k03_j++) System.out.printf(" "); //숫자 크기만큼 공백 출력한다.
			System.out.printf("%d\n", k03_i); //0부터 9까지 반복해서 출력한다.
		}
	}
}
