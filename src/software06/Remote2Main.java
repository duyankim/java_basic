package sw06;

public class Remote2Main {
	/* 생성자-리모콘 2021-04-27 kopo03 김도연 */
	static TvRemoteControl2 k03_tv1;								// static으로 TvRemoteControl2클래스를 불러온다
	static TvRemoteControl2 k03_tv2;								// 리모콘 클래스를 가리키는 변수를 
	static TvRemoteControl2 k03_tv3;								// 3개 선언해준다.
	
	public static void main(String[] args) {
		k03_tv1 = new TvRemoteControl2();							// tv1은 매개변수가 없는 생성자를 호출해서 초기값이 정해져있다.
		k03_tv2 = new TvRemoteControl2(5, 48);						// tv2와 tv3는 매개변수가 있는 생성자를 호출해서
		k03_tv3 = new TvRemoteControl2(30, 7);						// tv1과는 다른 생성자가 메소드 오버라이딩 되며 초기값이 정해진다.

		for (int k03_i = 0; k03_i < 20; k03_i++) {					// 20번 반복하는 반복문을 만들어서 메소드를 호출해본다.
			k03_tv1.VolUp(); k03_tv1.msg("1번 tv 음량 1씩 올리기");		// 볼륨을 높이고, 메세지를 출력한다.
		}
		
		for (int k03_i = 0; k03_i < 20; k03_i++) {					// 20번 반복하는 반복문을 만들어서 메소드를 호출한다.
			k03_tv2.ChannelDn(2); k03_tv2.msg("2번 tv 채널 2씩 내리기");// ChannelDn에 인자로 2를 전달해서 2씩 반복해서 ChannelDn을
		}															// 호출하고, 결과적으로 콘솔에는 2씩 내려간 채널을 볼 수 있다.
		
		for (int k03_i = 0; k03_i < 5; k03_i++) {					// 5번 반복하는 반복문을 만들어서 메소드를 호출한다.
			k03_tv3.ChannelUp(3); k03_tv3.msg("3번 tv 채널 3씩 올리기");// ChannelUp에 인자로 3을 전달해 콘솔에서 3씩 올라간 채널을 알 수 있다.
		}
	}
}

