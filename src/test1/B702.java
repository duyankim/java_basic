package test1;

import java.util.HashSet;

public class B702 {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		int count = 0, num;

		while(true) {
			num = (int)(Math.random() * 10 + 1);
			set1.add(num);
			System.out.printf("#%d-%d\n", count, num);
			if (set1.size() == 10) {
				break;
			}
			count++;
		}
		System.out.println("Total number of trials: " + count);
	}
}
