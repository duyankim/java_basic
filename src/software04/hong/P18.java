package software04;

public class P18 {

	public static void main(String[] args) {
		// 비정형비교 2021-04-02 kopo03 김도연
		for (int i=1; i<13; i++) { //변수가 1,2,3,4,5,6,7,8,9,10,11,12 일 때
			System.out.printf(" %d월 => ", i);// 월을 출력
			
			for(int j=1; j<32; j++) {//변수가 1일부터 31일까지 일 때
				System.out.printf("%d", j); //일자 출력
				
				if(i==1 && j==31) break; // 1월은 31일까지 출력한 뒤 break
				if(i==2 && j==28) break; // 2월은 28일까지 출력한 뒤 break
				if(i==3 && j==31) break; // 3월은 31일까지 출력한 뒤 break
				if(i==4 && j==30) break; // 4월은 30일까지 출력한 뒤 break
				if(i==5 && j==31) break; // 5월은 31일까지 출력한 뒤 break
				if(i==6 && j==30) break; // 6월은 30일까지 출력한 뒤 break
				if(i==7 && j==31) break; // 7월은 31일까지 출력한 뒤 break
				if(i==8 && j==31) break; // 8월은 31일까지 출력한 뒤 break
				if(i==9 && j==30) break; // 9월은 30일까지 출력한 뒤 break
				if(i==10 && j==31) break; // 10월은 31일까지 출력한 뒤 break
				if(i==11 && j==30) break; // 11월은 30일까지 출력한 뒤 break
				if(i==12 && j==31) break; // 12월은 31일까지 출력한 뒤 break
				
				System.out.print(","); //break된 마지막 날에는 콤마가 찍히지 않게 함
			}
			System.out.printf("\n"); //줄바꿈
		}
	}

}
