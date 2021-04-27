package sw06;

public class TvRemoteControl {
	/* 클래스, 객체, 인스턴스-리모콘 2021-04-27 kopo03 김도연 */
	int k03_volume = 0;
	int k03_channel = 10;
	String k03_help;

	void VolUp() {
		k03_volume++;
		k03_help = String.format("vol: %d", k03_volume);
	}

	void VolDn() {
		k03_volume--;
		k03_help = String.format("vol: %d", k03_volume);
	}
	
	void ChannelUp() {
		k03_channel++;
		k03_help = String.format("channel: %d", k03_channel);
	}

	void ChannelDn() {
		k03_channel--;
		k03_help = String.format("channel: %d", k03_channel);
	}
}
