package Exchange0330;

public class ExchangeOutput {
	CalculateMoney money = new CalculateMoney();
	
	public void exchangeToUSD(int inputKRW) {
		double totalOutput;
		String USD = "달러";
		int[] dollarUnit = {100, 50, 20, 10, 5, 2, 1};
		
		//달러 환전
		totalOutput = money.exchangeOutput(inputKRW, ConstValueClass.USD_RATE, USD);
		exchangeTrue(totalOutput, dollarUnit, USD, ConstValueClass.USD_RATE);
	}
	
	public void exchangeToEUR(int inputKRW) {
		double totalOutput;
		String EUR = "유로";
		int[] euroUnit = {500, 200, 100, 50, 20, 10, 5};
		
		//유로 환전
		totalOutput = money.exchangeOutput(inputKRW, ConstValueClass.EUR_RATE, EUR);
		exchangeTrue(totalOutput, euroUnit, EUR, ConstValueClass.EUR_RATE);
	}
	
	public void exchangeToJPY(int inputKRW) {
		double totalOutput;
		String JPY = "엔";
		int[] yenUnit = {10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1};
		
		//엔 환전
		totalOutput = money.exchangeOutput(inputKRW, ConstValueClass.JPY_RATE, JPY);
		exchangeTrue(totalOutput, yenUnit, JPY, ConstValueClass.JPY_RATE);
	}

	public void exchangeTrue(double totalOutput, int[] units, String currency, double RATE) {
		double change;
		
		if (totalOutput != 0.0) {
			//환전 화폐 프린트
			money.printUnitOutput(units, (int) totalOutput, currency);
					
			//원화 거스름돈 프린트
			change = totalOutput - (int) totalOutput;
			money.exchangeToKRW(change, RATE);
		} else {
			
		}
	}
}
