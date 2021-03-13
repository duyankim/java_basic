package javabasic2;

import java.util.Scanner;

public class P3007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFibonacci(n);
	}
	
	public static int fibonacci (int a) {
		int result=0;
		
		try {
			if (a == 1) {
				result = 0;
			} else if (a == 2) {
				result = 1;
			} else if (a >= 3) {
				result = fibonacci(a-1) +  fibonacci(a-2);
			}
		} catch (Exception e) {
			e.getStackTrace();
			// exception handling
		}
		return result;
	}
	
	public static void printFibonacci (int a) {
		
		for (int i=1; i<a+1; i++) {
			System.out.print(fibonacci(i)+ " ");
		}
	}
}
