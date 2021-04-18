package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Frequency1371 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		//StringBuilder str = new StringBuilder();
		StringBuffer str = new StringBuffer();
		
		try {
			while((line = br.readLine()) != null) {
				str.append(line);
			}
			makeArr(str.toString());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void makeArr(String str) {
		char[] word = new char[str.length()];
		ArrayList<Integer> changeWordIndex = new ArrayList<Integer>();
		
		for (int j=0; j<str.length(); j++) {
			word[j] = str.charAt(j);
		}
		//System.out.println(word);

		Arrays.sort(word);
		//System.out.println(word);
		
		for (int i=0; i < word.length-1; i++) {
			if ((word[i] != word[i+1])) {
				if ((int)word[i]!=32) changeWordIndex.add(i);
			}
		}
		maxCount(changeWordIndex, word);
	}
	
	public static int maxCount(ArrayList<Integer> arr, char[] word) {
		int max = 0, count=0;
		for (int i=0; i<arr.size()-1; i++) {
			count = arr.get(i+1) - arr.get(i);
			max = max > count ? max : count;
		}
		
		//System.out.println(arr);
		//System.out.println(max);
		//System.out.println(Arrays.toString(word));
		
		for (int i=0; i<arr.size()-1; i++) {
			count = arr.get(i+1) - arr.get(i);
			if (count == max) {
				System.out.print(word[arr.get(i+1)]);
			}
		}
		return max;
	}
}
