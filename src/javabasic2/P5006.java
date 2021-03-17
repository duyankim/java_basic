package javabasic2;

import java.math.BigDecimal;
import java.util.Arrays;

public class P5006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		String[][] table = {{"70","80","100"},{"60","70","86"},{"54","100","82"},{"87","95","79"}};
		
		int[] Jeong = new int[3], Pyo = new int[3], Choi = new int[3], Mike = new int[3];
		int[][] students = {Jeong, Pyo, Choi, Mike};
		String[] studentsName = {"Jeong", "Pyo", "Choi", "Mike"};
		//int array of students
		
		int[] Korean = new int[4];
		int[] English = new int[4];
		int[] Math = new int[4];
		int[][] subject = {Korean, English, Math};
		String[] subjectName = {"Korean", "English", "Math"};
		//int array of subjects
		
		for (i=0; i<subject.length; i++) {
			System.out.println(subjectName[i]);
			getSubjectArr(subject[i], table, i);
			getSum(subject[i]);
			getMax(subject[i]);
			getMin(subject[i]);
		}
		//make each subject array and get result
		
		for (j=0; j<table.length; j++) {
			for(k=0; k<table[j].length; k++) {
				students[j][k] = Integer.parseInt(table[j][k]);
			}
			//make each student int array
			
			System.out.println(studentsName[j]);
			getSum(students[j]);
			getMax(students[j]);
			getMin(students[j]);
		}
	}
	
	public static void getSubjectArr(int[] score, String[][] table, int i) {
		int j;

		for (j=0; j<score.length; j++) {
			score[j] = Integer.parseInt(table[j][i]);
		}
	}
	
	public static void getSum(int[] score) {
		int i, sum = 0;
		for (i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("Summation: " + sum);
		getAvg(sum, score.length);
	}
	
	public static void getAvg(int sum, int length) {
		//double avg = Math.round((sum / length) * 100.0 )/ 100;
		//System.out.println("Average: " + avg);
		BigDecimal d1 = new BigDecimal(sum);
		BigDecimal d2 = new BigDecimal(length);
		BigDecimal avg = d1.divide(d2, 2, BigDecimal.ROUND_CEILING);
		System.out.println("Average: " + avg);

	}
	
	public static void getMax(int[] score) {
		int max, i;
		max = score[0];
		for (i=1; i<score.length; i++) {
			max = max > score[i] ? max : score[i];
		}
		System.out.println("Maximum: " + max);
	}
	
	public static void getMin(int[] score) {
		int min, i;
		min = score[0];
		for (i=1; i<score.length; i++) {
			min = min < score[i] ? min : score[i];
		}
		System.out.println("Minimum: " + min + "\n");
	}
	
}