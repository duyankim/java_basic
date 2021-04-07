package javabasic2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game8008 {
	static String[] rsp = { "Rock", "Paper", "Scissor" };

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Rock = 0, Paper = 1, Scissor = 2");
			int input = sc.nextInt();

			if (input < 0 || input > 2) {
				throw new Exception();
			}
			computerPlay(input);
		}
	}

	public static void computerPlay(int input) throws IOException {
		int randomNum = (int) (Math.random() * 3);
		game(randomNum, input);
	}

	public static void game(int computer, int user) throws IOException {
		String[] arr = new String[3];
		String u = "user win";
		String c = "computer win";
		String n = "nobody win";
		String result = null;

		if (computer == user) {
			result = n;
		} else if (user == 0) {
			result = computer == 1 ? c : u;
		} else if (user == 1) {
			result = computer == 2 ? c : u;
		} else if (user == 2) {
			result = computer == 0 ? c : u;
		}

		arr[0] = "user : " + rsp[user] +"\n";
		arr[1] = "computer : " + rsp[computer] +"\n";
		arr[2] = result +"\n\n";
		gameFileWrite(arr);
	}
	
	public static void gameFileWrite(String[] arr) throws IOException {
		String data;
		FileWriter fw = new FileWriter("C:\\Users\\kim\\Desktop\\test.csv", true);

		for (int i = 0; i < arr.length; i++) {
			data = arr[i];
			fw.write(data);
		}
		fw.close();
	}
}

