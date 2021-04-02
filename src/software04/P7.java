package software04;

public class P7 {

	public static void main(String[] args) {
		// for문 2021-04-02 kopo03 김도연
		int sum=0; //총합 초기화
		for (int i=0; i<10; i++) { //0부터 9까지 반복
			sum = sum + i; //반복하면서 각 증가하는 i들의 총합을 구함
		}
		System.out.printf("sum %d\n", sum); //총합 프린트
		
		for(int i=1; i<10; i++) {//1~9까지 반복
			System.out.printf("************\n", i); //구분선
			System.out.printf("  구구단 %d단\n",i); //구구단 n단 제목
			System.out.printf("************\n", i); //구분선
			for (int j=1; j<10; j++) { //곱해질 1부터 9까지의 수
				System.out.printf(" %d * %d = %d \n", i, j, i*j); //구구단 계산
			}
		}
	}

}
