package computing.kim;

import java.io.IOException;

public class Balance {
	public boolean checkBalance (double totalOutput, String currency) {
		int exchangeResult;
		double balance;
		balance = balanceConverter(currency);
		
		if (totalOutput <= balance) {
			balanceCalculator(totalOutput, currency);
			exchangeResult = (int) totalOutput;
			System.out.println("환전결과: " + exchangeResult + currency);
			return true;
		} else {
			printErrorMsg(currency, balance);
			return false;
		}
	}
	
	public double balanceConverter (String currency) {
		double balance;
	
		if (currency.equals("달러")) {
			balance = ConstValueClass.BALANCE_USD;
		} else if (currency.equals("유로")) {
			balance = ConstValueClass.BALANCE_EUR;
		} else {
			balance = ConstValueClass.BALANCE_JPY;
		}
		return balance;
	}
	
	public void balanceCalculator (double totalOutput, String currency) {
		if (currency.equals("달러")) {
			ConstValueClass.BALANCE_USD -= totalOutput;
		} else if (currency.equals("유로")) {
			ConstValueClass.BALANCE_EUR -= totalOutput;
		} else {
			ConstValueClass.BALANCE_JPY -= totalOutput;
		}
	}
	
	public void printErrorMsg(String currency, double balance) {
		System.out.println(currency + " 보유액이 부족합니다.");
		System.out.println(currency + " 보유액 : " + (int) balance + " " + currency);
	}
	
	public void writeBalance(double RATE) throws IOException {
		if (RATE == ConstValueClass.USD_RATE) {
			FileOutput.fileWrite(String.valueOf(ConstValueClass.BALANCE_USD));
		} else if (RATE == ConstValueClass.EUR_RATE) {
			FileOutput.fileWrite(String.valueOf(ConstValueClass.BALANCE_EUR));
		} else {
			FileOutput.fileWrite(String.valueOf(ConstValueClass.BALANCE_JPY));
		}
		FileOutput.fileWrite("\n");
	}
}
