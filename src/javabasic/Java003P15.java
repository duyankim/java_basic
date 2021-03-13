package javabasic;

import java.util.Scanner;

public class Java003P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		float num1, num2, result=0;;
		int i;
		
		if (input.contains("*")) {
			i = input.indexOf("*");
			num1 = Float.parseFloat(input.substring(0, i));
			num2 = Float.parseFloat(input.substring(i+1));
			result = num1 * num2;
		} else if (input.contains("/")) {
			i = input.indexOf("/");
			num1 = Float.parseFloat(input.substring(0, i));
			num2 = Float.parseFloat(input.substring(i+1));
			result = num1 / num2;
		}
		System.out.println(result);
	}
}
