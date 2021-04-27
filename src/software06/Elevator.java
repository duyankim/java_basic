package sw06;

public class Elevator {
	/* 클래스, 객체, 인스턴스 2021-04-27 kopo03 김도연 */
	int k03_limit_up_floor = 10;
	int k03_limit_down_floor = 0;
	int k03_floor = 1;
	String k03_help;
	
	void up() {
		if (k03_floor == k03_limit_up_floor) {
			k03_help = "마지막 층입니다.";
		} else {
			k03_floor++;
			k03_help = String.format("%d층입니다", k03_floor);
		}
	}
	
	void down() {
		if (k03_floor == k03_limit_down_floor) {
			k03_help = "첫 번째 층입니다.";
		} else {
			k03_floor--;
			k03_help = String.format("%d층입니다", k03_floor);
		}
	}
}
