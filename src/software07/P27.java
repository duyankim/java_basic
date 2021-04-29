package software07;

import java.util.ArrayList;

public class P27 {

	public static void main(String[] args) {
		/* ArrayList 2021-04-28 kopo03 김도연 */
		
		ArrayList<String> k03_AL = new ArrayList<String>();
		k03_AL.add("abc");
		k03_AL.add("abcd");
		k03_AL.add("efga");
		k03_AL.add("가나다0");
		k03_AL.add("1234");
		k03_AL.add("12rk34");
		
		System.out.printf("****************************\n");
		System.out.printf(" 시작 ArraySize %d \n", k03_AL.size());
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArraySize %d = %s\n", k03_i, k03_AL.get(k03_i));
		}
		
		k03_AL.set(3, "가라라라");
		System.out.printf("****************************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", k03_AL.size());
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArraySize %d = %s\n", k03_i, k03_AL.get(k03_i));
		}
		
		k03_AL.remove(4);
		System.out.printf("****************************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", k03_AL.size());
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArraySize %d = %s\n", k03_i, k03_AL.get(k03_i));
		}
		
		k03_AL.sort(null);
		System.out.printf("****************************\n");
		System.out.printf(" 리스트Sort ArraySize %d \n", k03_AL.size());
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArraySize %d = %s\n", k03_i, k03_AL.get(k03_i));
		}
		
		k03_AL.clear();
		System.out.printf("****************************\n");
		System.out.printf(" 전부 삭제 ArraySize %d \n", k03_AL.size());
		for (int k03_i = 0; k03_i < k03_AL.size(); k03_i++) {
			System.out.printf(" ArraySize %d = %s\n", k03_i, k03_AL.get(k03_i));
		}

	}

}