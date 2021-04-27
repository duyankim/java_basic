package sw06;

public class RemoteXMain {

	public static void main(String[] args) {
		/* 상속으로 클래스 만들기-리모콘 2021-04-27 kopo03 김도연 */
		
		TvRemoteControlX k03_tv = new TvRemoteControlX(80); 
		k03_tv.CheckBattery();
		k03_tv.msg("배터리 체크");
	}

}
