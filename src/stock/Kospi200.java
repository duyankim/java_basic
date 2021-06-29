package data0629.stock;

import java.io.*;
import java.util.*;
import java.sql.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

public class Kospi200 {

	public static WebDriver driver;
	public static String base_url = "http://index.krx.co.kr/contents/MKD/03/0304/03040101/MKD03040101.jsp?idxCd=1028&upmidCd=0102#a110dc6b3a1678330158473e0d0ffbf0=3";
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\Users\\kim\\jarLib\\chromedriver.exe";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rset;

	public String[] getCsv() {
		String date = null;
		String time = null;
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		driver = new ChromeDriver();
		try {
			driver.get(base_url);
			Thread.sleep(2000);
			date = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/article/div/div[2]/div/div[1]/div[1]/span[2]")).getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/article/div/div[2]/div/div[1]/fieldset/form/div/span/button[2]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
		if (Integer.parseInt(date.substring(14,16)) < 9) {
			time = String.valueOf(Integer.parseInt(date.substring(14,16)) + 12) + ":"+ date.substring(17,22);
		} else {
			time = date.substring(14,22);
		}
		System.out.println(date);
		System.out.println(time);
		date = date.substring(0, 10).replace("/", "-");
		String[] dateAndTime = {date, time};
		return dateAndTime;
	}

	public List<String[]> readFile() {
		String file = "C:\\Users\\kim\\Downloads\\data.csv";
		CSVReader csvReader;
		String[] row = new String[7];
		String[] fullArr = new String[7];
		List<String[]> all = new ArrayList<String[]>();

		try {
			csvReader = new CSVReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
			String[] nextLine;
			csvReader.readNext();

			while ((nextLine = csvReader.readNext()) != null) {
				
				for (int i = 0; i < row.length; i++) {
					row[i] = String.valueOf(nextLine[i]).replace(",", "");
					fullArr = Arrays.copyOf(row, row.length);
				}
				all.add(fullArr);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}
	
	public Stock writeDb(List<String[]> data, String[] dateAndTime, String[] row) {
		String dbURL = "jdbc:mysql://192.168.23.27:3306/stocksystem";
		String dbID = "root";
		String dbPassword = "kopoctc";
		
		String sql = "insert into stock values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Stock stock = null;
		stock = new Stock();
		stock.setDate(dateAndTime[0]);
		stock.setTime(dateAndTime[1]);
		stock.setCode(row[Category.fileCategory[0]]);
		stock.setName(row[Category.fileCategory[1]]);
		if (!row[Category.fileCategory[2]].equals("-")) {
			stock.setCurrPrice(Long.parseLong(row[Category.fileCategory[2]]));
		} 		
		stock.setCompare(Integer.parseInt(row[Category.fileCategory[3]]));
		stock.setDayRange(Double.parseDouble(row[Category.fileCategory[4]]));
		stock.setTradingValue(Long.parseLong(row[Category.fileCategory[5]]));
		stock.setMarketCap(Long.parseLong(row[Category.fileCategory[6]]));
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, stock.getDate());
				pstmt.setString(2, stock.getTime());
				pstmt.setString(3, stock.getCode());
				pstmt.setString(4, stock.getName());
				pstmt.setLong(5, stock.getCurrPrice());
				pstmt.setInt(6, stock.getCompare());
				pstmt.setDouble(7, stock.getDayRange());
				pstmt.setLong(8, stock.getTradingValue());
				pstmt.setLong(9, stock.getMarketCap());
				pstmt.executeUpdate();
				
			} catch (Exception e1) {
				throw new IllegalStateException(e1);
			} finally {
				close(conn, pstmt, rset);
			}

		return stock;
	}
	
	private static void close(Connection conn, PreparedStatement pstmt, ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
