package test1;

import java.util.Scanner;

public class B402 {

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		
		Scanner sc = new Scanner(System.in);
		String formula = sc.next();
		
		int idx = 0;
		String[] oper = {"+", "-", "*", "/"};
		double num1, num2;
		
		for (int i=0; i<oper.length; i++) {
			if (formula.contains(oper[i])) {
				idx = formula.indexOf(oper[i]);
				num1 = Double.parseDouble(formula.substring(0, idx));
				num2 = Double.parseDouble(formula.substring(idx + 1));
				
				if (num1 - (int) num1 == 0 && num2 - (int) num2 == 0) {
					if (oper[i] == "+") {
						cal.calAddition((int) num1, (int) num2);
					} else if (oper[i] == "-") {
						cal.calSubstraction((int) num1, (int) num2);
					} else if (oper[i] == "*") {
						cal.calMultiplication((int) num1, (int) num2);
					} else if (oper[i] == "/") {
						cal.calDivision((int) num1, (int) num2);
					}
				} else {
					if (oper[i] == "+") {
						cal.calAddition(num1, num2);
					} else if (oper[i] == "-") {
						cal.calSubstraction(num1, num2);
					} else if (oper[i] == "*") {
						cal.calMultiplication(num1, num2);
					} else if (oper[i] == "/") {
						cal.calDivision(num1, num2);
					}
				}
			}
		}
	}
}

class Calculation {

	public void calAddition(int num1, int num2) {
		System.out.println((int)(num1 + num2));
	}

	public void calSubstraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public void calMultiplication(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public void calDivision(int num1, int num2) {
		System.out.println(Math.round(num1 / num2 * 10) / 10.0);
	}

	public void calAddition(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	public void calSubstraction(double num1, double num2) {
		System.out.println(num1 - num2);
	}

	public void calMultiplication(double num1, double num2) {
		System.out.println(Math.round(num1 * num2 * 10) / 10.0);
	}

	public void calDivision(double num1, double num2) {
		System.out.println(Math.round(num1 / num2 * 10) / 10.0);
	}

}
