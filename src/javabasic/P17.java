package javabasic;

import java.util.Scanner;

public class P17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int x = 1,y = 1;
		//x에는 num1의 약수 저장, y에는 num2와 num1의 공약수 저장
		
		int z=0;
		z = num1> num2? num1: num2;
		System.out.println(z);
		
		for(int i=1; i<=num1; i++) {
			if(num1%i == 0) {
				x = i;
				//num1의 약수 저장
			}
			for(int j=1; j<=num2; j++) {
				
				if(num2%j == 0 && x == j) {
					//num1과 num2의 약수 중 동일한 것만 y에 저장
					y = j;
				}
			}	
		}
		System.out.println(y);
		//공약수 중 가장 큰수만 저장되어 나옴
		}
}
