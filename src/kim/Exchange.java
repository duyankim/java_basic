package computing.kim;

import java.io.IOException;

public class Exchange {

	public static void main(String[] args) throws IOException{
		Menu menu = new Menu();
		
		FileOutput.fileWrite("날짜,시간,환전요청금액,타입,거스름돈,남은금액\n");

		do {
			menu.getMenu();
		} while (menu.inputKRW != 0);
	}
}
