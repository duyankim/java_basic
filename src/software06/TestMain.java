package sw06;

public class TestMain {
	/* 클래스, 객체, 인스턴스2 2021-04-27 kopo03 김도연 */
	private static int k03_inVal;
	
	public static void k03_up() {
		k03_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k03_inVal);
	}
	
	public static void main(String[] args) {
		k03_inVal = 0;
		Elevator elev;
		elev = new Elevator();
		
		k03_up();
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			elev.up();
			System.out.printf("MSG[%s]\n", elev.k03_help);
		}
		
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.k03_help);
		}
	}
}
