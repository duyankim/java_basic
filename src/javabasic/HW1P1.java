package javabasic;

import java.util.Scanner;

public class HW1P1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input;
	int num1= 0;
	int num2= 1;
	
	Scanner scanner = new Scanner(System.in);
	input = scanner.nextInt();

	if(input <= 0) {
		System.out.println("Please insert more than 0");
	} else if (input == 1) {
		System.out.print(num1);
	} else {
		System.out.print(num1+" ");
		System.out.print(num2+" ");
			
		for(int i=0; i<input-2; i++) {
			int num3 = num1 + num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
			}
		}
	}
}
