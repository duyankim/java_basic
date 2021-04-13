package software04.hong;

public class P18 {

	public static void main(String[] args) {
		// 비정형비교 2021-04-02 kopo03 김도연
		for (int k03_i = 1; k03_i < 13; k03_i++) { // 변수가 1,2,3,4,5,6,7,8,9,10,11,12 일 때
			System.out.printf(" %d월 => ", k03_i);// 월을 출력하는 printf문이다.

			for (int k03_j = 1; k03_j < 32; k03_j++) {// 변수가 1일부터 31일까지 일 때
				System.out.printf("%d", k03_j); //일자 출력하는 printf문이다.
				
				if(k03_i==1 && k03_j==31) break; // 1월은 31일까지 출력한 뒤 break
				if(k03_i==2 && k03_j==28) break; // 2월은 28일까지 출력한 뒤 break
				if(k03_i==3 && k03_j==31) break; // 3월은 31일까지 출력한 뒤 break
				if(k03_i==4 && k03_j==30) break; // 4월은 30일까지 출력한 뒤 break
				if(k03_i==5 && k03_j==31) break; // 5월은 31일까지 출력한 뒤 break
				if(k03_i==6 && k03_j==30) break; // 6월은 30일까지 출력한 뒤 break
				if(k03_i==7 && k03_j==31) break; // 7월은 31일까지 출력한 뒤 break
				if(k03_i==8 && k03_j==31) break; // 8월은 31일까지 출력한 뒤 break
				if(k03_i==9 && k03_j==30) break; // 9월은 30일까지 출력한 뒤 break
				if(k03_i==10 && k03_j==31) break; // 10월은 31일까지 출력한 뒤 break
				if(k03_i==11 && k03_j==30) break; // 11월은 30일까지 출력한 뒤 break
				if(k03_i==12 && k03_j==31) break; // 12월은 31일까지 출력한 뒤 break
				
				System.out.print(","); //break된 마지막 날에는 콤마가 찍히지 않게 함
			}
			System.out.printf("\n"); //줄바꿈하는 printf문이다.
		}
	}

}
