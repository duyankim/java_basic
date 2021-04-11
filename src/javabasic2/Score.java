package javabasic2;

public class Score {

	public static int getMax(int a, int b, int c, int d, int e) {
		int max;
		max = a > b ? a : b;
		max = max > c ? max : c;
		max = max > d ? max : d;
		max = max > e ? max : e;
		return max;
	}

	public static int getMin(int a, int b, int c, int d, int e) {
		int min;
		min = a < b ? a : b;
		min = min < c ? min : c;
		min = min < d ? min : d;
		min = min < e ? min : e;
		return min;
	}

	public static double getAvg(int a, int b, int c, int d, int e) {
		double avg;
		avg = (a + b + c + d + e) / 5;
		return avg;
	}

}
