package sw06;

public class TvRemoteControl2 {
	/* 생성자-리모콘 2021-04-27 kopo03 김도연 */
	
	private int k03_volume;									// private으로 음량 변수 선언
	private int k03_channel;								// private으로 채널 변수 선언
	public String k03_help;									// private으로 도움말 변수 선언

	TvRemoteControl2() {									// 초기값을 가진 생성자 선언
		k03_volume = 0;										// 이 생성자를 호출하면 초기값인
		k03_channel = 10;									// 음량은 0, 채녈은 10으로 설정된다.
		k03_help = "tv 기본 설치 완료";						// 도움말도 초기값으로 설정된다.
	}
	
	TvRemoteControl2(int volume, int channel) {				// 생성자 또한 오버라이딩이 가능한다.
		k03_volume = volume;								// 인자로 음량과 채널을 받아서
		k03_channel = channel;								// 해당 클래스에 초기값을 해당 음량과
		k03_help = "tv 맞춤 설치 완료";						// 해당 채널로 설정하는 역할을 한다.
	}
	
	void VolUp() {											// 볼륨을 높이는 함수다
		k03_volume++;										// 호출시 볼륨이 1 증가하도록 한다.
		k03_help = String.format("vol: %d", k03_volume);	// 도움말은 볼륨이 지금 몇 인지 알리도록 한다.
	}

	void VolDn() {											// 볼륨을 내리는 함수다
		k03_volume--;										// 호출시 볼륨이 1 하락하도록 한다.
		k03_help = String.format("vol: %d", k03_volume);	// 도움말은 볼륨이 지금 몇 인지 알리도록 한다.
	}
	
	void ChannelUp() {										// 채널을 높이는 함수다
		k03_channel++;										// 호출시 채널이 1 증가하도록 한다.
		k03_help = String.format("channel: %d", k03_channel);// 도움말은 채널이 지금 몇 인지 알리도록 한다.
	}

	void ChannelDn() {										// 채널을 내리는 함수다
		k03_channel--;										// 호출시 채널이 1 하락하도록 한다.
		k03_help = String.format("channel: %d", k03_channel);// 도움말은 채널이 지금 몇 인지 알리도록 한다.
	}
	
	void VolUp(int n) {										// 볼륨을 높이는 함수를 호출하는 함수다
		for (int k03_i = 0; k03_i < n; k03_i++) {			// 볼륨을 높이는 함수는 1씩만 올릴 수 있지만,
			this.VolUp();									// 이렇게 this로 호출하면서 인자값만큼 반복하는 함수를
		}													// 쓰면 해당 인자씩 볼륨을 높이는 함수가 된다.
	}
	
	void VolDn(int n) {										// 볼륨을 낮추는 함수를 호출하는 함수다.
		for (int k03_i = 0; k03_i < n; k03_i++) {			// 볼륨을 인자로 전달받은 int값만큼 내려서
			this.VolDn();									// 결과적으로 main에서는 인자값의 크기만큼 한번에
		}													// 조정되는 것 같아 보인다.
	}
	
	void ChannelUp(int n) {									// 채널을 올리는 함수를 호출하는 함수다
		for (int k03_i = 0; k03_i < n; k03_i++) {			// 위의 함수들과 마찬가지로 이 클래스의 함수를
			this.ChannelUp();								// this.를 붙여서 호출한다.
		}
	}
	
	void ChannelDn(int n) {									// this는 클래스 자기자신의 변수나 메소드를 가리킨다.
		for (int k03_i = 0; k03_i < n; k03_i++) {			// 생성자를 만들 때, this.a라고 하면
			this.ChannelDn();								// 해당 클래스의 a변수를 가리킨다.
		}
	}
	
	void msg(String id) {									// id를 받아서 메세지를 프린트해주는 함수다.
		System.out.printf("%s=>[%s] 현재음량[%d] 현재채널[%d]\n", // 해당 함수에서는 현재 음량, 현재 채널, 그리고 위의
				id, k03_help, k03_volume, k03_channel);		// 함수에서 정의했던 도움말을 프린트하게 되어있다.
	}
}
