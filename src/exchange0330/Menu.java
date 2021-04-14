package Exchange0330;

import java.util.Scanner;

public class Menu {
	ExchangeOutput runClass = new ExchangeOutput();
	Scanner sc = null;
	int menu;
	int inputKRW;
	
	public Menu() {
		sc = new Scanner(System.in);
	}
	
	public int inputMoney() {
		int inputKRW;
		System.out.println("원화입력: ");
		inputKRW = sc.nextInt();
		return inputKRW;
	}
	
	public int inputMenu() {
		int inputMenuType;
		System.out.println("환전할 단위 : 1)USD	 2)EUR 3)JPY");
		inputMenuType = sc.nextInt();
		return inputMenuType;
	}
	
	public void getMenu() {
		inputKRW = inputMoney();
		menu = inputMenu();
		
		switch(menu) {
			case ConstValueClass.CHANGE_TYPE_USD:
				runClass.exchangeToUSD(inputKRW);
				break;
			case ConstValueClass.CHANGE_TYPE_EUR:
				runClass.exchangeToEUR(inputKRW);
				break;
			case ConstValueClass.CHANGE_TYPE_JPY:
				runClass.exchangeToJPY(inputKRW);
				break;
			default:
				break;
		}
	}
}
