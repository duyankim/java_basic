package data0629.stock;

import java.util.List;

public class GetStockMain {

	public static void main(String[] args) {
		Kospi200 kospi = new Kospi200();
		String dateAndTime[] = kospi.getCsv();
		List<String[]> data = kospi.readFile();
		
		for (String[] row : data) {
			kospi.writeDb(data, dateAndTime, row);
		}
		System.out.println("complete!");
	}
}
