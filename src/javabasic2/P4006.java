package javabasic2;

public class P4006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
		
	}
}

class Sort {
	static void quickSort(int[] arr) {
		//get array and set parameter as arr, starting index, ending index
		quickSort(arr, 0, arr.length-1);
	}
	
	static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		//make a partition index by using pivot
		
		if(start < part2 -1) {
			// if part1 have only one index, there's no need to sort it
			quickSort(arr, start, part2-1);
			// if part1 is more than one index, set ending index to part2-1
			// and recursively call quickSort
		}
		
		if(part2 < end) {
			// if part2 starting index is larger than ending index, there's nothing to sort
			quickSort(arr, part2, end);
		}
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start+end)/2];
		//make pivot in the center of index
		
		while(start <= end) {
			while (arr[start] < pivot) start++;
			// while quickSort is keep calling, keep changing starting index indeed
			while (arr[end] > pivot) end--;
			// while ending index is exceeding the range, ending point need to be smaller
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		// make a variable for swap value
		arr[start] = arr[end];
		arr[end] = tmp;
	}
	
	static void printArray(int[] arr) {
		System.out.println(arr);
	}
}
