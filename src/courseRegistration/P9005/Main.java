package courseRegistration.P9005;

import courseRegistration.P9005.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		while(true) {
			int m = menu.printMainMenu();
			if (m == 1) {
				menu.printCourseList();
			} else if (m == 2) {
				menu.printMyCourse();
			} else if (m == 0) {
				menu.printMainMenu();
			}
		}
	}
}
