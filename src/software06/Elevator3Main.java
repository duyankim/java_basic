package sw06;

public class Elevator3Main {
	/* 상속 2021-04-27 kopo03 김도연 */
	
	public static void main(String[] args) {
		Elevator3 k03_elev3;
		
		k03_elev3 = new Elevator3();
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			k03_elev3.up();
			System.out.printf("MSG elev3[%s]\n", k03_elev3.k03_help);
		}
		
		k03_elev3 = new Elevator3();
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			k03_elev3.up();
			System.out.printf("MSG elev3[%s]\n", k03_elev3.k03_help);
		}
		
		k03_elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", k03_elev3.k03_help);
	}

}

