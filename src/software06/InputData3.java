package software06;

public class InputData3 {

	/* 성적집계표 출력 2021-04-27 kopo03 김도연 */
	int[] korSum;									// 국어점수 합계를 넣을 배열 선언
	int[] engSum;									// 영어점수 합계를 넣을 배열 선언
	int[] matSum;									// 수학점수 합계를 넣을 배열 선언
	int[] sumSum;									// 합계의 합계를 넣을 배열 선언
	double[] aveSum;								// 평균의 합계를 넣을 배열 선언
	
	String[] k03_name; 								// 이름을 넣을 String 배열 선언
	int[] k03_kor;									// 국어 점수를 넣을 int 배열 선언
	int[] k03_eng;									// 영어 점수를 넣을 int 배열 선언
	int[] k03_mat;									// 수학 점수를 넣을 int 배열 선언
	int[] k03_sum;									// 총점을 넣을 int 배열 선언
	double[] k03_ave;								// 평균 점수를 넣을 double 배열 선언

	InputData3(int k03_i) {							// main에서 i개의 배열을 만드는 데 사용한
		k03_name = new String[k03_i];				// InputData 메소드
		k03_kor = new int[k03_i];					// 각각 name, kor, eng, mat, sum, ave배열의
		k03_eng = new int[k03_i];					// 크기를 만들어주고
		k03_mat = new int[k03_i];					// 배열을 생성한다.
		k03_sum = new int[k03_i];					// 아직 값이 들어가지 않는 sum과 ave배열도
		k03_ave = new double[k03_i];				// 이 때 만들어주었다.
		korSum = new int[k03_i];					// 국어 점수 합계 배열을 만들어줌
		engSum = new int[k03_i];					// 영어 점수 합계 배열을 만들어줌
		matSum = new int[k03_i];					// 수학 점수 합계 배열을 만들어줌
		sumSum = new int[k03_i];					// 합계의 합계 배열을 만들어줌
		aveSum = new double[k03_i];					// 평균의 합계 배열을 만들어줌
	}
	
	public void SetData(int k03_i, String k03_n, int k03_k, int k03_e, int k03_m) {
		k03_name[k03_i] = k03_n;					// main에서 setData 메소드를 이용해
		k03_kor[k03_i] = k03_k;						// 번호 i, 이름, 국어점수, 영어점수, 수학점수를
		k03_eng[k03_i] = k03_e;						// 입력받는다. 이 입력받은 데이터는
		k03_mat[k03_i] = k03_m;						// 각 배열의 각 인덱스에 넣어준다.
		setSum();									// 점수 배열 값이 들어왔으니, sum과 ave배열도
		setAve();									// 내용을 만들 수 있다.
		setSumAll();								// 모든 합계 배열을 만들어주는 메소드 호출
	}
	
	int sum(int k03_i) {							// 합계는 간단하게 메소드로 만들었다.
		return k03_kor[k03_i] + k03_eng[k03_i] + k03_mat[k03_i];// index를 입력받으면 국어, 영어, 수학 배열의
	}												// 각 인덱스 값을 더해서 총점을 구한다.
	
	int[] setSum() {								// 총점 배열을 만드는 메소드다.			
		for (int k03_j = 0; k03_j < k03_sum.length; k03_j++) {	// 총점 배열의 크기만큼 반복해서
			k03_sum[k03_j] = sum(k03_j);			// sum메소드로 총점을 계산해 sum배열의 인덱스에 넣는다.
		}
		return k03_sum;								// sum배열을 반환한다.
	}
	
	double[] setAve() {								// 평균 배열을 만드는 메소드다.
		for (int k03_j = 0; k03_j < k03_ave.length; k03_j++) {	// 평균 배열의 크기만큼 반복해서
			k03_ave[k03_j] = k03_sum[k03_j] / 3.0;	// 평균 배열의 각 인덱스에 합계 값을 3.0으로 나눈 값을
		}											// 넣어주고 ave배열을 반환한다.
		return k03_ave;
	}
	
	void setSumAll() {
		korSum[0] = k03_kor[0];						// 각 점수 배열의 0번째 인덱스에는
		engSum[0] = k03_eng[0];						// 각 과목의 0번째 값이 들어간다.
		matSum[0] = k03_mat[0];						// 합계를 구하기 위해서
		sumSum[0] = k03_sum[0];						// 1번째 인덱스부터 반복문을 사용할 것이기 때문에
		aveSum[0] = k03_ave[0];						// 0번째 인덱스는 먼저 넣어주었다.
		
		for (int k03_j = 1; k03_j < k03_sum.length; k03_j++) {	// 1번째 인덱스부터 끝까지 반복문을 돈다
			korSum[k03_j] = k03_kor[k03_j] + korSum[k03_j-1];	// 배열의 각 인덱스에는 해당 인덱스까지의
			engSum[k03_j] = k03_eng[k03_j] + engSum[k03_j-1];	// 합계가 담긴다. 따라서 해당 인덱스 바로 전 인덱스에
			matSum[k03_j] = k03_mat[k03_j] + matSum[k03_j-1];	// 현재 인덱스 값을 더한 것이
			sumSum[k03_j] = k03_sum[k03_j] + sumSum[k03_j-1];	// 합계 배열이 된다.
			aveSum[k03_j] = k03_ave[k03_j] + aveSum[k03_j-1];	// 배열로 만든 이유는 바로 꺼내서 사용하기 쉽기 때문이다.
		}
	}

	
}
