package software03;

public class P7 {

	public static void main(String[] args) {
		//3. 누적하기, 합구하기 2021-04-01 kopo03 김도연
		int k03_sum; //변수 선언
		
		k03_sum = 0; //총합 초기화
		
		for (int i=1; i<101; i++) //1 ~ 100
		{
			k03_sum = k03_sum + i; // 반복해서 더해 총합 구하기
		}
		System.out.printf("#2 : %d \n", k03_sum); //총합 출력
		
		System.out.printf("#2-2 : %d\n", k03_sum/100); //평균 출력

		//배열을 사용한 응용
		int[] k03_v = {1,2,3,4,5}; //배열 선언
		int k03_Vsum; //초기화
		
		k03_Vsum=0; //할당
		
		for (int i=0; i < 5; i++) { //0 ~ 4 반복문
			k03_Vsum = k03_Vsum + k03_v[i]; //반복해서 모든 인덱스의 합을 구함
		}
		
		System.out.printf("#2-3 : %d\n", k03_Vsum); //출력
	}

}
