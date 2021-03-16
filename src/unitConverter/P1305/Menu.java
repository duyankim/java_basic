package unitConverter.P1305;

import java.util.Scanner;

public class Menu {
	double[] unit = {1, 100, 0.1, 100000, 160934}; // 0: cm, 1: m, 2: mm, 3: km, 4: mile

	public void printMenu() {
		int unit1, unit2, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("# Unit");
		System.out.println("1. cm");
		System.out.println("2. m");
		System.out.println("3. mm");
		System.out.println("4. km");
		System.out.println("5. mile");
		unit1 = sc.nextInt();
		unit2 = sc.nextInt();
		num = sc.nextInt();
		printResult(convertToCm(unit1), convertToCm(unit2), num);
	}
	
	public double convertToCm(int n) {
		double ratio= unit[n-1];
		return ratio;
	}
	
	public void printResult(double a, double b, int num) {
		double result = b * a * num;
		System.out.printf("%.1f", result);
	}
}
