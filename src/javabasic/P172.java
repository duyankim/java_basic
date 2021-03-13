package javabasic;

import java.util.Scanner;

public class P172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int i=1, x=1;
		int lim = num1> num2? num2 : num1;
		//입력받은 두 수 중 작은 수를 루프의 횟수로 설정
		
		while (i <= lim) {
			if(num1 % i==0 && num2 % i ==0) {
				x = i;
				//x에는 공약수를 할당
			}
			i++;
			//i값이 증가하면서 반복문
		}
		System.out.println(x);
	}

}
