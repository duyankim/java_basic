package software03;

public class P16 {

	public static void main(String[] args) {
		//3. 소비자가 세금 계산 2021-04-01 kopo03 김도연
		String[] k03_item = {"맛동산", "웨하스", "롯데샌드", "오땅", "샤브레"}; //배열 선언
		int[] k03_price = {1000, 2000, 3000, 2500, 1450}; //소비자 가격 = 세금 + 과세전 단가
		int[] k03_amout = {10, 2, 1, 3, 5}; //각각의 갯수
		double k03_tax_rate = 0.1; //세율
		int k03_total_sum = 0; //총합 초기화
		
		System.out.printf("************************************\n"); //구분선
		System.out.printf("*            구매한 과자들             *\n"); //제목
		System.out.printf(" 항 목      단 가        수 량     합 계 \n"); //항목
		
		for (int k03_i=0; k03_i<k03_item.length; k03_i++) { //배열의 길이만큼 반복
			int k03_sum = k03_price[k03_i] * k03_amout[k03_i]; //가격과 해당 상품의 갯수를 곱해 sum에 할당
			k03_total_sum = k03_total_sum + k03_sum; //전체 상품의 금액에 반복문으로 구한 sum값을 더해줌
			System.out.printf("%.5s \t%7d \t%2d %9d\n", k03_item[k03_i], k03_price[k03_i], k03_amout[k03_i], k03_sum);
			// .은 좌측정렬, s는 string, d는 decimal의미
		}

		System.out.printf("************************************\n");//구분선
		System.out.printf(" 지불 금액 :\t%20d\n", k03_total_sum); //출력
		
		int k03_total_net_price=(int)(k03_total_sum / (1+k03_tax_rate)); 
		//총액에서 세율을 나누면 과세 전 금액 -> 버림해서 정수로 변환
		System.out.printf(" 과세 금액 :\t%20d\n", k03_total_net_price); //출력
		
		int k03_tax = k03_total_sum - k03_total_net_price; //세금은 과세 후 총액에서 과세 전 금액을 빼는 것
		System.out.printf(" 세   금 :\t%20d\n", k03_tax); //출력
	}

}
