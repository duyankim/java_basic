package computing;

public class ExchangeOutput {
	CalculateMoney money = new CalculateMoney();
	
	public void exchangeToUSD(int inputKRW) {
		double totalOutput, change;
		String USD = "달러";
		int[] dollarUnit = {100, 50, 20, 10, 5, 2, 1};
		
		//달러 환전
		if()
		totalOutput = money.exchangeOutput(inputKRW, ConstValueClass.USD_RATE, USD);

		//달러 화폐
		money.printUnitOutput(dollarUnit, (int) totalOutput, USD);
		
		//원화 거스름돈
		change = totalOutput - (int) totalOutput;
		money.exchangeToKRW(change, ConstValueClass.USD_RATE);
	}
	
	public void exchangeToEUR(int inputKRW) {
		double totalOutput, change;
		String EUR = "유로";
		int[] euroUnit = {500, 200, 100, 50, 20, 10, 5};
		
		//유로 환전
		totalOutput = money.exchangeOutput(inputKRW, ConstValueClass.EUR_RATE, EUR);

		//유로 화폐
		money.printUnitOutput(euroUnit, (int)totalOutput, EUR);
		
		//원화 거스름돈
		change = totalOutput - (int)totalOutput;
		money.exchangeToKRW(change, ConstValueClass.EUR_RATE);
	}
	
	public void exchangeToJPY(int inputKRW) {
		double totalOutput, change;
		String JPY = "엔";
		int[] yenUnit = {10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1};
		
		//엔 환전
		totalOutput = money.exchangeOutput(inputKRW, ConstValueClass.JPY_RATE, JPY);
		
		//엔 화폐
		money.printUnitOutput(yenUnit, (int)totalOutput, JPY);
		
		//엔 거스름돈
		change = totalOutput - (int)totalOutput;
		money.exchangeToKRW(change, ConstValueClass.JPY_RATE);
	}


}
