package test1;

import java.util.Scanner;

public class B602 {
	static int[] priceArr = { 0, 0, 0, 0, 0 }; // milk, apple, orange, melon, water
	static int[] chargeArr = { 0, 0, 0, 0, 0 };

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			case 3:
				menu3();
				break;
			default:
				printMenu();
				break;
			}
		}
	}

	public static void printMenu() {
		System.out.println("#Menu");
		System.out.printf("[PRICE] milk-%d apple-%d orange-%d melon-%d water-%d\n", 
				priceArr[0], priceArr[1], priceArr[2], priceArr[3], priceArr[4]);
		System.out.println("1. Set the prices of items");
		System.out.println("2. Calculate the charges");
		System.out.println("3. Reset the prices of items");
		System.out.print("-> ");
	}

	public static void menu1() {
		System.out.println("#Please input the prices of milk, apple, orange, melon and water in order.");
		System.out.print("-> ");

		int i = 0;
		while (i < 5) {
			priceArr[i] = sc.nextInt();
			i++;
		}
	}

	public static void menu2() {
		System.out.println("#Total charge");
		System.out.println("#Please input the quantities of milk, apple, orange, melon and water in order.");
		System.out.print("-> ");

		int i = 0, quantity, sum = 0;
		while (i < 5) {
			quantity = sc.nextInt();
			chargeArr[i] = priceArr[i] * quantity;
			sum += chargeArr[i];
			i++;
		}
		System.out.printf("Total charge: %d\n", sum);
	}
	
	public static void menu3() {
		int i =0;
		while (i < 5) {
			priceArr[i] = 0;
			chargeArr[i] = 0;
			i++;
		}
		System.out.println("Reset complete!");
	}

}
