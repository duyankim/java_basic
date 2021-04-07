package javabasic2;

import java.util.Scanner;

public class ThreadP2 extends Thread {
	int input;

	public ThreadP2(int input) {
		this.input = input;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		ThreadP2 t = new ThreadP2(input);
		t.start();
		System.out.println(t.isAlive());
	}

	public void run() {
		try {
			Thread.sleep(1000 * input);
			
			System.out.println(input + "초가 지났습니다.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
