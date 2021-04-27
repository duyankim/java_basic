package sw06;

public class Elevator2 {
	/* 생성자 2021-04-27 kopo03 김도연 */
	
	public int k03_limit_up_floor;
	public int k03_limit_down_floor;
	public int k03_floor = 1;
	public String k03_help;

	Elevator2() {
		k03_limit_up_floor = 10;
		k03_limit_down_floor = 1;
		k03_floor = 1;
		k03_help = "엘레베이터 기본 준공완료";
	}

	Elevator2(int up_floor, int d_floor, int in_floor) {
		k03_limit_up_floor = up_floor;
		k03_limit_down_floor = d_floor;
		k03_floor = in_floor;
		k03_help = "엘레베이터 맞춤 준공완료";
	}

	void up() {
		if (k03_floor == k03_limit_up_floor) {
			k03_help = "마지막 층입니다.";
		} else {
			k03_floor++;
			k03_help = String.format("[%d]층입니다", k03_floor);
		}
	}

	void down() {
		if (k03_floor == k03_limit_down_floor) {
			k03_help = "첫 번째 층입니다.";
		} else {
			k03_floor--;
			k03_help = String.format("[%d]층입니다", k03_floor);
		}
	}

	void up(int u) {
		for (int k03_i = 0; k03_i < u; k03_i++) {
			this.up();
		}
	}

	void down(int u) {
		for (int k03_i = 0; k03_i < u; k03_i++) {
			this.down();
		}
	}

	void msg(String id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", 
				id, k03_help, k03_limit_up_floor, k03_limit_down_floor,	k03_floor);
	}
}
