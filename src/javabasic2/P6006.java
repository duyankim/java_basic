package javabasic2;S

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String w = sc.next();
		
		String[] arr = s.split("");
		String[] findArr = w.split(""); 
		
		getEqualWord(arr, findArr);
	}
	
	public static void getEqualWord (String[] sentence, String[] word) {
		List<String> eachWord = new ArrayList<String>();
		//equal words array from the sentence and the word
		int j;
		
		for (String w:word) {
			for (j=0; j<sentence.length; j++) {
				if (w.equals(sentence[j])) {
					eachWord.add(w);
				}
			}	
		}
		getNum(eachWord, word);
	}
	
	public static void getNum (List<String> eachWord, String[] word) {
		int i, count=0, min=100;
		
		for (String w:word) {
			for (i=0; i<eachWord.size(); i++) {
				if (eachWord.get(i).equals(w)) {
					count++; //count how many equal words exist
				}
			}
			min = min < count ? min : count; //minimum equal words number
		}
		System.out.println(min);	
	}
}