package data0629.stock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getKospiCsv {
	
	public static WebDriver driver;
	public static String base_url = "http://index.krx.co.kr/contents/MKD/03/0304/03040101/MKD03040101.jsp?idxCd=1028&upmidCd=0102#a110dc6b3a1678330158473e0d0ffbf0=3";
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\Users\\kim\\jarLib\\chromedriver.exe";


	public static void main(String[] args) {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		driver = new ChromeDriver();
		getCsv();
	}
	
	public static void getCsv() {
		try {
			driver.get(base_url);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/article/div/div[2]/div/div[1]/fieldset/form/div/span/button[2]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}

}
