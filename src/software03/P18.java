package software03;

public class P18 {

	public static void main(String[] args) {
		// 단순 환전 계산 2021-04-01 kopo03 김도연
		int k03_myWon = 1000000; // 100 만원
		double k03_MoneyEx = 1238.21; // 달러 환율
		double k03_commission = 0.003; // 환전 수수료
		
		int k03_usd = (int) (k03_myWon / k03_MoneyEx); // 버림처리하여 정수로 만듦
		int k03_remain = (int) (k03_myWon - k03_usd * k03_MoneyEx); //고객에게 돌려줄 돈. 정수형으로 버림처리
		
		System.out.printf("***********************************************\n"); //구분선
		System.out.printf("*                수수료없이 계산                  *\n"); //제목
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d\n", k03_myWon, k03_usd, k03_remain); //출력
		System.out.printf("***********************************************\n"); //구분선

	}

}
