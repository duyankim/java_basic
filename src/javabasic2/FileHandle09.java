package javabasic2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandle09 {

	public static void main(String[] args) throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\kim\\Desktop\\test.csv");

		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		String[] arr = allLine.split("\n");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("\"")) {
				splitQuote(arr[i]);
			} else {
				splitComma(arr[i]);
			}
		}
		input.close();
	}

	public static void splitComma(String str) {
		String[] arr = str.trim().split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void splitQuote(String str) {
		String[] arr = str.trim().split("\"");
		System.out.println(arr[0].substring(0, arr.length - 1));
		System.out.println(arr[1]);
		System.out.println(arr[2].substring(1, arr.length));
	}
}
