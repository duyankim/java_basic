package software04;

public class P20 {

	public static void main(String[] args) {
		// case문 비교 2021-04-02 kopo03 김도연
		
		for (int i=1; i<13; i++) {//1부터 12까지 반복하는 달
			System.out.printf(" %d =>", i); //월 출력하기
			
			LOOP: for (int j=1; j<32; j++) {//1부터 31일까지 반복하는 일
				System.out.printf("%d", j); //일 출력하기
				
				switch(i) {//월을 parameter로 넣어서 switch문 구현
				case 4: case 6: case 9: case 11:// 4,6,9,11월의 경우를 모아서 case처리할 것임
					if(j==30) break LOOP; //LOOP표시자가 위의 일 수에 해당하는 반복문으로 올려보냄
					System.out.print(", "); //콤마 출력하기 LOOP가 break된 뒤에 넣어서 마지막 break될 때는 안 찍힘
					break; //다른 달의 케이스로 넘어가지 않게 break
				case 2: //2월의 case
					if(j==28) break LOOP; //28일이 되면 break가 되고, LOOP로 돌아가도록.
					System.out.print(", "); //콤마 출력하기
					break; //다른 달의 case로 넘어가지 않게 함
				default: //2,4,6,9,11달에 해당하지 않는 달 모두
					if(j==31) break LOOP; //31일이 되면 반복 멈추고 LOOP로 다시 돌아감
					System.out.print(", "); //마지막 날은 콤마를 찍지 않음
					break; //더 반복하지 않게 break
				}
				
			}
			System.out.printf("\n"); //줄나눔
		}

	}

}
