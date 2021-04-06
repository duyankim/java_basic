package software04;

public class P16 {

	public static void main(String[] args) {
		// 숫자형, 문자형 비교 2021-04-02 kopo03 김도연
		
		int I; //int 선언
		double D; //double 선언
		
		I = 10/3; //정수10을 3으로 나누면 3
		D = 10/3.0; //실수 10을 3.0으로 나누면 3.333333
		
		if (I == D) System.out.printf("equal\n");//소수점 아래 자리가 없을 때
		else System.out.printf("Not equal[%f][%f]\n", (double)I, D); //정수형 연산과 실수형 연산이 다를 때
		
		if (D == 3.333333) System.out.printf("equal\n"); //유효숫자만 표시되었을 뿐 3.333333과는 다름
		else System.out.printf("Not equal[3.333333][%f]\n", D); //출력
		
		D = (int)D; //int로 캐스팅
		if(I == D) System.out.printf("equal\n"); // 소수점자리를 버림했을 때 int 3과 동일한 값인가?
		else System.out.printf("Not equal[%f][%f]\n", (double)I, D); // double로 변환한 int출력
		
		System.out.printf("int로 인쇄[%d][%f]\n", I, D); //int가 된 double형을 인쇄함
		System.out.printf("double로 인쇄[%f][%f]\n", (double)I, D); //double이 된 int형을 인쇄함
		
		char a='c'; //char 선언
		
		if(a =='b')System.out.printf("a는 b이다\n"); // a와 b가 같으면 출력
		if(a =='c')System.out.printf("a는 c이다\n"); // a와 c가 같으면 출력
		if(a =='d')System.out.printf("a는 d이다\n"); // a와 d가 같으면 출력

		String aa = "abcd"; //string 할당
		
		if (aa.equals("abcd")) System.out.printf("aa는 abcd이다\n"); //aa에 할당된 string이 "abcd"가 맞느냐
		else System.out.printf("aa는 abcd가 아니다\n"); //aa에 할당된 string이 "abcd"가 아니다
		
		boolean bb = true; //boolean값 할당
		
		if (!!bb) System.out.printf("bb가 아니고 아니면 참이다\n"); //bb를 부정하고 부정 -> false를 false함 -> true
		else System.out.printf("bb가 아니고 아니면 거짓이다"); // 이중부정의 결과가 false라면 출력
	}

}
