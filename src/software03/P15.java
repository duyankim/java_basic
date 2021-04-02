package software03;

public class P15 {
	
	//2. 소비자가 세금 계산 2021-04-01 kopo03 김도연
	public static int k03_netprice(int price, double rate) { // 소비자가격과 세율을 인자로 받음
		return (int)(price/(1+rate)); //세금을 더한 상품가격을 정수형으로 소수점을 버리고 반환한다
	}

	public static void main(String[] args) { //메인 선언부
		int k03_price = 1234; //소비자 가격
		double k03_tax_rate = 0.1; //세율
		
		int k03_netprice = k03_netprice(k03_price, k03_tax_rate); //메소드에 인자로 전달 
		// 변수netprice와 함수netprice는 다른 존재다
		int k03_tax = k03_price - k03_netprice; //소비자 가격에서 정가를 제하면 세금을 구할 수 있다.
		
		System.out.printf("**********************************\n"); //구분선
		System.out.printf("*      소비자가, 세전가격, 세금계산      *\n"); //제목
		System.out.printf("소비자가격: %d 세전가격: %d 세금: %d\n", k03_price, k03_netprice, k03_tax); //항목별 프린트
		System.out.printf("**********************************\n"); //구분선

	}
}
