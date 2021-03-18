package javabasic2;

import java.util.ArrayList;
import java.util.List;

public class P1205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1.1 2.2 -5.7 10.3 20.2 -31.2";
		double n = -5.7;
		
		String[] temp = input.split(" ");
		double min = 0;
		double result = 100.0;
		
		int i=0;
		while (i < temp.length) {
			double idx = Double.parseDouble(temp[i]);
			
			if (idx != n && Math.abs(idx-n) < result) {
				result = Math.abs(idx-n);
				System.out.println(result);
				min = idx;
			}
			i++;
		}
		System.out.println(min);
		
	}
}
