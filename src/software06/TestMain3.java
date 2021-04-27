package sw06;

public class TestMain3 {

	public static void main(String[] args) {
		/* 오버라이딩 2021-04-27 kopo03 김도연 */
		Elevator3 elev3;
		
		elev3 = new Elevator3();
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			elev3.up();
			System.out.printf("MSG elev3[%s]\n", elev3.k03_help);
		}
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			elev3.down();
			System.out.printf("MSG elev3[%s]\n", elev3.k03_help);
		}
		elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", elev3.k03_help);
	}

}
