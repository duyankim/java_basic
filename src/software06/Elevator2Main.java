package sw06;

public class Elevator2Main {
	/* 생성자 2021-04-27 kopo03 김도연 */
	
	static Elevator2 k03_elev1;
	static Elevator2 k03_elev2;
	static Elevator2 k03_elev3;
	
	public static void main(String[] args) {
		k03_elev1 = new Elevator2();
		k03_elev2 = new Elevator2(20, 1, 8);
		k03_elev3 = new Elevator2(50, -3, 5);

		for (int k03_i = 0; k03_i < 20; k03_i++) {
			k03_elev1.up(); k03_elev1.msg("1번 엘레베이터 1층씩 오르기");
		}
		
		for (int k03_i = 0; k03_i < 20; k03_i++) {
			k03_elev1.up(2); k03_elev1.msg("1번 엘레베이터 2층씩 오르기");
		}
		
		for (int k03_i = 0; k03_i < 20; k03_i++) {
			k03_elev1.down(3); k03_elev1.msg("1번 엘레베이터 3층씩 내리기");
		}
	}
}
