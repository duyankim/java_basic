package sw06;

public class TestMain2 {
	
	/* 메소드 오버로딩 2021-04-27 kopo03 김도연 */
	public static void main(String[] args) {
		Calc1 k03_cc = new Calc1();
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k03_cc.k03_sum(1, 2));
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k03_cc.k03_sum(1, 2, 3));
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k03_cc.k03_sum(1, 2, 3, 4));
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k03_cc.k03_sum(1.3, 2.4));
	}

}
