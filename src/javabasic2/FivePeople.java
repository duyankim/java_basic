package javabasic2;

import java.util.Arrays;
import java.util.Scanner;

public class FivePeople {
	static int numOfPeople;
	static int maxKor, minKor, maxMath, minMath, maxEng, minEng;
	static double avgKor, avgEng, avgMath;
	public static String[] arr = new String[5];

	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		Person p1 = null, p2 = null, p3 = null, p4 = null, p5 = null;
		for (int i = 0; i < 5; i++) {
			String temp = sc.nextLine();
			arr[i] = temp;

			// Split the string
			String[] score = temp.split(", ");
			// name
			String name = score[0];

			// korean
			String koreanS = score[1];
			int korean = Integer.parseInt(koreanS);

			// english
			String englishS = score[2];
			int english = Integer.parseInt(englishS);

			// math
			String mathS = score[3];
			int math = Integer.parseInt(mathS);

			switch (i) {
			case 0:
				p1 = new Person(name, korean, english, math); // insert the values
				break;
			case 1:
				p2 = new Person(name, korean, english, math); // insert the values
				break;
			case 2:
				p3 = new Person(name, korean, english, math); // insert the values
				break;
			case 3:
				p4 = new Person(name, korean, english, math); // insert the values
				break;
			case 4:
				p5 = new Person(name, korean, english, math); // insert the values
				break;
			default:
				break;
			}
		}
		numOfPeople = howManyPeople(p1, p2, p3, p4, p5);
		avgKor(p1, p2, p3, p4, p5);
		avgEng(p1, p2, p3, p4, p5);
		avgMath(p1, p2, p3, p4, p5);
		maxKor(p1, p2, p3, p4, p5);
		maxEng(p1, p2, p3, p4, p5);
		maxMath(p1, p2, p3, p4, p5);
		minKor(p1, p2, p3, p4, p5);
		minEng(p1, p2, p3, p4, p5);
		minMath(p1, p2, p3, p4, p5);
	}

	public static int howManyPeople(Person p1, Person p2, Person p3, Person p4, Person p5) {
		int ret = 5;
		if (p1 != null) {
			ret--;
		}
		if (p2 != null) {
			ret--;
		}
		if (p3 != null) {
			ret--;
		}
		if (p4 != null) {
			ret--;
		}
		if (p5 != null) {
			ret--;
		}

		return 5 - ret;
	}

	public static double avgKor(Person p1, Person p2, Person p3, Person p4, Person p5) {
		avgKor = Score.getAvg(p1.getKorean(), p2.getKorean(), p3.getKorean(), p4.getKorean(), p5.getKorean());
		return avgKor;
	}

	public static double avgEng(Person p1, Person p2, Person p3, Person p4, Person p5) {
		avgEng = Score.getAvg(p1.getEnglish(), p2.getEnglish(), p3.getEnglish(), p4.getEnglish(), p5.getEnglish());
		return avgEng;
	}

	public static double avgMath(Person p1, Person p2, Person p3, Person p4, Person p5) {
		avgMath = Score.getAvg(p1.getMath(), p2.getMath(), p3.getMath(), p4.getMath(), p5.getMath());
		return avgMath;
	}

	public static int maxKor(Person p1, Person p2, Person p3, Person p4, Person p5) {
		maxKor = Score.getMax(p1.getKorean(), p2.getKorean(), p3.getKorean(), p4.getKorean(), p5.getKorean());
		return maxKor;
	}

	public static int maxEng(Person p1, Person p2, Person p3, Person p4, Person p5) {
		maxEng = Score.getMax(p1.getEnglish(), p2.getEnglish(), p3.getEnglish(), p4.getEnglish(), p5.getEnglish());
		return maxEng;
	}

	public static int maxMath(Person p1, Person p2, Person p3, Person p4, Person p5) {
		maxMath = Score.getMax(p1.getMath(), p2.getMath(), p3.getMath(), p4.getMath(), p5.getMath());
		return maxMath;
	}

	public static int minKor(Person p1, Person p2, Person p3, Person p4, Person p5) {
		minKor = Score.getMin(p1.getKorean(), p2.getKorean(), p3.getKorean(), p4.getKorean(), p5.getKorean());
		return minKor;
	}

	public static int minEng(Person p1, Person p2, Person p3, Person p4, Person p5) {
		minEng = Score.getMin(p1.getEnglish(), p2.getEnglish(), p3.getEnglish(), p4.getEnglish(), p5.getEnglish());
		return minEng;
	}

	public static int minMath(Person p1, Person p2, Person p3, Person p4, Person p5) {
		Score.getMin(p1.getMath(), p2.getMath(), p3.getMath(), p4.getMath(), p5.getMath());
		return minMath;
	}
	
	public static void getMenu2() {
		System.out.printf("Number of Students : %d\n", FivePeople.numOfPeople);
		System.out.printf("Korean(Avg, Max, Min): %f, %d, %d\n", FivePeople.avgKor, FivePeople.maxKor,
				FivePeople.minKor);
		System.out.printf("English(Avg, Max, Min): %f, %d, %d\n", FivePeople.avgEng, FivePeople.maxEng,
				FivePeople.minEng);
		System.out.printf("Math(Avg, Max, Min): %f, %d, %d\n", FivePeople.avgMath, FivePeople.maxMath,
				FivePeople.minMath);
	}

}