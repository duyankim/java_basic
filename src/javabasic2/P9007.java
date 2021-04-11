package javabasic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P9007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, mod, rest, i;
		ArrayList<Integer> answer = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		rest = m;

		while (true) {
			mod = rest % n;
			rest = rest / n;
			answer.add(mod);

			if (rest < n) {
				answer.add(rest);
				break;
			}
		}

		Collections.reverse(answer);
		for (i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i));
		}
	}
}