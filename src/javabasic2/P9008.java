package javabasic2;

import java.util.Scanner;

public class P9008 extends Thread {

	public P9008(int i) {
		setName("Runner " + i);
	}

	public static void main(String[] args) {
		int i, num, temp;
		double sum = 0;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (i = 0; i < num; i++) {
			Thread t = new P9008(i + 1);
			t.start();
		}
	}

	public void run() {
		double temp, sum = 0, distance;

		try {
			while (sum <= 50) {
				Thread.sleep(1000);
				temp = (int) (Math.random() * 150);
				distance = Double.parseDouble(String.format("%.1f", temp / 10.0));
				sum = Double.parseDouble(String.format("%.1f", sum += distance));

				if (sum > 50) {
					System.out.println(Thread.currentThread().getName() + " " + "(Finished)");
				} else {
					System.out.print(Thread.currentThread().getName() + " " + sum + "m\n");
				}
			}
		} catch (Exception e) {

		} finally {

		}
	}
}
