package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile{
	static Calculate cal = new Calculate();
	static ArrayList<String> priceList = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		loadFile("C:\\Users\\kim\\Desktop\\rice.csv");
		ReadFile readFile = new ReadFile();
	}

	public static void loadFile(String path) {
		String line = null;
		File file = new File(path);
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			while ((line = in.readLine()) != null) {
				String[] arr = line.split(",");
				priceList.add((arr[14]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			makeArray(priceList);
		}

	}

	public static void makeArray(ArrayList<String> arr) {
		int i = 0;
		int[] price = new int[94026];
		for (i = 1; i < arr.size(); i++) {
			price[i - 1] = Integer.parseInt(arr.get(i));
		}
		cal.sum(price);
		cal.min(price);
		cal.max(price);
	}
}

class Calculate {

	public void sum(int[] price) {
		int i;
		long sum = 0;
		for (i = 0; i < price.length; i++) {
			sum = sum + price[i];
		}
		avg(sum, price);
		System.out.println("sum : " + sum);
	}

	public void avg(long sum, int[] price) {
		double avg;
		avg = sum / price.length;
		System.out.println("average : " + avg);
	}

	public void min(int[] price) {
		int min = 50000, i;
		for (i = 0; i < price.length; i++) {
			min = min > price[i] ? price[i] : min;
		}
		System.out.println("min : " + min);
	}

	public void max(int[] price) {
		int max = 0, i;
		for (i = 0; i < price.length; i++) {
			max = max < price[i] ? price[i] : max;
		}
		System.out.println("max : " + max);
	}
}