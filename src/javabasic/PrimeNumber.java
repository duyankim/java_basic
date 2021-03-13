package javabasic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		
		for(int j=1; j<=input; j++) {
			//1부터 input값까지 해당되는 소수를 모두 찾아야 하기 때문에 input값 만큼 루프를 돎
			
			for(int i=1; i<=j; i++) {
				//소수는 1과 자신을 약수로 갖기 때문에 1~자기자신을 범위로 설정
				
				if(j % i == 0) {
					count++;
					//약수의 갯수를 센다
				}
			}
			if(count == 2) {
				//약수의 갯수가 2개인 수로 소수를 가려낸다.
				System.out.println(j);
			}
			count=0;
			//count를 다시 0으로 만들어 루프를 돌 때마다 카운트가 초기화되도록 한다.
		}
	}	
}
