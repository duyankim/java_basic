package software03;

public class P13 {

	public static int k03_taxCal(int val, int rate) { //세전 금액과 세율을 인자로 받음
		//1. 단순 세금 계산 2021-04-01 kopo03 김도연
		int k03_ret; //리턴값 선언
		
		//실수형으로 계산했을 때의 리턴값이 정수형의 리턴값과 동일하다면 해당 리턴값을 리턴
		if ( ((double)val * (double)rate / 100.0) == val * rate /100) {
			//파라미터 rate는 100퍼센트에서의 세율을 뜻하므로 100을 나누어준다.
			k03_ret = val * rate /100; //연산
		} else { 
			//실수형으로 계산했을 때의 리턴값이 정수형의 리턴값과 다르다면 1원 더 받아야 한다
			k03_ret = val * rate / 100 + 1;
		}
		return k03_ret; //리턴
	}
	
	public static void main(String[] args) { //메인 메소드
		int k03_val = 271; //세전 물건값
		int k03_rate = 3; //세금 3퍼센트
		
		int k03_tax = k03_taxCal(k03_val, k03_rate);  //메소드에 인자로 전달
		
		System.out.printf("******************************\n"); // 구분선 출력
		System.out.printf("*         단순 세금 계산         *\n"); // 제목 출력
		System.out.printf("실제 세금 계산: %f\n", k03_val*k03_rate/100.0); //실제 세금은 소수점 단위까지 있다.
		System.out.printf("세전가격: %d 세금: %d 세포함가격: %d\n", k03_val, k03_tax, k03_val+k03_tax); //항목별 출력
		System.out.printf("******************************\n"); // 구분선 출력
	}
}
