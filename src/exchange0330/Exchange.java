package Exchange0330;

public class Exchange {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		do {
			menu.getMenu();
		} while (menu.inputKRW != 0);
	}
}
