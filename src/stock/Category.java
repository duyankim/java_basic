package data0629.stock;

public enum Category {
	CODE(0),
	NAME(1),
	CURRPRICE(2),
	COMPARE(3),
	DAYRANCE(4),
	TRADINGVALUE(5),
	MARKETCAP(6);
	
	public final int number;
	
	Category(int number) {
		this.number = number;
	}
	
	static int[] fileCategory = {
			Category.CODE.number,
			Category.NAME.number,
			Category.CURRPRICE.number,
			Category.COMPARE.number,
			Category.DAYRANCE.number,
			Category.TRADINGVALUE.number,
			Category.MARKETCAP.number,
		};
}