package exchange0330;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exchange {

	public static void main(String[] args) throws IOException{
		Menu menu = new Menu();
		
		FileOutput.FileWrite("날짜,시간,환전요청금액,타입,거스름돈,남은금액\n");

		do {
			menu.getMenu();
		} while (menu.inputKRW != 0);
	}
}
