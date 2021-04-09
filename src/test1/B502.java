package test1;

import java.util.Scanner;

public class B502 implements CalculatorInterface {
	static B502 cal = new B502();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String formula = sc.next();
		System.out.print(getNums(cal.getOperator(formula), formula));
	}

	@Override
	public double calAddition(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double calSubstraction(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double calMultiplication(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public double calDivision(double num1, double num2) {
		return num1 / num2;
	}

	@Override
	public char getOperator(String formula) {
		char oper = 0;

		if (formula.contains("+")) {
			oper = '+';
		} else if (formula.contains("*")) {
			oper = '*';
		} else if (formula.contains("-")) {
			oper = '-';
		} else if (formula.contains("/")) {
			oper = '/';
		}
		getNums(oper, formula);
		return oper;
	}

	public static double getNums(char oper, String formula) {
		int idx = 0;
		Double num1, num2, result = null;

		if (oper == '+') {
			idx = formula.indexOf("+");
		} else if (oper == '*') {
			idx = formula.indexOf("*");
		} else if (oper == '-') {
			idx = formula.indexOf("-");
		} else if (oper == '/') {
			idx = formula.indexOf("/");
		}

		num1 = Double.parseDouble(formula.substring(0, idx));
		num2 = Double.parseDouble(formula.substring(idx + 1));

		if (oper == '+') {
			result = cal.calAddition(num1, num2);
		} else if (oper == '-') {
			result = cal.calSubstraction(num1, num2);
		} else if (oper == '*') {
			result = cal.calMultiplication(num1, num2);
		} else if (oper == '/') {
			result = cal.calDivision(num1, num2);
		}
		return result;
	}
}
