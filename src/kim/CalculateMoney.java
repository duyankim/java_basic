package computing.kim;

import java.io.IOException;

public class CalculateMoney {
	Balance balance = new Balance();
	
	public double exchangeOutput (int won, double RATE, String currency) {
		double totalOutput;
		totalOutput = won / RATE;
		if (balance.checkBalance(totalOutput, currency) == true) {
			return totalOutput;
		} else {
			return 0.0;
		}
	}

	public void exchangeToKRW(double notWonChange, double RATE) throws IOException {
		int wonOutput;
		wonOutput = (int)((notWonChange * RATE)/10)*10;
		System.out.printf("거스름돈: \t%d원%n",wonOutput);
		FileOutput.fileWrite(String.valueOf(wonOutput) + ",");
		balance.writeBalance(RATE);
		
		int[] wonUnit = {1000, 500, 100, 10};
		printUnitOutput(wonUnit, wonOutput, "원");
		
		System.out.println("===============================");
	}
	
	public void printUnitOutput(int[] unit, int money, String currency) {
		int i, amount=0;
		System.out.println("===============================");
		System.out.println(currency + "환산: ");
		
		for (i=0; i < unit.length; i++) {
			amount = money / unit[i];
			if (amount != 0) {
				System.out.println("\t" + unit[i] + currency + "\t" + amount + "개");
			}
			money = money % unit[i];
		}	
	}
}
 