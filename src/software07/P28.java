package software07;

import java.util.ArrayList;

public class P28 {

	public static void main(String[] args) {
		/* ArrayList2 2021-04-28 kopo03 김도연 */
		
		ArrayList<Integer> k03_AL = new ArrayList<Integer>();
		int k03_testMax = 1000000;
		
		for (int k03_i = 0; k03_i < k03_testMax; k03_i++) {
			k03_AL.add((int)(Math.random()*1000000));
		}
		
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArrayList %d = %d\n", k03_i, k03_AL.get(k03_i));
		}
		
		System.out.printf("*******************************\n");
		k03_AL.sort(null);
		
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArrayList %d = %d\n", k03_i, k03_AL.get(k03_i));
		}
	}
}