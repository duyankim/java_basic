package sw06;

public class RemoteMain {
	/* 클래스, 객체, 인스턴스-리모콘 2021-04-27 kopo03 김도연 */
	
	public static void main(String[] args) {
		TvRemoteControl k03_tv;
		k03_tv = new TvRemoteControl();
		
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			k03_tv.ChannelUp();
			System.out.printf("MSG[%s]\n", k03_tv.k03_help);
		}
		
		for (int k03_i = 0; k03_i < 10; k03_i++) {
			k03_tv.ChannelDn();
			System.out.printf("MSG[%s]\n", k03_tv.k03_help);
		}
		
		for (int k03_i = 0; k03_i < 5; k03_i++) {
			k03_tv.VolUp();
			System.out.printf("MSG[%s]\n", k03_tv.k03_help);
		}
		
		for (int k03_i = 0; k03_i < 5; k03_i++) {
			k03_tv.VolDn();
			System.out.printf("MSG[%s]\n", k03_tv.k03_help);
		}
	}

}
