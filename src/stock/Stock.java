package data0629.stock;

public class Stock {
	private String date; //날짜
	private String time; //시간
	private String code; // 종목코드
	private String name; // 종목명
	private long currPrice; // 현재가
	private int compare; // 대비
	private double dayRange; // 등락률
	private long tradingValue; // 거래대금
	private long marketCap; // 상장시가총액

	public Stock() {
	}

	public Stock(String code, String name, long currPrice, int comPrice, 
			double dayRange, long tradingValue,	long marketCap) {
		this.code = code;
		this.name = name;
		this.currPrice = currPrice;
		this.compare = comPrice;
		this.dayRange = dayRange;
		this.tradingValue = tradingValue;
		this.marketCap = marketCap;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(long currPrice) {
		this.currPrice = currPrice;
	}

	public int getCompare() {
		return compare;
	}

	public void setCompare(int comPrice) {
		this.compare = comPrice;
	}

	public double getDayRange() {
		return dayRange;
	}

	public void setDayRange(double dayRange) {
		this.dayRange = dayRange;
	}

	public long getTradingValue() {
		return tradingValue;
	}

	public void setTradingValue(long tradingValue) {
		this.tradingValue = tradingValue;
	}

	public long getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}
}
