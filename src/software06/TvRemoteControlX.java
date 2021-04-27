package sw06;

public class TvRemoteControlX extends TvRemoteControl2{
	/* 상속으로 클래스 만들기-리모콘 2021-04-27 kopo03 김도연 */
	
	private int k03_battery;									// private변수로 배터리의 잔량을 표시한다.
	
	TvRemoteControlX(int k03_i) {								// 생성자로 배터리 잔량을 설정할 수 있도록
		k03_battery = k03_i;									// 인자값을 받아 배터리 잔량에 할당한다.
	}
	
	void CheckBattery() {										// 배터리를 체크하는 메소드를 만든다.
		if (k03_battery > 0) {									// 배터리 변수가 0 보다 클 경우
			k03_help = String.format(
					"배터리 잔량[%s] 남아있습니다.", k03_battery+"%");// 잔량이 있다는 도움말을 설정한다.
		} else {												// 배터리 변수가 0 이하일 경우
			k03_help = String.format("배터리 잔량이 없습니다.");		// 잔량이 없다는 도움말을 설정한다.
		}
	}
}
