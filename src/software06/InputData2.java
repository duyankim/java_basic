package software06;

public class InputData2 {

	/* 성적집계표 출력 - 다페이지 2021-04-27 kopo03 김도연 */
	int[] korSum;									// 국어점수 합계를 넣을 배열 선언
	int[] engSum;									// 영어점수 합계를 넣을 배열 선언
	int[] matSum;									// 수학점수 합계를 넣을 배열 선언

	String[] k03_name; 								// 이름을 넣을 String 배열 선언
	int[] k03_kor;									// 국어 점수를 넣을 int 배열 선언
	int[] k03_eng;									// 영어 점수를 넣을 int 배열 선언
	int[] k03_mat;									// 수학 점수를 넣을 int 배열 선언
	int[] k03_sum;									// 총점을 넣을 int 배열 선언
	double[] k03_ave;								// 평균 점수를 넣을 double 배열 선언

	InputData2(int k03_i, int lines, int pages) {	// main에서 i개의 배열을 만드는 데 사용함
		k03_name = new String[k03_i];				// InputData 메소드
		k03_kor = new int[k03_i];					// 각각 name, kor, eng, mat, sum, ave배열의
		k03_eng = new int[k03_i];					// 크기를 만들어주고
		k03_mat = new int[k03_i];					// 배열을 생성한다.
		k03_sum = new int[k03_i];					// 아직 값이 들어가지 않는 sum과 ave배열도
		k03_ave = new double[k03_i];				// 이 때 만들어주었다.
		korSum = new int[pages];					// 국어 점수 합계 배열을 만들어줌
		engSum = new int[pages];					// 영어 점수 합계 배열을 만들어줌
		matSum = new int[pages];					// 수학 점수 합계 배열을 만들어줌
	}
	
	public void SetData(int k03_i, String k03_n, int k03_k, int k03_e, int k03_m) {
		k03_name[k03_i] = k03_n;					// main에서 setData 메소드를 이용해
		k03_kor[k03_i] = k03_k;						// 번호 i, 이름, 국어점수, 영어점수, 수학점수를
		k03_eng[k03_i] = k03_e;						// 입력받는다. 이 입력받은 데이터는
		k03_mat[k03_i] = k03_m;						// 각 배열의 각 인덱스에 넣어준다.
	}
	
	int sum(int k03_i) {							// 합계는 간단하게 메소드로 만들었다.
		return k03_kor[k03_i] + k03_eng[k03_i] + k03_mat[k03_i];// index를 입력받으면 국어, 영어, 수학 배열의
	}												// 각 인덱스 값을 더해서 총점을 구한다.
	
	void setSumAve(int start, int lines) {								// 총점 배열을 만드는 메소드다.			
		for (int k03_i = start; k03_i < lines; k03_i++) {
			k03_sum[k03_i] = k03_kor[k03_i] + k03_eng[k03_i] + k03_mat[k03_i];	// sum메소드로 총점을 계산해 sum배열의 인덱스에 넣는다.
			k03_ave[k03_i] = k03_sum[k03_i] / 3.0;	// 평균 배열의 각 인덱스에 합계 값을 3.0으로 나눈 값을
		}	
	}

	void setSumArr(int page, int start, int limit) {

		for (int i = start; i < limit; i++) {
			korSum[page] += k03_kor[i];
			engSum[page] += k03_eng[i];
			matSum[page] += k03_mat[i];
		}
	}
}
