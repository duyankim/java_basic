package software03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P19 {

	public static void main(String[] args) {
		// 수수료 포함 환전 계산1 2021-04-01 kopo03 김도연
		int k03_myWon = 1000000; // 100 만원
		double k03_moneyEx = 1238.21; // 달러 환율
		double k03_commission = 0.003; // 환전 수수료
		
		int k03_usd = (int) (k03_myWon / k03_moneyEx); // 버림처리하여 정수로 만듦
		int k03_remain = (int) (k03_myWon - k03_usd * k03_moneyEx); // 고객에게 돌려줄 돈. 정수형으로 버림처리
		
		double k03_comPerOne = k03_moneyEx * k03_commission; // 1달러 당 수수료
		double k03_totalCom = k03_usd * k03_comPerOne; //환전할 전체 액수에 1달러 당 수수료를 곱해 총액 구함
		
		System.out.printf("**********************************************************\n"); //구분선
		System.out.printf("*                       수수료 계산                         *\n"); //제목
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k03_totalCom, k03_usd, k03_comPerOne); //f는 실수를 소수점표기
		System.out.printf("**********************************************************\n"); //구분선
		
		// 수수료 포함 환전 계산2 2021-04-01 kopo03 김도연
		int k03_i_totalCom = 0; //할당
		
		if (k03_totalCom != (double)((int)k03_totalCom)) { //if문
			k03_i_totalCom = (int)k03_totalCom+1; //수수료 총액 소수점아래 금액 존재시 올림해서 1원 더 받는다.
		} else { //else문
			k03_i_totalCom = (int)k03_totalCom; //소수점 아래 자리가 없을 경우 k03_i_totalCom에 수수료 총액 할당
		}
	
		System.out.printf("***************************************************************\n"); //구분선
		System.out.printf("*                         수수료 계산                            *\n"); //제목
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k03_i_totalCom, k03_usd, k03_comPerOne); //프린트
		
		k03_remain = (int)(k03_myWon - k03_usd * k03_moneyEx - k03_i_totalCom); // 잔돈 계산
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료청구: %d원 잔돈: %d원\n", k03_myWon, k03_usd, k03_i_totalCom, k03_remain); //출력
		System.out.printf("***************************************************************\n"); //구분선
				
		// 수수료 포함 환전 계산3 2021-04-01 kopo03 김도연
		k03_usd = (int)(k03_myWon / (k03_moneyEx + k03_comPerOne)); //환전 달러
		k03_totalCom = k03_usd * k03_comPerOne; //총 수수료
		
		//수수료 올림 처리
		if (k03_totalCom != (double)((int)k03_totalCom)) { //if문
			k03_i_totalCom = (int)k03_totalCom + 1; //소수점이하 자리수 있으면 1원 더 받기
		} else { //else문
			k03_i_totalCom = (int)k03_totalCom; // 할당
		}
		
		System.out.printf("*************************************************************\n"); //구분선
		System.out.printf("*                    (정확한) 수수료 계산                        *\n"); //제목
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k03_i_totalCom, k03_usd, k03_comPerOne); //출력
			
		k03_remain = (int)(k03_myWon - k03_usd * k03_moneyEx - k03_i_totalCom); //올림한 수수료와 환전 될 미화를 제외한 금액
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료청구: %d원 잔돈: %d원\n", k03_myWon, k03_usd, k03_i_totalCom, k03_remain); //출력
		System.out.printf("*************************************************************\n"); //구분선
			
				
		//콤마찍기 2021-04-01 kopo03 김도연
		DecimalFormat k03_df = new DecimalFormat("###,###,###,###,###,###"); // 클래스 선언
		System.out.printf("****************************************************************\n"); //구분선
		System.out.printf("*                       콤마찍기, 날짜 적용                         *\n"); //제목
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", //출력
						k03_df.format(k03_i_totalCom), k03_df.format(k03_usd), k03_comPerOne); // 포멧 적용
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료청구: %s원 잔돈: %s원\n", //출력
						k03_df.format(k03_myWon), k03_df.format(k03_usd), k03_df.format(k03_i_totalCom), k03_df.format(k03_remain)); //포멧적용

		//현재 날짜, 시간 찍기 2021-04-01 kopo03 김도연
		Calendar k03_calt = Calendar.getInstance(); // 클래스 선언
		SimpleDateFormat k03_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //날짜, 시간 형식 지정
		System.out.printf("최종실행시간: %s\n", k03_sdt.format(k03_calt.getTime()));  //캘린더 클래스로 현재 시간 가져와서 포멧에 맞게 출력
		System.out.printf("****************************************************************\n"); //구분선
	}

}
