package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FrequentWord1371 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringBuffer str = new StringBuffer();
		
		try {
			while((line = br.readLine()) != null) {
				str.append(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(countChar(str.toString()));
	}
	
	public static String countChar(String str) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] count = new int[26];
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (str.charAt(i) == alphabet[j]) {
					count[j]++;
				}
			}
		}

		for (int k = 0; k < count.length; k++) {
			if(Arrays.stream(count).max().getAsInt() == count[k]) {
				result += alphabet[k];
			}
		}
		return result;
 	}
}
