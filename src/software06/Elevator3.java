package sw06;

public class Elevator3 extends Elevator2{
	/* 상속 2021-04-27 kopo03 김도연 */
	
	void Repair() {
		k03_help = String.format("수리중입니다");
	}
	
	/* 오버라이딩 2021-04-27 kopo03 김도연 */
	
	void up() {
		if (k03_floor >= k03_limit_up_floor) {
			k03_help = "마지막층입니다.";
		} else {
			k03_floor = k03_floor + 2;
			k03_help = String.format("%d층입니다", k03_floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k03_help);
	}
}

