package software04;

public class P5 {

	public static void main(String[] args) {
		// switch/case문 2021-04-02 kopo03 김도연
		String jumin = "123456-1234567"; //주민번호 할당
		
		switch(jumin.charAt(7)) { //String 표현은 case문에서 사용 불가
			case '1' : //7번째 char가 '1'일 경우
				System.out.printf("20세기 이전 태어난 남자 사람\n"); //출력
				break;//반복을 멈춤
			case '2' : //7번째 char가 '2'일 경우
				System.out.printf("20세기 이전 태어난 여자 사람\n"); //출력
				break;//반복을 멈춤
			case '3' : //7번째 char가 '3'일 경우
				System.out.printf("20세기 이후 태어난 남자 사람\n"); //출력
				break;//반복을 멈춤
			case '4' : //7번째 char가 '4'일 경우
				System.out.printf("20세기 이후 태어난 여자 사람\n"); //출력
				break;//반복을 멈춤
			default : //switch문에 항상 있어야 함
				System.out.printf("사람\n"); //4가지 케이스에 모두 해당 안될 때 출력
				break;//반복을 멈춤
		}
	}

}
