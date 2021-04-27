package sw06;

public class Calc2 {
	/* 메소드 오버로딩-성적표 2021-04-27 kopo03 김도연 */
	public int k03_sum(int k03_a, int k03_b, int k03_c) {
		return k03_a + k03_b + k03_c;
	}

	public int k03_sum(int k03_a, int k03_b, int k03_c, int k03_d) {
		return k03_a + k03_b + k03_c + k03_d;
	}
	
	public int k03_sum(int k03_a, int k03_b, int k03_c, int k03_d, int k03_e) {
		return k03_a + k03_b + k03_c + k03_d + k03_e;
	}

	public double k03_ave(int k03_a, int k03_b, int k03_c) {
		return k03_sum(k03_a,k03_b,k03_c) / 3;
	}

	public double k03_ave(int k03_a, int k03_b, int k03_c, int k03_d) {
		return k03_sum(k03_a,k03_b,k03_c,k03_d) / 4;
	}
	
	public double k03_ave(int k03_a, int k03_b, int k03_c, int k03_d, int e) {
		return k03_sum(k03_a,k03_b,k03_c,k03_d,e) / 5;
	}
}
