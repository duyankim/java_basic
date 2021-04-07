package javabasic2;

import java.util.Scanner;

public class Menu7005 {

	FivePeople fp = new FivePeople();

	public static void main(String[] args) {

		Menu7005 m = new Menu7005();
		m.identifyMenu();
	}

	public void identifyMenu() {
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		if (menu == 1) {
			FivePeople.inputScore();

			int menu2 = sc.nextInt();
			if (menu2 == 2) {
				FivePeople.getMenu2();

				int menu3 = sc.nextInt();
				if (menu3 == 3) {
					for (int i = 0; i < fp.arr.length; i++) {
						System.out.println(fp.arr[i]);
					}
				}
			}
		}
	}
}
