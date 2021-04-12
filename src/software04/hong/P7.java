package software04.hong;

public class P7 {

	public static void main(String[] args) {
		// for문 2021-04-02 kopo03 김도연
		int k03_sum=0; //총합 초기화를 하며 선언하는 선언부이다.
		for (int k03_i=0; k03_i<10; k03_i++) { //0부터 9까지 반복하기 위한 반복문이다.
			k03_sum = k03_sum + k03_i; //반복하면서 각 증가하는 i들의 총합을 구한다.
		}
		System.out.printf("sum %d\n", k03_sum); //총합 프린트하는 printf이다.
		
		for(int k03_i=1; k03_i<10; k03_i++) {//1~9까지 반복하기 위한 반복문이다.
			System.out.printf("************\n", k03_i); //구분선을 printf한다.
			System.out.printf("  구구단 %d단\n",k03_i); //구구단 n단 제목을 printf한다.
			System.out.printf("************\n", k03_i); //구분선을 printf한다.
			for (int k03_j=1; k03_j<10; k03_j++) { //곱해질 1부터 9까지의 수를 반복문으로 나타낸다.
				System.out.printf(" %d * %d = %d \n", k03_i, k03_j, k03_i*k03_j); //구구단 계산을 printf한다.
			}
		}
	}
}
