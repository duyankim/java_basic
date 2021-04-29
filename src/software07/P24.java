package software07;

public class P24 {

	public static void main(String[] args) {
		/* 배열의 최대, 최소값 찾기 2021-04-28 kopo03 김도연 */
		
		int[] k03_Array = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33};
		
		for(int k03_i = 0; k03_i < k03_Array.length; k03_i++) {					// 배열 순서와 각 인덱스값 출력하기
			System.out.printf("Array[%d]=%d\n", k03_i, k03_Array[k03_i]);
		}
		
		int k03_Max = k03_Array[0];												// 처음 시작부터 배열 시작
		int k03_MaxPt = 0;														// 맥스 배열의 포지션 값
		for (int k03_i = 0; k03_i < k03_Array.length; k03_i++) {				// 배열 갯수만큼 루프 반복
			if (k03_Max < k03_Array[k03_i]) {									// 만일 기존 맥스 변수보다 배열값이 크다면
				k03_Max = k03_Array[k03_i];										// 기존 맥스 변수값은 배열값으로 바꾸고
				k03_MaxPt = k03_i;												// 기존 맥스 변수의 배열 위치값도 바꾸고
			}
		}
		System.out.printf("MAX : Array[%d]=%d\n", k03_MaxPt, k03_Max);
	}

}